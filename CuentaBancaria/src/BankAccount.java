public class BankAccount {
    int account_num;
    String holder, residence, password;
    double credit;

    //Constructor
    public BankAccount(){
        account_num = 0;
        holder = "Jonh Doe";
        residence = "here";
        password = "1234";
        credit = 0;
    }
    public BankAccount(int num, String nam, String res, String pass, double cred){
        account_num = num;
        holder = nam;
        residence = res;
        password = pass;
        credit = cred;
    }
    //                 getter and setters
    //account
    public int getAccount_num(){
        return account_num;
    }
    public void setAccount_num(int num){
        account_num = num;
    }
    //holder
    public void setHolder(String nam){
        holder = nam;
    }
    public String getHolder(){
        return holder;
    }
    //residence
    public void setResidence(String res){
        residence = res;
    }
    public String getResidence(){
        return residence;
    }
    //password
    public String getPasword(){
        return password;
    }
    public void setPassword(String pass){
        password = pass;
    }
    // credit
    public void setCredit(double c){
        credit = c;
    }
    public double getCredit() {
        return credit;
    }

    //Methods
    public boolean comparePassword(String pass2){
        return getPasword().equals(pass2);
    }
    public String toString() {
        String state;
        state = "Account number: " + account_num + "\nHolder: " + holder + "\nResidence: " + residence + "\nCredit: " + credit + "\n";
        return state;
    }
}