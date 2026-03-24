import java.util.Scanner;
import java.util.Random;
public class MEjercicio5 {
    public void Punto5() {
        Scanner Sc = new Scanner(System.in);
        System.out.println("ingrese las reservaciones hechas");
        int n = Sc.nextInt();
        int k = 0, m = n * n;
        Random ALEATORIO = new Random();
        int[] vector = new int[m];
        int[][] matriznxm = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("ingrese la reservacion " + j + "   " + i);
                matriznxm[i][j] = matriznxm[i][j] = ALEATORIO.nextInt(100);
                System.out.println(matriznxm[i][j]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                vector[k] = matriznxm[i][j];
                k++;
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.print("|" + vector[i] + "|");
        }
        Sc.close();
    }
}