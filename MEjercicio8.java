import java.util.Scanner;
public class MEjercicio8 {
    public void Punto8() {
        Scanner sc = new Scanner(System.in);
        int n;
        int filaSMayor = 0, SumaMayor = 0;
        System.out.println("Ingrese la dimension de la matriz");
        n = sc.nextInt();
        int[][] numeros = new int[n][n];
        for (int i = 0; i < n; i++) {
            int sumafila = 0; 
            for (int j = 0; j < n; j++) {
                numeros[i][j] = (int) (Math.random() * 20 + 1);
                sumafila += numeros[i][j]; 
                System.out.print(numeros[i][j] + " "); 
            }
            System.out.println("Suma de la fila " + (i + 1) + ": " + sumafila); 
            if (sumafila > SumaMayor) {
                SumaMayor = sumafila;
                filaSMayor = i;
            }
        }
        System.out.println("La fila con la suma mayor es: " + (filaSMayor + 1));
        sc.close();
    }
}