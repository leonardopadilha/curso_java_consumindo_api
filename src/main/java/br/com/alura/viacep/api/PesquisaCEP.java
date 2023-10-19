package br.com.alura.viacep.api;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PesquisaCEP {

    public String consultaAPI(String url) {
        String json = "";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            json = response.body();
        } catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        return json;
    }
}

