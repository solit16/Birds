public class Penguin extends Bird {
    Penguin(String name) {
        super(name);
    }
    Penguin(String name, char gender, int age) {
        super(name, gender, age);
    }
    @Override
    public void fly() {
        System.out.println("Я не умею летать");
    }
    public void swim() {
        System.out.println("Я плыву");
    }
}
