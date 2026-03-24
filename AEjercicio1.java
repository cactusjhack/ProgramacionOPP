import java.util.Scanner;
public class AEjercicio1 {
    public void Punto1() {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        System.out.println("Ingresar cantidad de productos");
        cantidad = sc.nextInt();
        String[] productos = new String[cantidad];
        int [] cantidadProductos = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingresar nombre del producto");
            productos[i] = sc.next();
            System.out.println("Ingresar la cantidad del producto");
            cantidadProductos[i] = sc.nextInt();
        } 
        System.out.println("Tienes " + cantidadProductos + " de " + productos);
        sc.close();
    }
}