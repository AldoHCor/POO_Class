import java.awt.*;
import java.util.Random;

public class Figure{

    protected Color figColor;
    protected int x, y, size;

    public Figure(){
        figColor = Color.WHITE;
        x = y = 0;
        size = 0;
    }

    public Figure(int x, int y){
        this.x = x;
        this.y = y;
        Random r = new Random();
        int r1 = r.nextInt(150) + 100;
        int r2 = r.nextInt(150) + 100;
        int r3 = r.nextInt(150) + 100;
        int r4 = r.nextInt(150)+ 100;
        size = r.nextInt(100) + 50;
        figColor = new Color(r1, r2, r3, r4);
        System.out.println("color: " + r1 + " " + r2 + " " + r3 + " " + r4);
    }

    public void paint(Graphics g){}


    public Color getFigColor() {
        return figColor;
    }
    public void setFigColor(Color figColor) {
        this.figColor = figColor;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public boolean pointInObject (int x, int y){
        //ListIterator<Figure> itr = objectList.listIterator();
        boolean p = false;
        //  while (itr.hasNext()){

//            Figure tempObject = itr.next();

        int x1 = getX();
        int y1 = getY();
        int size1 = getSize();

        if ((x > x1 && x < x1 + size1) && (y > y1 && y < y1 + size1)){
            p = true;
            /**
             Random r = new Random();
             int r1 = r.nextInt(150) + 100;
             int r2 = r.nextInt(150) + 100;
             int r3 = r.nextInt(150) + 100;
             int r4 = r.nextInt(150) + 100;
             Color col = new Color(r1, r2, r3, r4);

             tempObject.setFigColor(col);
             int l = objectList.indexOf(tempObject);
             System.out.println("where: " + l);
             objectList.set(l, tempObject);
             */


        }
        return p;
    }
}