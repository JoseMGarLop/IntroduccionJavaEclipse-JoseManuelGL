package jar;

import java.util.Scanner;

public class Ejercicio037 {
	
	public void contarRepeticiones() {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array: ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];

        // Leer números
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Contar repeticiones
        boolean[] contados = new boolean[n]; // Para no repetir conteo

        for (int i = 0; i < n; i++) {
            if (!contados[i]) { // Solo contar si aún no se contó
                int contador = 1;
                for (int j = i + 1; j < n; j++) {
                    if (numeros[i] == numeros[j]) {
                        contador++;
                        contados[j] = true;
                    }
                }
                System.out.println("El número " + numeros[i] + " se repite " + contador + " vez/veces.");
            }
        }

        scanner.close();
    }
    
    
    public static void main(String[] args) {
        Ejercicio037 ejercicio = new Ejercicio037();
        ejercicio.contarRepeticiones();
    }
}