import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main{

    Scanner in = new Scanner(new FileReader("filename.txt"));


    /**
    public static void main(String[] args) {
        int year, month, day;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("año, mes, dia");
        year = keyboard.nextInt();
        month = keyboard.nextInt();
        day = keyboard.nextInt();
        MyDate this_date = new MyDate(day, month, year);
        System.out.println("valido" + this_date.validDate());
        System.out.println("año biciesto: " + this_date.leapYear());
        System.out.println("days: " + this_date.dayOfTheYear());

    }
*/
}
