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
        gb.draw(g2d);
        gb2.draw(g2d);

    }

    public Graphics2D getG2d(){
        return this.g2d;
    }
    MyFrame(){
        this.gb = new GroupBird(1, 15);
        this.gb2 = new GroupBird(1, 15);
    }
}
