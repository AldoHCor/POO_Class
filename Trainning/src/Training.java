public class Training {
    private int type;
    private String date;    //is date in the format DD/MM/YYYY from the class MyDate
    private double[] times;
    //time[10] = [time1,time2, time 3, ... time 10]
    public Training(){
        int i;
        type = 0;
        times = new double[10];
        for (i=0; i < 10; i ++){
            times[i] = 0;
        }
    }
    public Training(int num, double tipos[]){
        int i;
        type = num;
        times = new double[10];
        for (i = 0; i < 10; i++){
            times[i] = tipos[i];
        }
    }
    public void setType(int tt){ //tt = types of training
        type = tt;
    }
    public int getType(){
        return type;
    }
    public void setTime(int i, double t){ // specific value in the array
     times[i] = t;
    }
    public double getTime(int i){
        return times[i];
    }
    public void setDate(String date_){
        date = date_;
    }
    public String getDate(){
        return date;
    }
    //Methods
    public double averageTime(){
        double sum = 0;
        int i;
        for(i = 0; i < 10; i++){
            sum += getTime(i);
        }
        sum = sum / 10.0;
        return sum;
    }
    public double minTime() {
        int i;
        double min = getTime(0);
        for (i = 0; i < 10; i++){
            if (getTime(i) < min) {
                min = getTime(i);
            }
        }
        return min;
    }
    public double maxTime() {
        int i;
        double max = getTime(0);
        for (i = 0; i < 10; i++){
            if (getTime(i) > max){
                max = getTime(i);
            }
        }
        return max;
    }
    public String toString(){
        String tim = "";
        int i;
        for(i = 0; i < 10; i++){
            tim = tim + times[i] + ", ";
        }
        return ("The type of training is: " + getType() + "\nThe date of the training is: " + getDate() + "\nThe times of said training are: " + tim);
    }
}
