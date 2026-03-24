package jar;

import java.util.Scanner;

public class Ejercicio027 {
	
	//COMPLETAR METODO
	public void decimalABinario() {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Introduce un número decimal: ");
	        int numero = scanner.nextInt();

	        if (numero < 0) {
	            System.out.println("Introduce un número positivo.");
	            scanner.close();
	            return;
	        }

	        if (numero == 0) {
	            System.out.println("Binario: 0");
	            scanner.close();
	            return;
	        }

	        String binario = "";

	        while (numero > 0) {
	            int resto = numero % 2;
	            binario = resto + binario;
	            numero = numero / 2;
	        }

	        System.out.println("Binario: " + binario);

	        scanner.close();
	    }

    public static void main(String[] args) {
        Ejercicio027 ejercicio = new Ejercicio027();
        ejercicio.decimalABinario();
    }
}