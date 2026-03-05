package ejercicios;

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
        
        /*COMPLETAR
         * CODIGO AQUI
         */
        
        scanner.close();
    }

    public static void main(String[] args) {
        Ejercicio024 ejercicio = new Ejercicio024();
        ejercicio.calculadoraNotas();
    }
}
