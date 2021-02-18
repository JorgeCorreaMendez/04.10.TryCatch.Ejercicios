import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        char[] alfabeto = new char[25];
        char caracter = 'A';

        int posicicionArray = 0;
        String cadenaFinal = "";

        final int salida = -1;

        for (int i = 0; alfabeto.length > i; i++) {
            alfabeto[i] = caracter;
            caracter++;
        }

        do {
            System.out.print("Introduzca una posición de la array: ");
            try {
                posicicionArray = leer.nextInt();
                System.out.println("-----------------------------------");
                cadenaFinal += alfabeto[posicicionArray];
            } catch (InputMismatchException e) {
                System.out.println("Error, no has introducido un número entero " + (e));
                leer.nextLine();
            } catch (ArrayIndexOutOfBoundsException e) {
                if(posicicionArray == salida){break;}
                System.out.println("Error, no has introducido un número dentro del intervalo " + (e));
                leer.nextLine();
            }
        } while (posicicionArray != salida);

        leer.close();

        System.out.println("La cadena final es = " + cadenaFinal);
    }
}