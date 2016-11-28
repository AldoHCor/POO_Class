import sun.font.TrueTypeFont;

import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void menu(){
        try {Thread.sleep(200);}
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
        System.out.println("1. Show state.");
        System.out.println("2. Initial color.");
        System.out.println("3. Light time");
        System.out.println("4. Set repetitions.");
        System.out.println("5. Run.");
        System.out.println("6. Exit.");
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String col = "";

        Light trafficLight = new Light();
        // Light myLights = new Light();
        int opt = 1, opt2 = 6;
        int Time = 0;
        int push = 0;
        do{
            menu();
            opt = keyboard.nextInt();
            switch(opt){
                case 1:
                    trafficLight.toString(opt2);
                    break;
                case 2:
                    System.out.println("Chose starting color \n Red \t Green \t Yellow \n");
                    col = keyboard.next();
                    trafficLight.setColor(col);
                    break;
                case 3:
                    System.out.println("Lights time: (Seconds) ");
                    Time = keyboard.nextInt();
                    trafficLight.setTime(Time);
                    break;
                case 4:
                    System.out.println("Repetitions: ");
                    opt2 = keyboard.nextInt();
                    break;
                case 5:
                    trafficLight.toString(opt2);
                    do{
                        trafficLight.ColorChange();
                        System.out.println("push button? \n1. Yes \n2. No");
                        push = keyboard.nextInt();
                        if (push == 1){
                            trafficLight.pushButton();
                        }
                        opt2 = opt2 - 1;
                    }while(opt2 != 0);
                    opt2 = 1;
                    break;
            }
        }while(opt != 6);
    }
}
