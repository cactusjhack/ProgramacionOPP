import java.util.Scanner;
public class Eleccion {
    public void Eleccion (int opt) {
        Scanner sc = new Scanner(System.in);
        int punto = 0;
        if (opt == 1) {
            TallerArrays ta = new TallerArrays();
            System.out.println("Ingrese el punto que desea ejecutar");
            punto = sc.nextInt();
            ta.menuArrays(punto);
        } else {
            TallerMatriz tm = new TallerMatriz();
            System.out.println("Ingresar el punto que desea ejecutar");
            punto = sc.nextInt();
            tm.menuMatriz(punto);
        }
        sc.close();
    }
}