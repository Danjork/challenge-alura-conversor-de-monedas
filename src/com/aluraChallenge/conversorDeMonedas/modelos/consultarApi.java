package com.aluraChallenge.conversorDeMonedas.modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class consultarApi {

    public Conversion buscardoDeMoneda(String convertirMoneda) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/eba2e5508ca1e164b1298db7/latest/" + convertirMoneda);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversion.class);



        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}