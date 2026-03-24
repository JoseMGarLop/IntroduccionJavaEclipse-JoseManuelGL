package jar;

import java.util.Scanner;

public class Ejercicio024 {
	
	//COMPLETAR METODO
	public void calculadoraNotas() {
        Scanner scanner = new Scanner(System.in);
        int[] notas = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce nota " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
        }
        
        int suma = 0;
         int max = notas[0];
         int min = notas[0];

         for (int i = 0; i < notas.length; i++) {
             suma += notas[i];
             if (notas[i] > max) {
                 max = notas[i];
             }
             if (notas[i] < min) {
                 min = notas[i];
             }
         }

         double promedio = suma / (double) notas.length;

         System.out.println("\nResultados:");
         System.out.println("Promedio: " + promedio);
         System.out.println("Nota máxima: " + max);
         System.out.println("Nota mínima: " + min);

        
        scanner.close();
    }

    public static void main(String[] args) {
        Ejercicio024 ejercicio = new Ejercicio024();
        ejercicio.calculadoraNotas();
    }
}