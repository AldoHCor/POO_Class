import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class MyWindow extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;

    private JButton b1, b2;
    private MyCanvas myCanvas;
    private JPanel p1;
    private JTextField t1;
    private int height = 600, width = 600;

    public MyWindow(){
        super();

        b1 = new JButton("Blue");
        b2 = new JButton("Red");
        p1 = new JPanel();
        myCanvas = new MyCanvas();
        // myCanvas.setText("Start");
        t1 = new JTextField();
        t1.setText("");
        setSize(width, height);

        setLayout(new BorderLayout());
        b1.addActionListener(this);
        b2.addActionListener(this);
        t1.addActionListener(this);
        /**
         Haz una aplicación con Border Layout

         NORTH   :  TextField
         CENTER  :  Area Gráfica
         SOUTH   :  Panel con  FlowLayout y 2 botones
         */

        p1.add(b1);
        p1.add(b2);
        p1.add(t1);
        this.add(t1, BorderLayout.NORTH);
        this.add(p1,BorderLayout.SOUTH);
        this.add(myCanvas,BorderLayout.CENTER);

    }
    public void actionPerformed(ActionEvent event){

        if (event.getSource() == b1){
            myCanvas.setBackgroundColor(Color.GREEN);
            myCanvas.setOval(true);
            myCanvas.setLine(false);
            myCanvas.setText("");
            myCanvas.repaint();
        }
        if (event.getSource() == b2){
            myCanvas.setBackgroundColor(Color.RED);
            myCanvas.setOval(false);
            myCanvas.setLine(true);
            myCanvas.setText("");
            myCanvas.repaint();
        }
        if (event.getSource() == t1){
            String myText = t1.getText();
            myCanvas.setBackgroundColor(Color.WHITE);
            myCanvas.setOval(false);
            myCanvas.setLine(false);
            myCanvas.setText(myText);
            myCanvas.repaint();
        }
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
