import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        int montoDeseado = scanner.nextInt();
        int opcionIngresado = 0;
        double montoIngresado = 0.00;

        String Menu = """
                **************************************
                Bienvenido al conversor de moneda
                
                1) Dólar => Peso argentino
                2) Peso argentino => Dólar
                3) Dólar => Real brasileño
                4) Real brasileño => Dólar
                5) Dólar => Peso colombiano
                6) Peso colombiano => Dólar
                7) Salir
                
                Elija una opcion valida:
                ***************************************
                """;

        //System.out.print(Menu);
        opcionIngresado = opcion;

    do{
        System.out.print(Menu);

        if (opcionIngresado >= 1 && opcionIngresado <= 6){
            System.out.println("Ingresar valor a convertir");
            montoIngresado = montoDeseado;
        }

            switch (opcion){
                case 1:
                    System.out.println("funciona");
                    break;
            }



        }while(opcionIngresado != 0);
    }





}
