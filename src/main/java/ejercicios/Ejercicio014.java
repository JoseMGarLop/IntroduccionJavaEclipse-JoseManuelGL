package jar;

public class Ejercicio014 {
	//COMPLETAR METODO
	public long calcularFactorial(int n) {
		if (n < 0) {
            throw new IllegalArgumentException("No funciona con números negativos.");
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
	}

    public static void main(String[] args) {
    	Ejercicio014 ejercicio014 = new Ejercicio014();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        
        try {
            long factorial = ejercicio014.calcularFactorial(numero);
            System.out.println(numero + "! = " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}