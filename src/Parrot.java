public class Parrot extends Bird{

    Parrot(String name) {
        super(name);
    }
    Parrot(String name, char gender, int age) {
        super(name, gender, age);
    }
    public void speaking(Bird speaker) {
        System.out.println("["+this.name+"|"+this.gender+"] Я "+this.name+" общаюсь с " + speaker.name);
    }
}