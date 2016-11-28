import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dots, i;
        double c, c2;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Number of dots: ");
        dots = keyboard.nextInt();
        Topography T1 = new Topography(dots);
        for (i = 0; i < T1.getNumDots(); i++){
            System.out.println("Point #" + (i + 1));
            System.out.print("x = ");
            c = keyboard.nextDouble();
            T1.setX(c, i);
            System.out.print("y = ");
            c2 = keyboard.nextDouble();
            T1.setY(c2, i);
        }
        System.out.println("Area:");

        System.out.println(T1.calculateArea());
/**
 for (i = 0; i < T1.getNumDots(); i+)+){
 System.out.println(T1.getX(i));
 System.out.println(T1.getY(i));
 }
 */
    }
}

