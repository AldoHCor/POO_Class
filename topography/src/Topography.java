public class Topography {
    double x[], y[];
    int numDots;

    public Topography( int num){
        setNumDots(num);
        x = new double[numDots];
        y = new double[numDots];
    }
    public void setNumDots(int d){
        numDots = d;
    }
    public int getNumDots(){
        return numDots;
    }
    public void setX(double x1, int i){
        x[i] = x1;
    }
    public double getX(int i){
        return x[i];
    }
    public void setY(double y1, int i){
        y[i] = y1;
    }
    public double getY(int i){
        return y[i];
    }
    public double calculateArea(){
        double sum_up = 0, sum_down = 0, area;
        int i;
        for(i = 0; i < getNumDots(); i++) {
            if (i == (getNumDots() - 1)) {
                sum_down = sum_down + getX(i) * getY(0);
                sum_up = sum_up + getY(i) * getX(0);
            }
            else{
                sum_down = sum_down + getX(i) * getY(i + 1);
                sum_up = sum_up + getY(i) * getX(i + 1);
            }
        }
        area = Math.abs(sum_down - sum_up)/2;
        return area;
    }
}
