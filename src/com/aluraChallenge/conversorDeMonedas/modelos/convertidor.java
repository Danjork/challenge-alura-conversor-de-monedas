package com.aluraChallenge.conversorDeMonedas.modelos;

import com.google.gson.Gson;

import java.net.http.HttpClient;

public class convertidor {
    //instanciando API
    String API_URL = "https://v6.exchangerate-api.com/v6/eba2e5508ca1e164b1298db7/latest/USD";
    HttpClient cliente = HttpClient.newHttpClient();
    Gson gson = new Gson();



    public void mostrarMenu(){
        System.out.println("********************************************");
        System.out.println("Sea bienvenido al conversor de moneda =)");

        System.out.println("1) Dólar =>> Peso argentino");
        System.out.println("2) Peso argentino =>> Dólar");
        System.out.println("3) Dólar =>> Real brasileño");
        System.out.println("4) Real brasileño =>> Dólar");
        System.out.println("5) Dólar =>> Peso colombiano");
        System.out.println("6) Peso colombiano =>> Dólar");
        System.out.println("7) Salir");

        System.out.println("Elija una opción válida:");
        System.out.println("********************************************");

    }



}
