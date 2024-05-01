import com.aluraChallenge.conversorDeMonedas.modelos.convertidor;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        convertidor menu = new convertidor();

        menu.mostrarMenu();

    }
}
