package jar;

import java.util.Scanner;

public class Ejercicio034 {
	
	//COMPLETAR METODO
	public void buscarNumeroArray() {
		 Scanner scanner = new Scanner(System.in);
	        int[] numeros = new int[5];

	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Introduce el número " + (i + 1) + ": ");
	            numeros[i] = scanner.nextInt();
	        }

	        System.out.print("Introduce el número a buscar: ");
	        int buscado = scanner.nextInt();

	        boolean encontrado = false;


	        for (int i = 0; i < numeros.length; i++) {
	            if (numeros[i] == buscado) {
	                encontrado = true;
	                break;
	            }
	        }

	        if (encontrado) {
	            System.out.println("El número " + buscado + " sí está en el array.");
	        } else {
	            System.out.println("El número " + buscado + " no está en el array.");
	        }

	        scanner.close();
	    }
    
    public static void main(String[] args) {
        Ejercicio034 ejercicio = new Ejercicio034();
        ejercicio.buscarNumeroArray();
    }
    
}