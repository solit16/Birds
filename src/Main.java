import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        MyFrame f = new MyFrame();

        JFrame frame = new JFrame("Birds");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.add(f);
        frame.setResizable(false);
        frame.setVisible(true);


    }
}
