import java.util.Scanner;

public class AEjercicio3 {
    public void Punto3()  {
        Scanner sc = new Scanner(System.in);
        int cursos = 0, promedio = 0, mayorPromedio = Integer.MIN_VALUE, menorPromedio = Integer.MAX_VALUE;
        System.out.println("Ingrese cantidad de cursos");
        cursos = sc.nextInt();
        int[] colegio = new int[cursos];
        int[] notas = new int[cursos * 5];
        int contadorNotas = 0;
        for (int i = 0; i < colegio.length; i++) {
            System.out.println("Ingrese notas");
            for (int j = 0; j < 5; j++) {
                colegio[i] = sc.nextInt();
                notas[contadorNotas] = colegio[i];
                contadorNotas++;
            }
            promedio = calcularPromedio(notas, contadorNotas);
            if (promedio > mayorPromedio) {
                mayorPromedio = promedio;
            }
            if (promedio < menorPromedio) {
                menorPromedio = promedio;
            }
        }
        System.out.println("El promedio mayor es: " + mayorPromedio);
        System.out.println("El promedio menor es: " + menorPromedio);
        sc.close();
    }

    public int calcularPromedio(int[] notas, int contadorNotas) {
        int suma = 0;
        for (int i = 0; i < contadorNotas; i++) {
            suma += notas[i];
        }
        return suma / contadorNotas;
        
    }
}