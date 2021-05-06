import javax.swing.*;
import java.awt.*;

public class MyFrame extends JPanel {
    Graphics g;
    Graphics2D g2d;
    GroupBird gb;
    GroupBird gb2;
    public void paint(Graphics g){
        this.g = g;
        this.g2d = (Graphics2D) g;
        g2d.setRenderingHint ( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );
        g2d.setStroke ( new BasicStroke ( 2f ) );
        gb.draw(g2d);
        gb2.draw(g2d);

    }

    public Graphics2D getG2d(){
        return this.g2d;
    }
    MyFrame(){
        this.gb = new GroupBird(1, 10);
        this.gb2 = new GroupBird(1, 10);
    }
}
