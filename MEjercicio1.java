import java.util.Scanner;

public class MEjercicio1 { 
    public void Punto1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de días trabajados en la semana:");
        int dias = sc.nextInt();
        System.out.println("Ingrese el número de ventas del día");
        int maxVentasPorDia = sc.nextInt();
        double[][] ventasSemana = new double[dias][maxVentasPorDia];
        double totalVentas = 0;
        for (int dia = 0; dia < dias; dia++) {
            System.out.println("Ingrese el número de ventas de el día " + (dia + 1) + ":");
            int numeroDeVentas = sc.nextInt();
            for (int ventaNum = 0; ventaNum < numeroDeVentas; ventaNum++) {
                System.out.println("Ingrese el monto de la venta " + (ventaNum + 1) + " del día " + (dia + 1) + ":");
                ventasSemana[dia][ventaNum] = sc.nextDouble();
                totalVentas += ventasSemana[dia][ventaNum];
            }
        }
        System.out.println("El total de las ventas de la semana es: " + totalVentas);
        sc.close();
    }
}