import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class GroupBird {

    ArrayList<Bird> birds;
    int x, y;
    int r = 100;
    int angle;

    GroupBird(int typeBird, int count){
        Random rand = new Random();
        this.birds = new ArrayList<Bird>();
        this.angle = rand.nextInt(360);
        int r_start = 100;
        int r_end = 400;
        this.x = r_start + (int)(Math.random()*(r_end - r_start));
        this.y = r_start + (int)(Math.random()*(r_end - r_start));



        for (int i = 0; i < count; i ++){
            int x, y, r = this.r - 10;
            x = -r + (int)(Math.random()*(2*r));
            int t = (int)Math.sqrt(r * r - x * x);
            y = -t + (int)(Math.random()*(2*t));
            if(typeBird == 1){
                Parrot p = new Parrot("Вася"+ i );
                p.setXY(x, y);
                birds.add(p);
            }
            else if (typeBird == 2){
                Flamingo f = new Flamingo("Нафанаил"+i);
                f.setXY(this.x + x, this.y + y);
                birds.add(f);
            }
        }
    }


    public void draw(Graphics2D g2d){
        g2d.setColor(new Color(200, 191, 231, 51));
        g2d.fillOval(this.x- this.r,this.y - this.r,this.r*2,this.r*2);
        for(int i = 0; i < this.birds.size(); i++){
            this.birds.get(i).draw(g2d, this.x, this.y);
        }
    }
    public void move(int d) {
        if (this.x < 400 && this.x > 100 && this.y < 400 && this.y > 100) {
            int dx = (int)(d*Math.cos(angle*Math.PI/180.0));
            int dy = (int)(d*Math.sin(angle*Math.PI/180.0));
            this.x += dx;
            this.y += dy;
        } else {
            angle = angle + 180;
            int dx = (int)(d*Math.cos(angle*Math.PI/180.0));
            int dy = (int)(d*Math.sin(angle*Math.PI/180.0));
            this.x += dx;
            this.y += dy;
            if (angle > 360) {
                angle -= 360;
            }
        }
        for(int i = 0; i < birds.size(); i++){
            this.birds.get(i).move(2, this.r);
        }
        if (Math.random() > 0.5) {
            angle += 2;
        } else {
            angle -= 2;
        }

    }
}
