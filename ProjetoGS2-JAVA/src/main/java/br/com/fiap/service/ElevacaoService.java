package br.com.fiap.service;

import java.io.IOException;
import java.net.URLEncoder;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import com.google.gson.Gson;
import br.com.fiap.model.ConsultaCNPJ;
import br.com.fiap.model.ConsultaElevacao;
import br.com.fiap.model.ConsultaViaCEP;

public class ElevacaoService {
	
    public ConsultaElevacao getConsultaElevacao(String lat, String lon) throws ClientProtocolException, IOException {

        ConsultaElevacao consultaElevacao = null;
        
        String url = "https://api.opentopodata.org/v1/test-dataset?locations=56.40,110.50";
        

        HttpGet request = new HttpGet(url);
        System.out.println(request);

        try (CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
                CloseableHttpResponse response = httpClient.execute(request)) {
            HttpEntity entity = response.getEntity();
            
            if (entity != null) {
                String result = EntityUtils.toString(entity);
                Gson gson = new Gson();
                consultaElevacao = gson.fromJson(result, ConsultaElevacao.class);
            }
        }
        
        return consultaElevacao;
    }
}
