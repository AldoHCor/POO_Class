import java.util.Scanner;

public class Main {
    public Main() {
    }
    private static void menu() {
        System.out.println("1. Show state");
        System.out.println("2. On and Off");
        System.out.println("3. Up and Down volume");
        System.out.println("4. Change station");
        System.out.println("5. Change frequency");
        System.out.println("6. Exit");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Radio miRadio = new Radio();

        int opc;
        do {
            System.out.println(miRadio.toString());
            menu();
            opc = teclado.nextInt();
            switch(opc) {
                case 1:
                    System.out.println(miRadio.toString());
                    break;
                case 2:
                    miRadio.onAndOff();
                    break;
                case 3:
                    System.out.println("Change in volume: ");
                    int vol = teclado.nextInt();
                    miRadio.upDownVolume(vol);
                    break;
                case 4:
                    System.out.println("Change in station: ");
                    double est = teclado.nextDouble();
                    miRadio.changeStation(est);
                    break;
                case 5:
                    miRadio.changeFrequency();
                    break;
                case 6:
                    System.out.println("Bye");
            }
        } while(opc != 6);

    }
}
