import java.awt.Graphics;

public class Circle extends Figure{

    public Circle(){
        super();
    }

    public Circle(int x, int y){
        super(x, y);
        this.x = x - size/2;
        this.y = y - size/2;
    }

    public void paint(Graphics g){
        g.fillOval(x, y, size, size);
        g.setColor(figColor);
    }
}