import java.awt.*;

public class Parrot extends Bird{

    int r = 10;

    Parrot(String name) {
        super(name);
        System.out.println("Родился попугай " + this.gender + " c именем " + this.name);
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
        // тернарная операция
        Color genderColor = this.gender=='m'?Color.BLUE:Color.YELLOW;
        g2d.setColor(genderColor);
        g2d.drawOval(this.x- this.r,this.y - this.r,this.r*2,this.r*2);
        int x2, y2;
        x2 = (int)(this.r*Math.cos(angle*Math.PI/180.0));
        y2 = (int)(this.r*Math.sin(angle*Math.PI/180.0));
        g2d.setColor(Color.BLACK);
        g2d.drawLine(this.x, this.y, x + x2, y - y2);
    }
    @Override
    public void draw(Graphics2D g2d, int group_x, int group_y) {
        int x = group_x + this.x;
        int y = group_y + this.y;
        g2d.setColor(this.color);
        g2d.fillOval(x- this.r,y - this.r,this.r*2,this.r*2);
        // тернарная операция
        Color genderColor = this.gender=='m'?Color.BLUE:Color.YELLOW;
        if (this.populationSkip < 20) {
            genderColor = (Color.GRAY);
        }
        g2d.setColor(genderColor);
        g2d.drawOval(x- this.r,y - this.r,this.r*2,this.r*2);
        int x2, y2;
        x2 = (int)(this.r*Math.cos(angle*Math.PI/180.0));
        y2 = (int)(this.r*Math.sin(angle*Math.PI/180.0));
        g2d.setColor(Color.BLACK);
        g2d.drawLine(x, y, x + x2, y + y2);
        g2d.drawString(Integer.toString(this.age), x, y + r*2);
    }
}