import java.util.Scanner;
public class Main {
    public Main(){}
    public static void main(String[] args) {
        int y, m, d;
        int opt = 0;
        Scanner keyboard = new Scanner(System.in);
        do{
            System.out.println("Birthday \nYear:");
            y = keyboard.nextInt();
            System.out.println("Month: ");
            m = keyboard.nextInt();
            System.out.println("Day: ");
            d = keyboard.nextInt();
            MyDate birthday = new MyDate(d, m, y);
            System.out.println("Some other date. \nYear:");
            y = keyboard.nextInt();
            System.out.println("Month: ");
            m = keyboard.nextInt();
            System.out.println("Day: ");
            d = keyboard.nextInt();
            MyDate other_Date = new MyDate(d, m, y);
            d = other_Date.getDay();
            m = other_Date.getMonth();
            y = other_Date.getYear();
            System.out.println("Is this the same date?: " + birthday.compareDate(d, m, y));
            System.out.println("Days until from your birthday " + birthday.daysUntilBirthday(other_Date.dayOfTheYear()));
            System.out.println("again? \nNo - 2");
            opt = keyboard.nextInt();
        }while(opt != 2);

    }
}