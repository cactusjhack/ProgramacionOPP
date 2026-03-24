import java.util.Scanner;

public class AEjercicio7 {
    public void Punto7()  {
        Scanner sc = new Scanner(System.in);
        int corredores = 0;
        System.out.println("Introduce el número de corredores");
        corredores = sc.nextInt();
        double[] tiempo = new double[corredores];
        for (int i = 0; i < tiempo.length; i++) {
            System.out.println("Introduce el tiempo del corredor " + (i + 1));
            tiempo[i] = sc.nextDouble();
        }
        double minTime = tiempo[0];
        int ganador = 1;
        for (int i = 0; i < tiempo.length; i++) {
            if (tiempo[i] < minTime) {
                minTime = tiempo[i];
                ganador = i + 1;
            }
        }
        System.out.println("El gandador es el corredor " + ganador +  " con un tiempo de " + minTime);
        sc.close();
    }
}