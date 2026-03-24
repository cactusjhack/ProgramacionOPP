import java.util.Scanner;

public class AEjercicio9 {
    public void Punto9() {
        Scanner sc = new Scanner(System.in);
        int Nadadores = 0;
        System.out.println("Introduce el número de nadadores");
        Nadadores = sc.nextInt();
        double[] tiempo = new double[Nadadores];
        for (int i = 0; i < tiempo.length; i++) {
            System.out.println("Introduce el tiempo del nadador " + (i + 1));
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
        System.out.println("El gandador es el nadador " + ganador +  " con un tiempo de " + minTime);
        sc.close();
    }
}