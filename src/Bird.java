import java.awt.*;
import java.util.Random;

public class Bird {
    int x, y;
    String name;
    int age;
    char gender;
    int food;
    Color color;
    int angle;
    private int ageSkip;
    int populationSkip;


    Bird(String name) {
        Random rand = new Random();
        this.name = name;
        this.age = rand.nextInt(50);
        this.populationSkip = rand.nextInt(20);
        double randomGender = Math.random();
        if(randomGender < 0.5){
            this.gender = 'f';
        } else {
            this.gender = 'm';
        }
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);
        this.angle = rand.nextInt(360);
        this.color = new Color(r, g, b);
        this.food = 0;
    }

    Bird(String name, char gender, int age) {
        this.name = name;
        this.age = age;
        if(gender == 'f' || gender == 'm'){
            this.gender = gender;
        } else {
            System.out.println("С птичкой что-то не так");
            return;
        }

        Random rand = new Random();
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);
        this.color = new Color(r, g, b);

        System.out.println("Появился " + this.name + " c возрастом " + this.age);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void fly(){
        System.out.println("["+this.name+"|"+this.gender+"] Я лечу");
    }


    public void eat(int countFood){
        System.out.println("["+this.name+"|"+this.gender+"] Я съел " + countFood + " еды");
        this.food += countFood;
    }

    public void friending(Bird friend){
        System.out.println("["+this.name+"|"+this.gender+"] Я "+this.name+" дружу с " + friend.name);
    }
    public void drink(int drinkCount) {
        System.out.println("["+this.name+"|"+this.gender+"] Я "+this.name+"выпил"+drinkCount);
    }

    public void draw(Graphics2D g2d){
        g2d.fillOval(this.x,this.y,20,20);
    }
    public void draw(Graphics2D g2d, int group_x, int group_y) {
    }
    public void move(int d, int r){
        if (Math.sqrt(this.x*this.x+this.y*this.y) > r){
            angle = angle + 2*angle;
            if (angle > 360) {
                angle -= 360;
            }
        }
        int dx = (int)(d*Math.cos(angle*Math.PI/180.0));
        int dy = (int)(d*Math.sin(angle*Math.PI/180.0));
        this.x += dx;
        this.y += dy;
        if (Math.random() > 0.5) {
            angle += 5;
        } else {
            angle -= 5;
        }
    }
    public boolean ageUp() {
        Random rand = new Random();
        ageSkip++;
        if (ageSkip > 10) {
            ageSkip = 0;
            age++;
            populationSkip++;
            int killRand = rand.nextInt(100);
            killRand += 100;
            if (killRand < this.age) {
                return false;
            }
        }
        return true;
    }

}
