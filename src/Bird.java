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

    Bird(String name) {
        this.name = name;
        this.age = 0;

        double randomGender = Math.random();
        if(randomGender < 0.5){
            this.gender = 'f';
        } else {
            this.gender = 'm';
        }
        Random rand = new Random();
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

}
