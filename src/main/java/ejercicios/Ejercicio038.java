package jar;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio038 {
	// COMPLETAR METODO: Genera numero aleatorio 1-50
	public int generarNumeroSecreto() {
        Random random = new Random();
        return random.nextInt(50) + 1;
    }
    
    // COMPLETAR METODO: Compara intento con secreto y dice resultado
    public String comprobarIntento(int intento, int numeroSecreto) {
    	if (intento < numeroSecreto) {
            return "El número es mayor.";
        } else if (intento > numeroSecreto) {
            return "El número es menor.";
        } else {
            return "¡Correcto! Has adivinado el número.";
        }
    }

    // COMPLETAR METODO: Funcion principal que usa ambos modulos
    public void adivinarNumero() {
    	Scanner scanner = new Scanner(System.in);
        int numeroSecreto = generarNumeroSecreto();
        int intento;
        int intentos = 0;

        System.out.println("- ADIVINA EL NÚMERO (1-50) -");

        do {
            System.out.print("Introduce tu respuesta: ");
            intento = scanner.nextInt();
            intentos++;

            String resultado = comprobarIntento(intento, numeroSecreto);
            System.out.println(resultado);

        } while (intento != numeroSecreto);

        System.out.println("¡Has acertado en " + intentos + " intento(s)!");
        scanner.close();
    }
    
    public static void main(String[] args) {
        Ejercicio038 ejercicio = new Ejercicio038();
        ejercicio.adivinarNumero();
    }
}