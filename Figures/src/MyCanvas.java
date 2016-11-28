import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ListIterator;
import java.util.Random;

public class MyCanvas extends Canvas  implements MouseListener {
    private static final long serialVersionUID = 1L;
    private Color backgroundColor;
    private Figures figs;
    private Figure obj;
    private int mouseX, mouseY;
    private boolean whatFig = true;
    private int objInCanvas = 5;

    public MyCanvas(){
        super();
        backgroundColor = Color.WHITE;
        figs = new Figures();
        addMouseListener(this);

    }

    public void mouseClicked (MouseEvent e){

        System.out.println("coor: " + e.getX() + "  " + e.getY());
        repaint();
        setMouseX(e.getX());
        setMouseY(e.getY());

    }


    public void paint(Graphics g){
        figs.paint(g);
        setBackground(backgroundColor);
        boolean pointed = false;
        figs.pointInObject(mouseX, mouseY);

        for(int i = 0; i < figs.size(); i++) {

            Figure f = figs.returnFigure(i);
            boolean point = f.pointInObject(mouseX, mouseY);

            if (point) {

                //f.setFigColor(figs.randomColor());

                figs.setFigure(i, f);
                pointed = true;
            }
        }
        if (pointed){
            System.out.println("pointed");
        }
        else{
            if (whatFig) {
                obj = new Square(mouseX, mouseY);
                figs.addObject(obj);
                whatFig = false;
            } else {
                obj = new Circle(mouseX, mouseY);
                figs.addObject(obj);
                whatFig = true;
            }
        }

        System.out.println("size: " + obj.getSize());

        if (figs.size() > objInCanvas){
            figs.removeFirst();
        }


        figs.paint(g);
    }


    public void mouseExited (MouseEvent e){}
    public void mouseReleased (MouseEvent e){}
    public void mouseEntered (MouseEvent e){}
    public void mousePressed (MouseEvent e){}
    public double getMouseX(){
        return mouseX;
    }
    public double getMouseY() {
        return mouseY;
    }
    public void setMouseX(int mouseX){
        this.mouseX = mouseX;
    }
    public void setMouseY(int mouseY) {
        this.mouseY = mouseY;
    }
    public Color getBackgroundColor() {
        return backgroundColor;
    }
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}