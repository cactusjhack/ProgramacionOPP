import java.util.Scanner;

public class AEjercicio15 {
    public void Punto15()  {
        Scanner sc = new Scanner(System.in);
        String[] productos = new String[3];
        int[] unidades = new int[3];
        double[] precios = new double[3];
        double[] totales = new double[3];
        double totalFactura = 0;
        System.out.println("Introduce los datos de la factura:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Producto " + (i + 1) + ":");
            productos[i] = sc.nextLine();
            System.out.println("Unidades:");
            unidades[i] = sc.nextInt();
            System.out.println("Precio por unidad:");
            precios[i] = sc.nextDouble();
            sc.nextLine();
            totales[i] = unidades[i] * precios[i];
            totalFactura += totales[i];
        }
        System.out.println("\nFactura:");
        System.out.println("Producto \t Unidades \t Precio/Unidad \t Total");
        for (int i = 0; i < 3; i++) {
            System.out.println(productos[i] + " \t " + unidades[i] + " \t \t " + precios[i] + " \t \t " + totales[i]);
        }
        System.out.println("\nTotal de la Factura: " + totalFactura);
        sc.close();
    }
}