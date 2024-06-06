package br.com.fiap.main;

import java.io.IOException;
import java.util.Scanner;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.model.ConsultaCNPJ;
import br.com.fiap.model.ConsultaFrase;
import br.com.fiap.model.ConsultaViaCEP;
import br.com.fiap.service.FraseService;
import br.com.fiap.service.ViaCepService;

public class TesteAPI {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		/*CNPJService cnpjService = new CNPJService();*/
		ViaCepService viaCepService = new ViaCepService();
		FraseService fraseService = new FraseService();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CEP");
        String cep = scanner.nextLine();
        
        ConsultaViaCEP consultaCEP = viaCepService.getConsultaViaCEP(cep);
        /*ConsultaFrase consultaFrase = fraseService.getConsultaElevacao();*/
        
        if (consultaCEP != null) {
            System.out.println("Logradouro: " + consultaCEP.getLogradouro() + "\nBairro: " + consultaCEP.getBairro());

        } else {
            System.out.println("CEP ERRADO.");
        }
        
        
        /*EXEMPLO DA SEGUNDA API CONSUMO*/
        /*if (consultaFrase != null) {
            System.out.println("id: " + consultaFrase.getId() + "\nTexto: " + consultaFrase.getText() + "\nIdioma: " + consultaFrase.getLanguage());

        } else {
            System.out.println("Latitude ou long errada");
        }*/
	}
}
