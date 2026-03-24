import java.util.Scanner;

public class AEjercicio4 {
    public void Punto4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad de estudiantes");
        int estudiantes = sc.nextInt();
        int[] edades = new int[estudiantes];
        int pony = 0, mini = 0, tercera = 0, noparticicpa = 0;
        for (int i = 0; i < estudiantes; i++) {
            System.out.println("Ingrese edad del estudiante " + (i + 1));
            edades[i] = sc.nextInt();
            if (edades[i] >= 9 && edades[i] <= 13) {
                pony++;
            } else if (edades[i] >= 14 && edades[i] < 15) {
                mini++;
            } else if (edades[i] >= 15 && edades[i] < 18) {
                tercera++;
            } else if (edades[i] > 18){
                noparticicpa++;
            }
        }
        System.out.println("Cantidad de estudiantes en la categoría ponny: " + pony);
        System.out.println("Cantidad de estudiantes en la categoría mini: " + mini);
        System.out.println("Cantidad de estudiantes en la categoría 3ª: " + tercera);
        System.out.println("Cantidad de estudiates que no pueden participar: " + noparticicpa);
        sc.close();
    }
}