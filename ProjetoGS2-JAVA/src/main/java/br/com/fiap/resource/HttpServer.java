package br.com.fiap.resource;

import com.fasterxml.jackson.databind.ObjectMapper; // Adicione a biblioteca Jackson para JSON

import br.com.fiap.dao.AdminDAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HttpServer {

    private static final int PORT = 8080;
    private static final ExecutorService executorService = Executors.newFixedThreadPool(4);

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        AdminDAO adminDAO = new AdminDAO(); // Implemente a lógica do AdminDAO
        RegistrationController controller = new RegistrationController(adminDAO);

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Servidor iniciado na porta " + PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Cliente conectado: " + clientSocket.getInetAddress().getHostAddress());

                executorService.submit(() -> {
					try {
						handleClientRequest(clientSocket, controller);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
            }
        }
    }

    private static void handleClientRequest(Socket clientSocket, RegistrationController controller) throws SQLException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()))) {
            String request = reader.readLine(); // Leia a primeira linha da requisição

            if (request != null) {
                String[] requestParts = request.split(" ");
                String method = requestParts[0];
                String path = requestParts[1];

                if (method.equals("POST") && path.equals("/register")) {
                    String postData = reader.readLine(); // Leia os dados POST do corpo da requisição
                    String response = controller.registerAdmin(postData); // Processe os dados e retorne uma resposta
                    writer.write(response + "\n"); // Envie a resposta para o cliente
                    writer.flush();
                } else {
                    // Manipule outras rotas ou métodos HTTP (opcional)
                	System.out.println("PASSOU AQUI");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}