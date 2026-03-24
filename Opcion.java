import java.util.Scanner;

public class Opcion {
    public int op() {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        System.out.println("Ingrese la opcion 1: Taller Array, 2: Taller Matrices");
        opt = sc.nextInt();
        return opt;
    }
}