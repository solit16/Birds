import java.awt.*;
import java.util.ArrayList;

public class GroupBird {

    ArrayList<Bird> birds;
    int x, y;
    int r = 100;

    GroupBird(int typeBird, int count){
        this.birds = new ArrayList<Bird>();

        int r_start = 100;
        int r_end = 400;
        this.x = r_start + (int)(Math.random()*(r_end - r_start));
        this.y = r_start + (int)(Math.random()*(r_end - r_start));

        for (int i = 0; i < count; i ++){
            if(typeBird == 1){
                Parrot p = new Parrot("Вася"+ i );
                int x, y, r = this.r - 10;
                x = -r + (int)(Math.random()*(2*r));
                int t = (int)Math.sqrt(r * r - x * x);
                y = -t + (int)(Math.random()*(2*t));
                p.setXY(x + this.x, y + this.y);
                birds.add(p);
            }
        }
    }


    public void draw(Graphics2D g2d){
        g2d.setColor(new Color(200, 191, 231));
        g2d.fillOval(this.x- this.r,this.y - this.r,this.r*2,this.r*2);
        for(int i = 0; i < this.birds.size(); i++){
            this.birds.get(i).draw(g2d);
        }
    }
}
