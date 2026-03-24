package jar;

import java.util.Scanner;

public class Ejercicio033 {
	
	//COMPLETAR METODO
	public void invertirArray() {
		 Scanner scanner = new Scanner(System.in);
	        int[] numeros = new int[5];

	      
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Introduce el número " + (i + 1) + ": ");
	            numeros[i] = scanner.nextInt();
	        }

	    
	        for (int i = 0; i < numeros.length / 2; i++) {
	            int temp = numeros[i];
	            numeros[i] = numeros[numeros.length - 1 - i];
	            numeros[numeros.length - 1 - i] = temp;
	        }

	    
	        System.out.println("Array invertido:");
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print(numeros[i] + " ");
	        }

	        scanner.close();
	    }
    
    public static void main(String[] args) {
        Ejercicio033 ejercicio = new Ejercicio033();
        ejercicio.invertirArray();
    }
    
}