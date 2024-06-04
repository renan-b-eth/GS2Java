package br.com.fiap.main;

import java.io.IOException;
import java.util.Scanner;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.model.ConsultaCNPJ;
import br.com.fiap.model.ConsultaElevacao;
import br.com.fiap.model.ConsultaViaCEP;
import br.com.fiap.service.ElevacaoService;
import br.com.fiap.service.VIACEPService;

public class TesteAPI {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		/*CNPJService cnpjService = new CNPJService();*/
		VIACEPService viaCepService = new VIACEPService();
		ElevacaoService elevacaoService = new ElevacaoService();
        
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Digite o CEP");*/
        System.out.println("Digite a latidute em formato (XXX.YY)");
        String lat = scanner.nextLine();
        System.out.println("Digite a long em formato (XXX.YY)");
        String lon = scanner.nextLine();
        
        /*ConsultaViaCEP consultaCEP = viaCepService.getConsultaViaCEP(cep);*/
        ConsultaElevacao consultaElevacao = elevacaoService.getConsultaElevacao(lat, lon);
        
        /*if (consultaCEP != null) {
            System.out.println("Logradouro: " + consultaCEP.getLogradouro() + "\nBairro: " + consultaCEP.getBairro());

        } else {
            System.out.println("CEP ERRADO.");
        }*/
        
        if (consultaElevacao != null) {
            System.out.println("Elevacao: " + consultaElevacao.getResults());

        } else {
            System.out.println("Latitude ou long errada");
        }
	}
}
