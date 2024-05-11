package com.aluraChallenge.conversorDeMonedas.modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class consultarApi {

    URI direccion = URI.create("https://v6.exchangerate-api.com/v6/eba2e5508ca1e164b1298db7/latest/USD");
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(direccion)
            .build();

    HttpResponse<String> response = null;

    try{
        response = client.send(request, HttpResponse.BodyHandler.ofString());

    }catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
    {
        return new Gson.fromJson(response.body(),Conversor.Class);
    }



}
