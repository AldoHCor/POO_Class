import java.util.Scanner;

public class Main {
    public Main(){}
    public static void menu(){
        System.out.println("Type of training:");
        System.out.println("1. Resistance");
        System.out.println("2. Velocity");
        System.out.println("3. Sprinting");
    }

    public static void main(String[] args) {
        int i, d, m, y;
        boolean v = false;
        double time, max, min, average1, average2;
        Scanner keyboard = new Scanner(System.in);
        Training T1 = new Training();
        Training T2 = new Training();
        /**
        System.out.println("year ");
        y = keyboard.nextInt();
        MyDate dat = new MyDate(1,1, y);
        System.out.println(dat.leapYear());
        */
        System.out.println("Define two sessions\n> Session #1");
        // Type 1
        menu();
        i = keyboard.nextInt();
        T1.setType(i);
        // Date 1
        MyDate date1 = new MyDate();
        do {
            System.out.println("Date: DD, MM, YYYY");
            d = keyboard.nextInt();
            m = keyboard.nextInt();
            y = keyboard.nextInt();
            date1 = new MyDate(d, m, y);

            v = date1.validDate();
        }while(v != true);
        T1.setDate(date1.getWholeDate());
        // Time 1
        for(i = 0; i < 10; i++){
            System.out.println("time #" + (i + 1));
            time = keyboard.nextDouble();
            T1.setTime(i, time);
        }
        average1 = T1.averageTime();
        min = T1.minTime();
        max = T1.maxTime();
        System.out.println("Minimum: " + min + "\nMaximum: " + max + "\nAverage: " + average1);
        System.out.println("> Session #2");
        // Type 2
        menu();
        i = keyboard.nextInt();
        T1.setType(i);
        // Date 2
        MyDate date2 = new MyDate();
        do {
            System.out.println("Date: DD, MM, YYYY");
            d = keyboard.nextInt();
            m = keyboard.nextInt();
            y = keyboard.nextInt();
            date2 = new MyDate(d, m, y);
            v = date2.validDate();
        }while(!v);
        T2.setDate(date2.getWholeDate());
        // Time 2
        for(i = 0; i < 10; i++){
            System.out.println("time #" + (i + 1));
            time = keyboard.nextDouble();
            T2.setTime(i, time);
        }
        average2 = T2.averageTime();
        max = T1.maxTime();
        min = T1.minTime();
        System.out.println("Minimum: " + min + "\nMaximum: " + max + "\n Average: " + average2);

        if(average1 > average2){
            System.out.println("In average the first session was better");
        }
         else
         System.out.println("In average the second session was better");
         System.out.println(T1.toString() + "\n" + T2.toString());
    }
}