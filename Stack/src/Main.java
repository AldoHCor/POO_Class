import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void menu() {
        System.out.println("Menu\n1. Push. \n2. Pop.\n3. Exit");
    }

    public static void main(String[] args) {
        int y, x;

        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Size of Stack: ");
            y = keyboard.nextInt();
        }while( y <= 0);

        Stack stack = new Stack(y);

        do {
            System.out.println("Stack: \n" + stack.toString());
            menu();
            y = keyboard.nextInt();

            switch (y) {

                case 1:
                    System.out.println("Push number: ");
                    x = keyboard.nextInt();
                    stack.Push(x);
                    break;

                case 2:
                    System.out.println("Pop ");
                    stack.Pop();
                    break;

                case 3:
                    System.out.println("Exit! ");
                    break;
            }

        } while (y != 3);
    }
}