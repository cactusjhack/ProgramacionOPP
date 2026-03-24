import java.util.Scanner;
public class AEjercicio10 {
    public void Punto10() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];  
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 99 + 0);
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        sc.close();
    }
}