package jar;
import java.util.Scanner;
public class Ejercicio001 {

    // SUMA
    public double suma(double d, double e) {
        double sum = d + e;
        return sum;
    }

    // RESTA
    public double resta(double d, double e) {
        double res = d - e;
        return res;
    }

    // MULTIPLICACIÓN
    public double multiplicacion(double d, double e) {
        double mul = d * e;
        return mul;
    }

    // DIVISIÓN
    public double division(double d, double e) {
        if (e == 0) {
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        double div = d / e;
        return div;
    }

    // MOSTRAR TODAS LAS OPERACIONES
    public void mostrarTodasOperaciones(double num1, double num2) {
        System.out.println(
            suma(num1, num2) + " " +
            resta(num1, num2) + " " +
            multiplicacion(num1, num2) + " " +
            division(num1, num2)
        );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ejercicio001 calculadora = new Ejercicio001();

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        calculadora.mostrarTodasOperaciones(num1, num2);

        scanner.close();
    }
}  