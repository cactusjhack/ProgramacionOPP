import java.util.Scanner;

public class AEjercicio2 {
    public void Punto2() {
        Scanner sc = new Scanner(System.in);
        String NombreCompleto = "";
        int[] censo = new int[3];
        System.out.println("Ingresar nombres");
        NombreCompleto = sc.next();
        for (int i = 0; i < 0; i++) {
        }
        System.out.println("Ingresar Cedula");
        censo[0] = sc.nextInt();
        System.out.println("Ingresar edad");
        censo[1] = sc.nextInt();
        System.out.println("Ingresar sexo 1: Hombre 2: Mujer");
        censo[2] = sc.nextInt();
            if (censo[1] >= 18 && censo[1] < 22 && censo[2] == 1) {
                System.out.println("La persona " + NombreCompleto + " Identificado con id " + censo[0] + " con edad " + censo[1] + " y sexo " + censo[2] + " Es apta para prestra servicio militar ");
            } else {
                System.out.println("La persona " + NombreCompleto + " Identificado con id " + censo[0] + " con edad " + censo[1] + " y sexo " + censo[2] + " No es apta para prestra servicio militar ");
            }
            sc.close();
    }
}