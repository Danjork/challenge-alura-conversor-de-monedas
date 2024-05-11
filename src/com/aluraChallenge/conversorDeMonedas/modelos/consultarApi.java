package com.aluraChallenge.conversorDeMonedas.modelos;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class consultarApi{

    public void  buscadorDeMoneda(codigoMonedas monedaOrigen, codigoMonedas monedaFinal, codigoMonedas monedaConversion, double valoringresado) throws IOException, InterruptedException  {

        double conversion = 0.00;

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/eba2e5508ca1e164b1298db7/latest/USD"  );

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    JsonObject jsonObject = new Gson().fromJson(response.body(), JsonObject.class);
    JsonObject tasasConversion = jsonObject.getAsJsonObject("conversion_rates");

    var valorMoneda = tasasConversion.get(String.valueOf(monedaConversion)).getAsDouble();

    if (monedaOrigen.equals(monedaConversion)) {
        conversion = valoringresado / valorMoneda;

    } else {
        conversion = valoringresado * valorMoneda;
    }
    System.out.println("El monto es:  " + valoringresado + " " + monedaOrigen +" Valor del cambio: "+ conversion + " " + monedaFinal);


    }
}