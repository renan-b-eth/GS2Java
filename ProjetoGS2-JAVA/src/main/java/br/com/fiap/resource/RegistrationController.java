package br.com.fiap.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper; // Adicione a biblioteca Jackson para JSON
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import br.com.fiap.beans.Admin;
import br.com.fiap.dao.AdminDAO;

public class RegistrationController {

    private final AdminDAO adminDAO;
    private final ObjectMapper objectMapper;

    public RegistrationController(AdminDAO adminDAO) {
        this.adminDAO = adminDAO;
        this.objectMapper = new ObjectMapper();
    }

    public String registerAdmin(String admin1) throws IOException, SQLException {
        // Converta os dados JSON em um objeto User
        Admin admin = objectMapper.readValue(admin1, Admin.class);
        
        // Salvar o usuário no banco de dados usando o AdminDAO
        adminDAO.inserir(admin);

        // Retorne uma mensagem de sucesso ou erro em JSON
        Map<String, String> response = Map.of("status", "success", "message", "Usuário registrado com sucesso");
        return objectMapper.writeValueAsString(response);
    }
}