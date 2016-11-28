public class Light {
    public String color;
    public int time;
    public boolean button;

    //Builders
    public Light(){
        color = "Red";
        time = 1;
        button = false;
    }
    public Light(String col, int t, boolean b){
        color = col;
        time = t;
        button = b;
    }
    // Getter and Setters
    public void setColor(String col){
        color = col;
    }
    public String getColor(){
        return color;
    }
    public void setTime(int t){
        time = t;
    }
    public int getTime(){
        return time;
    }
    public void setButton(boolean b){
        button = b;
    }
    public boolean getButton(){
        return button;
    }
    // Timer
    public void MyTimer(int t){
        t = t * 1000;
        try {
            Thread.sleep(t);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
    // Color change
    public void ColorChange(){ // R-G-Y
        MyTimer(time);
        String col = getColor();
        if (col.equals("Green")){
            setColor("Yellow");
        }
        if (col.equals("Yellow")){
            setColor("Red");
        }
        if (col.equals("Red")) {
            setColor("Green");
        }
        System.out.println(color);
    }
    public void pushButton(){
        setColor("Red");
        System.out.println(getColor());
        MyTimer(time);
    }
    public String toString(int r){
        String message = "";
        message = "color: " + color + "\nLights time: " + time + "\nRepetitions: " + r ;
        System.out.println(message);
        return message;
    }
}