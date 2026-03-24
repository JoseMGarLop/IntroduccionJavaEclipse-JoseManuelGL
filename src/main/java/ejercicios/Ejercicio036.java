package jar;

import java.util.Scanner;

public class Ejercicio036 {
	
	//COMPLETAR METODO
	public void comprobarPalindromo() {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Introduce el tamaño del array: ");
	        int n = scanner.nextInt();

	        int[] numeros = new int[n];

	        for (int i = 0; i < n; i++) {
	            System.out.print("Introduce el número " + (i + 1) + ": ");
	            numeros[i] = scanner.nextInt();
	        }

	        boolean esPalindromo = true;
	        for (int i = 0; i < n / 2; i++) {
	            if (numeros[i] != numeros[n - 1 - i]) {
	                esPalindromo = false;
	                break;
	            }
	        }

	        if (esPalindromo) {
	            System.out.println("El array sí es palíndromo.");
	        } else {
	            System.out.println("El array no es palíndromo.");
	        }

	        scanner.close();
	    }
    
    public static void main(String[] args) {
        Ejercicio036 ejercicio = new Ejercicio036();
        ejercicio.comprobarPalindromo();
    }
    
}