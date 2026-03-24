package jar;

import java.util.Scanner;

public class Ejercicio022 {
	
	//COMPLETAR METODO
	public void mostrarMenu() {
		 Scanner scanner = new Scanner(System.in);
	        int opcion;

	        do {
	            System.out.println("\n- MENU -");
	            System.out.println("1. Suma");
	            System.out.println("2. Resta");
	            System.out.println("3. Multiplicación");
	            System.out.println("4. División");
	            System.out.println("5. Salir");
	            System.out.print("Elige una opción: ");
	            opcion = scanner.nextInt();

	            switch(opcion) {
	                case 1:
	                    procesarSuma(scanner);
	                    break;
	                case 2:
	                    procesarResta(scanner);
	                    break;
	                case 3:
	                    procesarMultiplicacion(scanner);
	                    break;
	                case 4:
	                    procesarDivision(scanner);
	                    break;
	                case 5:
	                    System.out.println("¡Hasta luego!");
	                    break;
	                default:
	                    System.out.println("Opción inválida. Intenta de nuevo.");
	            }
	        } while(opcion != 5);

	        scanner.close();
	    }
        
	//COMPLETAR METODO
    private void procesarSuma(Scanner scanner) {
    	System.out.print("Introduce el primer número: ");
        double a = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double b = scanner.nextDouble();
        System.out.println("Resultado: " + (a + b));
    }
    
    //COMPLETAR METODO
    private void procesarResta(Scanner scanner) {
    	System.out.print("Introduce el primer número: ");
        double a = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double b = scanner.nextDouble();
        System.out.println("Resultado: " + (a - b));
    }
    
    //COMPLETAR METODO
    private void procesarMultiplicacion(Scanner scanner) {
    	System.out.print("Introduce el primer número: ");
        double a = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double b = scanner.nextDouble();
        System.out.println("Resultado: " + (a * b));
    }
    
    //COMPLETAR METODO
    private void procesarDivision(Scanner scanner) {
    	System.out.print("Introduce el primer número: ");
        double a = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double b = scanner.nextDouble();
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre 0.");
        } else {
            System.out.println("Resultado: " + (a / b));
        }
    }
    
    public static void main(String[] args) {
        Ejercicio022 ejercicio = new Ejercicio022();
        ejercicio.mostrarMenu();
    }
}
