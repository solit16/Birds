import javax.swing.*;
import java.awt.*;

public class MyFrame extends JPanel {
    Graphics g;
    Graphics2D g2d;

    public void paint(Graphics g){
        Flamingo f = new Flamingo("123");
        this.g = g;
        this.g2d = (Graphics2D) g;
        f.draw(g2d);
    }

    public Graphics2D getG2d(){
        return this.g2d;
    }

}
