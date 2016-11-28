import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

/**
 * Created by aldo on 1/11/16.
 */

public class Figures {
    ArrayList<Figure> objectList = new ArrayList<Figure>(0);

    public Figures(){
        objectList.add(new Figure());
    }

    public void pointInObject (int x, int y) {
        ListIterator<Figure> itr = objectList.listIterator();
        while (itr.hasNext()) {

            Figure tempObject = itr.next();

            int x1 = tempObject.getX();
            int y1 = tempObject.getY();
            int size1 = tempObject.getSize();

            if ((x > x1 && x < x1 + size1) && (y > y1 && y < y1 + size1)) {
                tempObject.setFigColor(randomColor());
                int l = objectList.indexOf(tempObject);
                System.out.println("where: " + l);

                objectList.set(l, tempObject);
            }
        }
    }

    public Color randomColor(){
        Random r = new Random();
        int r1 = r.nextInt(150) + 100;
        int r2 = r.nextInt(150) + 100;
        int r3 = r.nextInt(150) + 100;
        int r4 = r.nextInt(150) + 100;
        Color col = new Color(r1, r2, r3, r4);
        return col;
    }

    public void paint(Graphics g){
        ListIterator<Figure> itr = objectList.listIterator();
        while (itr.hasNext()){
            Figure tempObject = itr.next();
            tempObject.paint(g);
            int l = objectList.indexOf(tempObject);
            objectList.set(l, tempObject);

        }
    }

    public void addObject(Figure object){
        objectList.add(object);
    }
    public void removeObject(Figure object){
        objectList.remove(object);
    }
    public int size(){
        return objectList.size();
    }
    public void removeFirst(){
        objectList.remove(0);
    }
    public Figure returnFigure (int i){
        Figure f = objectList.get(i);
        return f;
    }
    public void setFigure(int i, Figure f){
        objectList.set(i, f);
    }
}