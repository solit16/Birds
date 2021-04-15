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

        Parrot par1 = new Parrot("Вася", 'm', 4);
        Parrot par2 = new Parrot("Саша");
        Penguin peng1 = new Penguin("Леопольд", 'm', 4);
        Penguin peng2 = new Penguin("Женя");
        Flamingo flam = new Flamingo("Николай", 'm', 3);
        Sparrow spar = new Sparrow("Кристина", 'f', 3);
        peng1.swim();
        peng2.fly();
        flam.OneLegStanding();
        spar.jump();

        par1.draw(f.getG2d());
    }
}
