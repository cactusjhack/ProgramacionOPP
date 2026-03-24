public class TallerMatriz {
    public void menuMatriz(int opt) {
        switch (opt) {
            case 1:
                MEjercicio1 p1 = new MEjercicio1();
                p1.Punto1();
                break;
            case 2:
                MEjercicio2 p2 = new MEjercicio2();
                p2.Punto2();
                break;
            case 3:
                MEjercicio3 p3 = new MEjercicio3();
                p3.Punto3();
                break;
            case 4:
                System.out.println("Pagina en mantenimiento");
                break;
            case 5:
                MEjercicio5 p5 = new MEjercicio5();
                p5.Punto5();
                break;
            case 6:
                MEjercicio6 p6 = new MEjercicio6();
                p6.Punto6();
                break;
            case 7:
                MEjercicio7 p7 = new MEjercicio7();
                p7.Punto7();
                break;
            case 8:
                MEjercicio8 p8 = new MEjercicio8();
                p8.Punto8();
                break;
            case 9:
                MEjercicio9 p9 = new MEjercicio9();
                p9.Punto9();
                break;
            case 10:
                System.out.println("Pagina en mantenimiento");
                break;
                case 11:
                MEjercicio11 p11 = new MEjercicio11(); 
                p11.Punto11();
            default:
                break;
        }
    }
}
