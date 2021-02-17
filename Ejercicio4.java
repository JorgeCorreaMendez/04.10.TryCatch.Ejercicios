import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double nAleatorio = Math.round(Math.random() * 500 + 1);
        double nUsuario = 0;
        int contador = 0;

        do {
            System.out.print("Introduzca un número: ");
            try {
                nUsuario = leer.nextDouble();
                if (nUsuario > nAleatorio) {
                    System.out.println("El número introducido es mayor que el número aleatorio");
                } else if (nUsuario < nAleatorio) {
                    System.out.println("El número introducido es menor que el número aleatorio");
                }
                System.out.println("-----------------------");
                contador++;
            } catch (InputMismatchException e) {
                System.out.println("Error, no has introducido un número entero " + (e));
                contador++;
                leer.nextLine();
            }
        } while (nUsuario != nAleatorio);
        
        leer.close();

        System.out.println("Enorabuena el número era: " + nAleatorio + " Y te ha costado " + contador + " intentos.");

    }
}
