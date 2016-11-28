/**
 * Created by aldo on 12/11/16.
 */

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;

public class MyCanvas extends Canvas  implements KeyListener, MouseListener {
    private static final long serialVersionUID = 1L;
    private MyObject rect;
    private MyObject player;
    private int ws = getHeight();
    private  MyObject bullet;
    private int key;
    private Timer timer;
    private TimerTask task;
    private int i = 0;

    public MyCanvas(){
        super();
        this.setBackground(Color.gray);
        addMouseListener(this);
        addKeyListener(this);
        rect = new MyObject(300, 300, 100, 100);
        player = new MyObject(0, 0, 10, 10);
        player.setColor(Color.BLACK);
        key = 0;
        bullet = new MyObject();
        timer = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                i++;
                // System.out.println(i);
                if (key == 38){
                    bullet.setY(bullet.getY() - 20);
                }
                if (key == 40){
                    bullet.setY(bullet.getY() + 20);
                }
                if (key == 37){
                    bullet.setX(bullet.getX() - 20);
                }
                if (key == 39){
                    bullet.setX(bullet.getX() + 20);
                }
                if (!bullet.inside(bullet.getX(), bullet.getY(), rect.getX(), rect.getY() ,100)){
                    rect = new MyObject();
                    bullet = new MyObject();
                }

                repaint();
            }
        };
        this.start();
    }


    public void start(){
        timer.scheduleAtFixedRate(task, 150, 150);
    }

    public void mouseClicked (MouseEvent e){
        //  What happens when you push a key
        System.out.println("Mouse   X: " + e.getX() + "  Y: " + e.getY());
        //  Timer timer = new Timer();
        bullet = new MyObject(player.getX(), player.getY(), 20, 20);
        bullet.setColor(Color.WHITE);
        System.out.println(key);
        repaint();
    }

    public void keyPressed (KeyEvent e){
        key = e.getKeyCode();
        int x = player.getX();
        int y = player.getY();

        switch (key){

            case KeyEvent.VK_UP :

                if (  player.clamp(y, getHeight())  && player.inside(player.getX(), player.getY(), rect.getX(), rect.getY() ,100)  ){
                    System.out.println("UP");
                    player.setY(y - 10);
                }

                break;

            case KeyEvent.VK_DOWN :
                    if (player.clamp(y + 20, getHeight()) && player.inside(player.getX(), player.getY(), rect.getX(), rect.getY() - 10, 100)) {
                    System.out.println("DOWN");
                    player.setY(y + 10);
                }
                break;

            case KeyEvent.VK_LEFT :
                if (player.clamp(x, getWidth()) && player.inside(player.getX(), player.getY(), rect.getX(), rect.getY(), 100)) {
                    System.out.println("LEFT");
                    player.setX(x - 10);
                }
                break;

            case KeyEvent.VK_RIGHT :
                if (player.clamp(x + 20, getWidth()) && player.inside(player.getX(), player.getY(), rect.getX() - 10, rect.getY() , 100)) {
                    System.out.println("RIGHT");
                    player.setX(x + 10);
                }
                break;

            case KeyEvent.VK_SPACE :
                System.out.println("SPACE");
                break;
        }
        System.out.println("Player   X: " + player.getX() + ", Y: " + player.getY());

        repaint();
    }

    public void paint(Graphics g){

        // Everything that aesthetically changes
        rect.setColor(Color.BLACK);
        rect.paint(g);
        player.paint(g);
        bullet.paint(g);
    }


    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
    public void mouseExited (MouseEvent e){}
    public void mouseReleased (MouseEvent e){}
    public void mouseEntered (MouseEvent e){}
    public void mousePressed (MouseEvent e){}

}