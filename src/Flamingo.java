import java.awt.*;

public class Flamingo extends Bird{
    int r = 10;
    Flamingo(String name, char gender, int age) {
        super(name, gender, age);
        this.color = new Color(255, 203, 219);
    }

    Flamingo(String name) {
        super(name);
    }

    public void OneLegStanding() {
        System.out.println("Я стою на одной ноге!");
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(new Color(255, 203, 219));
        g2d.fillOval(this.x- this.r,this.y - this.r,this.r*2,this.r*2);
        int x2, y2;
        x2 = (int)(this.r*Math.cos(angle*Math.PI/180.0));
        y2 = (int)(this.r*Math.sin(angle*Math.PI/180.0));
        g2d.setColor(Color.BLACK);
        g2d.drawLine(this.x, this.y, x + x2, y - y2);
    }
}