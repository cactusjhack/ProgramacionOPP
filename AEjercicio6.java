import java.util.Scanner;
public class AEjercicio6 {
    public void Punto6()  {
        Scanner sc = new Scanner(System.in);
        double monto = 0, descuento = 0;
        double[] artefactos = new double[4]; 
         System.out.println("Ingresar precio de la plancha");
         artefactos[0] = sc.nextDouble();
         System.out.println("Ingresar precio de la licuadora");
         artefactos[1] = sc.nextDouble();
         System.out.println("Ingresar precio de la la vadora");
         artefactos[2] = sc.nextDouble();
         System.out.println("Ingresar precio de la cocina");
         artefactos[3] = sc.nextDouble();
         monto = artefactos[0] + artefactos[1] + artefactos[2] + artefactos[3];
         if (monto > 1200) {
            descuento = monto * 17/100;
         }
         System.out.println("la plancha vale " + artefactos[0]);
         System.out.println("la licuadora vale " + artefactos[1]);   
         System.out.println("La lavadora vale " + artefactos[2]);
         System.out.println("la cocina vale " + artefactos[3]);
         
         System.out.println("El monto a pagar es: " + monto);
         System.out.println("El descuento es: " + descuento);
         System.out.println("El pago total es: " + (monto - descuento) );
         sc.close();
    }
}