package jar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio026 {
	
	//COMPLETAR METODO
	public void gestorUsuarios() {
		 Scanner scanner = new Scanner(System.in);
	        List<String> nombres = new ArrayList<>();

	        System.out.println("Introduce nombres de usuarios (escribe fin para terminar):");

	        while (true) {
	            System.out.print("Nombre: ");
	            String nombre = scanner.nextLine().trim();

	            if (nombre.equalsIgnoreCase("fin")) {
	                break;
	            }

	            if (!nombre.isEmpty()) {
	                nombres.add(nombre);
	            }
	        }

	        if (nombres.isEmpty()) {
	            System.out.println("No se introdujeron nombres.");
	        } else {
	            System.out.println("Cantidad de nombres introducidos: " + nombres.size());

	            String nombreMasLargo = nombres.get(0);
	            String nombreMasCorto = nombres.get(0);

	            for (String n : nombres) {
	                if (n.length() > nombreMasLargo.length()) {
	                    nombreMasLargo = n;
	                }
	                if (n.length() < nombreMasCorto.length()) {
	                    nombreMasCorto = n;
	                }
	            }

	            System.out.println("Nombre más largo: " + nombreMasLargo);
	            System.out.println("Nombre más corto: " + nombreMasCorto);
	        }

	        scanner.close();
	    }

    public static void main(String[] args) {
        Ejercicio026 ejercicio = new Ejercicio026();
        ejercicio.gestorUsuarios();
    }
}