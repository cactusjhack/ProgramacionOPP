import java.util.Scanner;
public class AEjercicio13 {
    public void Punto13() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("ingresar la dimension deseada");
        n = sc.nextInt();
        int[] numeros = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 300 + 1);
            System.out.println(numeros[i]);
        }
        int digito = 0;
        do {
            System.out.println("Ingesar el digito que desea filtrar");
            digito = sc.nextInt();
        } while (digito < 0 || digito > 9);
        int[] filtrados = new int[n];
        int indice = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 10 == digito) {
                filtrados[indice] = numeros[i];
                indice++;
            }
        }
        System.out.println("Numeros que acaban en " + digito + ":");
        for (int i = 0; i < indice; i++) {
            System.out.println(filtrados[i]);
        }
        sc.close();
    }
}