import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


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

        System.out.print(Menu);

        

    }
}
