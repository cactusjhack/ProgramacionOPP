import java.util.Scanner;
public class MEjercicio9 {
    public void Punto9()  {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Ingresar la dimension de la matriz");
        n = sc.nextInt();
        int[][] numeros = new int[n][n];
        int mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        int poMayorI = 0, poMayorJ = 0, poMenorI = 0, poMenorJ = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numeros[i][j] = (int) (Math.random() * 20 + 1);
                System.out.print(numeros[i][j] + " ");
                System.out.println(  );
                if (numeros[i][j] > mayor) {
                    mayor = numeros[i][j];
                    poMayorI = i;
                    poMayorJ = j;
                }
                if (numeros[i][j] < menor) {
                    menor = numeros[i][j];
                    poMenorI = i;
                    poMenorJ = j;
                }
            }
        }
        System.out.println("El numero mayor es " + mayor + " en la posicion [" + poMayorI + "][" + poMayorJ + "]");
        System.out.println("El numero menor es " + menor + " en la posicion [" + poMenorI + "][" + poMenorJ + "]");
        System.out.println("Columna del mayor valor:");
        for (int i = 0; i < n; i++) {
            System.out.println(numeros[i][poMayorJ]);
        }
        System.out.println("Fila del mayor valor:");
        for (int j = 0; j < n; j++) {
            System.out.print(numeros[poMayorI][j] + " ");
        }
        System.out.println();
        sc.close();
    }
}