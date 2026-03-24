import java.util.Scanner;
public class AEjercicio12 {
    public void Punto12()  {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int[] numeros = new int[100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            suma += numeros[i];
        }
        double media = (double) suma / numeros.length;
        System.out.println("La suma de los 100 primeros numeros es: " + suma);
        System.out.println("La media de los 100 primeros numeros es: " + media);
        sc.close();
    }
}