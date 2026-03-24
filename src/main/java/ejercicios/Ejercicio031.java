package jar;

import java.util.Scanner;

public class Ejercicio031 {
	
	//COMPLETAR METODO
	public void sumarElementosArray() {
		 Scanner scanner = new Scanner(System.in);
	        int[] numeros = new int[5];

	       
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Introduce el número " + (i + 1) + ": ");
	            numeros[i] = scanner.nextInt();
	        }

	       
	        int suma = 0;
	        for (int i = 0; i < numeros.length; i++) {
	            suma += numeros[i];
	        }

	       
	        System.out.println("La suma de los elementos es: " + suma);

	        scanner.close();
	    }
    
    public static void main(String[] args) {
        Ejercicio031 ejercicio = new Ejercicio031();
        ejercicio.sumarElementosArray();
    }
    
}
