import java.util.Scanner;

public class MEjercicio7 {
    public void Punto7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar la cantidad de puntos de ventas");
        int n = sc.nextInt();
        System.out.println("Ingresar reporte de cifras");
        int m = sc.nextInt();
        int contcero = 0, contpositivo = 0, contnegativo = 0;
        int[][] matriznxm = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("ingresa el numero en " + i + "   " + j);
                matriznxm[i][j] = (int) (Math.random()* 200)-100;
                System.out.println(matriznxm[i][j]);
            } 
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matriznxm[i][j] == 0) {
                    contcero++;
                }
                if (matriznxm[i][j] > 0) {
                    contpositivo++;
                }
                if (matriznxm[i][j] < 0) {
                    contnegativo++;
                }
            }
        }
        System.out.println("cantidad de numeros que son 0 = " + contcero);
        System.out.println("cantidad de numeros que son positivos = " + contpositivo);
        System.out.println("cantidad de numeros que son negativos = " + contnegativo);
        sc.close();
    }
}