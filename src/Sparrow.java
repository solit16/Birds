public class Sparrow extends Bird{
    Sparrow(String name, char gender, int age) {
        super(name, gender, age);
    }
    Sparrow(String name) {
        super(name);
    }
    public void jump() {
        System.out.println("Я прыгаю!");
    }
}
