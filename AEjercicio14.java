import java.util.Scanner;

public class AEjercicio14 {
    public void Punto14()  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto:");
        String texto = sc.nextLine();
        System.out.println("Introduce una letra:");
        char letra = sc.next().charAt(0);
        char[] text = texto.toCharArray();
        int contador = 0;
        for (char vocal : text) {
            if (vocal == letra) {
                contador++;
            }
        }
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en el texto.");
        sc.close();
    }
}