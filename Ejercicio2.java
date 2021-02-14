import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        char signo;

        boolean err = true;

        while (err) {
            System.out.print("Introduce el primer número: ");
            try {
                num1 = leer.nextInt();
                err = false;
            } catch (InputMismatchException e) {
                System.out.println("Error, no has introducido un número entero " + (e));
                leer.nextLine();
            }
        }

        err = true;

        while (err) {
            System.out.print("Introduce el segundo número: ");
            try {
                num2 = leer.nextInt();
                int resultado = num1 / num2;
                err = false;
            } catch (InputMismatchException e) {
                System.out.println("Error, no has introducido un número entero " + (e));
                leer.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Error, no se puede dividir un número entre 0 " + (e));
            }
        }

        err = true;

        while (err) {
            System.out.print("Introduce el signo: ");
            signo = leer.next().charAt(0);
            switch (signo) {
                case '+':
                    System.out.println(num1 + num2);
                    err = false;
                    break;

                case '-':
                    System.out.println(num1 - num2);
                    err = false;
                    break;

                case '*':
                    System.out.println(num1 * num2);
                    err = false;
                    break;

                case '/':
                    System.out.println(num1 / num2);
                    err = false;
                    break;

                case '%':
                    System.out.println(num1 % num2);
                    err = false;
                    break;

                default:
                    System.out.println("Error, El operador no es valido");
            }
        }
        leer.close();
    }
}
