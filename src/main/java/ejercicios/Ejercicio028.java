package jar;

import java.util.Scanner;

public class Ejercicio028 {
	
	private double saldo = 1000.0;  // Saldo inicial
	
	//COMPLETAR METODO
    public void cajeroAutomatico() {
    	Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n- CAJERO AUTOMÁTICO -");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    ingresarDinero(scanner);
                    break;
                case 3:
                    retirarDinero(scanner);
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        scanner.close();    
    }
    
    //COMPLETAR METODO
    private void consultarSaldo() {
    	System.out.println("Saldo actual: " + saldo + " €");
    }
    
    //COMPLETAR METODO
    private void ingresarDinero(Scanner scanner) {
    	 System.out.print("Cantidad a ingresar: ");
         double cantidad = scanner.nextDouble();

         if (cantidad > 0) {
             saldo += cantidad;
             System.out.println("Ingreso realizado. Nuevo saldo: " + saldo + " €");
         } else {
             System.out.println("No se puede ingresar esa cantidad.");
         }
     }
    
    //COMPLETAR METODO
    private void retirarDinero(Scanner scanner) {
    	System.out.print("Cantidad a retirar: ");
        double cantidad = scanner.nextDouble();

        if (cantidad <= 0) {
            System.out.println("No se puede retirar esa cantidad.");
        } else if (cantidad > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= cantidad;
            System.out.println("Retirada realizada. Nuevo saldo: " + saldo + " €");
        }
    }

    public static void main(String[] args) {
        Ejercicio028 ejercicio = new Ejercicio028();
        ejercicio.cajeroAutomatico();
    }
    
}
