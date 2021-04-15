import java.awt.*;
import java.util.Random;

public class Bird {
    String name;
    int age;
    char gender;
    int food;
    Color color;


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
        this.color = new Color(r, g, b);

        this.food = 0;

        System.out.println("Родился " + this.gender + " c именем " + this.name);
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

        System.out.println("Появился " + this.name + " c возрастом " + this.age);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
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
}
