import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyFrame f = new MyFrame();


        JFrame frame = new JFrame("Birds");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.add(f);
        frame.setResizable(false);
        frame.setVisible(true);
        while(true) {
            f.gb.move(3);
            f.gb2.move(3);
            frame.repaint();
            Thread.sleep(30);
        }


    }
}
