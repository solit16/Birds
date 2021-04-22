import java.awt.*;

public class Parrot extends Bird{

    int r = 10;

    Parrot(String name) {
        super(name);
        System.out.println("Родился папугай " + this.gender + " c именем " + this.name);
    }
    Parrot(String name, char gender, int age) {
        super(name, gender, age);
    }
    public void speaking(Bird speaker) {
        System.out.println("["+this.name+"|"+this.gender+"] Я "+this.name+" общаюсь с " + speaker.name);
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(this.color);
        g2d.fillOval(this.x- this.r,this.y - this.r,this.r*2,this.r*2);
    }
}