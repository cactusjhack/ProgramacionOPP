import java.util.Scanner;
public class MEjercicio3 {
    public void Punto3()  {
        Scanner sc = new Scanner(System.in);
        int numDiasSemana = 5;
        int numSemanas = 4;
        int[][] ventasPorDia = new int[numDiasSemana][numSemanas];
        for (int dia = 0; dia < numDiasSemana; dia++) {
            for (int semana = 0; semana < numSemanas; semana++) {
                System.out.print("Ingrese las ventas del día " + (dia + 1) + " en la semana " + (semana + 1) + ": ");
                ventasPorDia[dia][semana] = sc.nextInt();
            }
        }
        int[] ventasPorSemana = new int[numSemanas];
        for (int semana = 0; semana < numSemanas; semana++) {
            for (int dia = 0; dia < numDiasSemana; dia++) {
                ventasPorSemana[semana] += ventasPorDia[dia][semana];
            }
        }
        System.out.println("\nVentas por semana:");
        for (int semana = 0; semana < numSemanas; semana++) {
            System.out.println("Semana " + (semana + 1) + ": " + ventasPorSemana[semana]);
        }
        int[] ventasPorDiaTotal = new int[numDiasSemana];
        for (int dia = 0; dia < numDiasSemana; dia++) {
            for (int semana = 0; semana < numSemanas; semana++) {
                ventasPorDiaTotal[dia] += ventasPorDia[dia][semana];
            }
        }
        System.out.println("\nVentas por día:");
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        for (int dia = 0; dia < numDiasSemana; dia++) {
            System.out.println(diasSemana[dia] + ": " + ventasPorDiaTotal[dia]);
        }
        sc.close();
    }
}