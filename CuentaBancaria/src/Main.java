import java.util.Scanner;
public class Main{
    public Main(){
    }
    public static void menu(){
        System.out.println("1. Show account information");
        System.out.println("2. Change password");
        System.out.println("3. Show credit");
        System.out.println("4. Exit");
    }
    public static void main(String[] args){
        int opt = 1, account_num;
        Scanner keyboard = new Scanner(System.in);
        String holder1, residence1, password1;
        double credit1;
        boolean pass;

        System.out.println("Number of account: ");
        account_num = keyboard.nextInt();
        System.out.println("Holder's name: ");
        holder1 = keyboard.next();
        System.out.println("Residence: ");
        residence1 = keyboard.next();
        System.out.println("Password");
        password1 = keyboard.next();
        System.out.println("Credit: ");
        credit1 = keyboard.nextDouble();
        BankAccount MyAccount = new BankAccount(account_num, holder1, residence1, password1, credit1);

        System.out.println("\tWelcome");
        do {
            menu();
            opt = keyboard.nextInt();

            switch (opt) {
                case 1:
                    System.out.print(MyAccount.toString());
                    break;
                case 2:
                    System.out.println("old Password");
                    password1 = keyboard.next();
                    pass = MyAccount.comparePassword(password1);
                    if (pass){
                        System.out.println("New password: ");
                        password1 = keyboard.next();
                        MyAccount.setPassword(password1);
                        System.out.println("Valid \nPassword changed");
                    }
                    else{
                        System.out.println("Invalid");
                    }
                    break;
                case 3:
                    System.out.println("The credit is: " + MyAccount.getCredit());
                    break;
                case 4:
                    System.out.println("Bye");
                    break;
            }
        } while(opt != 4);
    }
}