import com.aluraChallenge.conversorDeMonedas.modelos.codigoMonedas;
import com.aluraChallenge.conversorDeMonedas.modelos.consultarApi;

import java.io.IOException;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        consultarApi consultaTasa = new consultarApi();

        int opcionIngresado = 0;
        double montoIngresado = 0.00;



    do{
        System.out.println("**************************************");
        System.out.println("Bienvenido al conversor de moneda");
        System.out.println("1) Dólar => Peso argentino");
        System.out.println("2) Peso argentino => Dólar");
        System.out.println("3) Dólar => Real brasileño");
        System.out.println("4) Real brasileño => Dólar");
        System.out.println("5) Dólar => Peso colombiano");
        System.out.println("6) Peso colombiano => Dólar");
        System.out.println("7) Salir");
        System.out.println("Elija una opcion valida: ");
        int opcion = scanner.nextInt();
        System.out.println("***************************************");


       opcionIngresado = opcion;

        if (opcionIngresado >= 1 && opcionIngresado <= 6){
            System.out.println("Ingresar valor a convertir");
            int montoDeseado = scanner.nextInt();
            montoIngresado = montoDeseado;
        }

            switch (opcion){
                case 1:

                    consultaTasa.buscadorDeMoneda(codigoMonedas.USD, codigoMonedas.ARS, codigoMonedas.ARS, montoIngresado);
                break;
                case 2:
                    consultaTasa.buscadorDeMoneda(codigoMonedas.ARS, codigoMonedas.USD, codigoMonedas.ARS, montoIngresado);

                    break;
                case 3:
                    consultaTasa.buscadorDeMoneda(codigoMonedas.BRL, codigoMonedas.USD, codigoMonedas.BRL , montoIngresado);
                break;
                case 4:
                    consultaTasa.buscadorDeMoneda(codigoMonedas.USD, codigoMonedas.BRL, codigoMonedas.BRL , montoIngresado);
                    break;
                case 5:
                    consultaTasa.buscadorDeMoneda(codigoMonedas.COP, codigoMonedas.USD, codigoMonedas.COP , montoIngresado);
                    break;
                case 6:
                    consultaTasa.buscadorDeMoneda(codigoMonedas.USD, codigoMonedas.COP, codigoMonedas.COP , montoIngresado);
                    break;
                case 7:
                    System.out.println("Gracias por usarme");
                    break;
                default:
                    System.out.println("Opción invalida intente de nuevo");
            }



        }while(opcionIngresado != 7);
    }





}
