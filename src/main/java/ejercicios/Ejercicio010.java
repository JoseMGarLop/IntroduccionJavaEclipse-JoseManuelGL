package jar;

public class Ejercicio010 {

    // Mostrar números del 1 al 100 con for
    public void mostrarFor() {
        System.out.println("Usando for:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    // Mostrar números del 1 al 100 con while
    public void mostrarWhile() {
        System.out.println("Usando while:");
        int i = 1;
        while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");
    }

    // Mostrar números del 1 al 100 con do-while
    public void mostrarDoWhile() {
        System.out.println("Usando do-while:");
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 100);
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Ejercicio010 ejercicio010 = new Ejercicio010();
        ejercicio010.mostrarFor();
        ejercicio010.mostrarWhile();
        ejercicio010.mostrarDoWhile();
    }
}