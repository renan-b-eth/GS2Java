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
import br.com.fiap.model.ConsultaFrase;
import br.com.fiap.model.ConsultaViaCEP;

public class FraseService {
	
    public ConsultaFrase getConsultaElevacao() throws ClientProtocolException, IOException {

        ConsultaFrase consultaFrase = null;
        
        String url = "https://uselessfacts.jsph.pl/api/v2/facts/random";
        

        HttpGet request = new HttpGet(url);
        System.out.println(request);

        try (CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
                CloseableHttpResponse response = httpClient.execute(request)) {
            HttpEntity entity = response.getEntity();
            
            if (entity != null) {
                String result = EntityUtils.toString(entity);
                Gson gson = new Gson();
                consultaFrase = gson.fromJson(result, ConsultaFrase.class);
            }
        }
        
        return consultaFrase;
    }
}
