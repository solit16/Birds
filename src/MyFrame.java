import javax.swing.*;
import java.awt.*;

public class MyFrame extends JPanel {
    Graphics g;
    Graphics2D g2d;

    public void paint(Graphics g){
        GroupBird gb = new GroupBird(1, 10);
        this.g = g;
        this.g2d = (Graphics2D) g;
        gb.draw(g2d);
    }

    public Graphics2D getG2d(){
        return this.g2d;
    }

}
