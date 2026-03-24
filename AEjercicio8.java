import java.util.Scanner;
import java.util.Arrays;
public class AEjercicio8 {
    public void Punto8() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Ingrese la cantidad de numeros que desea ingresar");
        n = sc.nextInt();

        int[] numeros = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingrese numero");
            numeros[i] = sc.nextInt();
        }
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        sc.close();
    }
}