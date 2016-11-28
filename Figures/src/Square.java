import java.awt.Graphics;

public class Square extends Figure{

    public Square(){
        super();
    }

    public Square(int x, int y){
        super(x, y);
        this.x = x - size/2;
        this.y = y - size/2;
    }

    public void paint (Graphics g){
        g.fillRect(x, y, size, size);
        g.setColor(figColor);
    }
}