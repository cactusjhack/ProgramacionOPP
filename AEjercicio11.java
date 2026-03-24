import java.util.Scanner;
public class AEjercicio11 {
    public void Punto11()  {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int numeroMayor = 0;
        System.out.println("Ingresar la dimension deseada");
        n = sc.nextInt();
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = (int) (Math.random() * 50 + 1);
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > numeroMayor ) {
                numeroMayor = numeros[i];
            }
            System.out.println("Los numeros son: " + numeros[i]);
        } 
        System.out.println("El numero mayor es: " + numeroMayor);
        sc.close();
    }
}