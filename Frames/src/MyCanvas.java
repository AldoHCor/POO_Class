import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class MyCanvas extends Canvas {
    private static final long serialVersionUID = 1L;
    Color backgroundColor;
    boolean oval, line;
    String text;

    // que boton se apreto, texto

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setOval (boolean oval) {
        this.oval = oval;
    }
    public boolean getOval (){
        return oval;
    }
    public void setLine (boolean line){
        this.line = line;
    }
    public boolean getLine (){
        return line;
    }
    public void setText(String text){
        this.text = text;
    }
    public String getText (){
        return text;
    }
    public MyCanvas(){
        super();
        backgroundColor = Color.WHITE;
        oval = false;
        text = "";

    }
    public void paint(Graphics g){
        setBackground(backgroundColor);

        g.drawString(text, getWidth()/8, (getHeight()/2));
        if (oval == true) {
            int ovalSize = getHeight()/2;
            g.fillOval((getWidth()/2) - ovalSize/2, (getHeight()/2) - ovalSize/2, ovalSize, ovalSize);
        }
        if (line == true) {
            g.drawLine(0, 0, getWidth(), getHeight());
            g.drawLine(getWidth(), 0, 0, getHeight());
        }
        // cambia texto y modifica linea o circulo
    }
}
