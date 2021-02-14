import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int dividiendo = 0;
        int divisor = 0;
        int cociente = 0;
        int resto = 0;

        boolean error = true;

        while (error) {
            System.out.print("Introduzca el dividiendo: ");
            try {
                dividiendo = leer.nextInt();
                error = false;
            } catch (InputMismatchException e) {
                leer.nextLine();
                System.out.println("Error, no has introducido un número entero en el dividiendo"  + (e));
            }
        }

        error = true;

        while (error) {
            System.out.print("Introduzca el divisor: ");
            try {
                divisor = leer.nextInt();
                cociente += dividiendo / divisor;
                resto += dividiendo % divisor;
                error = false;

                System.out.println("El resultado del cociente: " + cociente + " y el resultado del resto es: " + resto);

            } catch (ArithmeticException e) {
                System.out.println("Error, no se puede dividir entre 0 " + (e));
                leer.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error, no has introducido un número entero en el divisor" + (e));
                leer.nextLine();
            }
        }

        leer.close();

    }
}