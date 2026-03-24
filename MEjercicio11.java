import java.util.Scanner;
import java.util.Random;
public class MEjercicio11 {
    public void Punto11() {
        Scanner scanner = new Scanner(System.in);
        Random aleatorio = new Random();
        System.out.println("INGRESA LA CANTIDAD DE ESTUDIANTES");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] vpromedio = new int[n];
        String[][] matriznxm = new String[n][6];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre del estudiante: ");
            matriznxm[i][0] = scanner.nextLine();
            int promedio = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.println("Estudiante " + matriznxm[i][0] + ", Nota #" + j);
                matriznxm[i][j] = String.valueOf(aleatorio.nextInt(5));
                System.out.println(matriznxm[i][j]);
                promedio += Integer.parseInt(matriznxm[i][j]);
            }
            vpromedio[i] = promedio / 5;
        }
        int promediomayor = vpromedio[0];
        int pp = 0;
        for (int i = 1; i < n; i++) {
            if (vpromedio[i] > promediomayor) {
                promediomayor = vpromedio[i];
                pp = i;
            }
        }
        int mayorn3 = Integer.parseInt(matriznxm[0][3]);
        int p3 = 0;
        for (int i = 1; i < n; i++) {
            if (Integer.parseInt(matriznxm[i][3]) > mayorn3) {
                mayorn3 = Integer.parseInt(matriznxm[i][3]);
                p3 = i;
            }
        }
        int mayorn1 = Integer.parseInt(matriznxm[0][1]);
        int p1 = 0;
        for (int i = 1; i < n; i++) {
            if (Integer.parseInt(matriznxm[i][1]) > mayorn1) {
                mayorn1 = Integer.parseInt(matriznxm[i][1]);
                p1 = i;
            }
        }
        int mayorn5 = Integer.parseInt(matriznxm[0][5]);
        int p5 = 0;
        for (int i = 1; i < n; i++) {
            if (Integer.parseInt(matriznxm[i][5]) > mayorn5) {
                mayorn5 = Integer.parseInt(matriznxm[i][5]);
                p5 = i;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Estudiante " + matriznxm[i][0] + " tiene un promedio de " + vpromedio[i]);
        }
        System.out.println("La mejor nota del parcial #3 es " + mayorn3 + ", corresponde a " + matriznxm[p3][0]);
        System.out.println("La mejor nota del parcial #1 es " + mayorn1 + ", corresponde a " + matriznxm[p1][0]);
        System.out.println("La mejor nota del parcial #5 es " + mayorn5 + ", corresponde a " + matriznxm[p5][0]);
        System.out.println("El mejor promedio es " + promediomayor + ", corresponde a " + matriznxm[pp][0]);
        scanner.close();
    }
}