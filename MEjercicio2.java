import java.util.Scanner;

public class MEjercicio2 {
    public void Punto2()  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de deportistas:");
        int n = sc.nextInt();
        double[][] tiempos = new double[n][2];
        double tiempo, distancia, menorDistancia = Double.MAX_VALUE;
        int deportistaMenorDistancia = -1;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el tiempo que el deportista " + (i + 1) + " tarda en recorrer 100 metros:");
            tiempo = sc.nextDouble();
            tiempos[i][0] = tiempo;
            distancia = 100 / tiempo;
            tiempos[i][1] = distancia;
            if (distancia < menorDistancia) {
                menorDistancia = distancia;
                deportistaMenorDistancia = i;
            }
        }
        System.out.println("El deportista que recorre la menor distancia en 10 segundos es el competidor " + (deportistaMenorDistancia + 1));
        System.out.println("Distancia recorrida: " + menorDistancia + " metros");
        sc.close();
    }
}