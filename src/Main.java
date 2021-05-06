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
            f.gb.move(2);
            f.gb2.move(2);
            f.gb.ageUp();
            f.gb2.ageUp();
            f.gb.populationUp();
            f.gb2.populationUp();
            frame.repaint();
            Thread.sleep(100);
        }


    }
}
