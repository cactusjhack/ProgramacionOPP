import java.util.Scanner;

public class AEjercicio5 {
    public void Punto5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = sc.nextLine();
        int[] arreglo = new int[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            arreglo[i] = palabra.charAt(i);
        }
        int dimension = arreglo.length;
        System.out.println("La dimensión de la palabra es: " + dimension);
        sc.close();
    }
}