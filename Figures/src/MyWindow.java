
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyWindow extends JFrame{

    private static final long serialVersionUID = 1L;
    private MyCanvas myCanvas;
    private JPanel p1;
    private int height = 1000, width = 1000;

    public MyWindow(){
        super();

        p1 = new JPanel();
        myCanvas = new MyCanvas();
        setSize(width, height);
        setLayout(new BorderLayout());
        this.add(p1,BorderLayout.SOUTH);
        this.add(myCanvas,BorderLayout.CENTER);

    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
}