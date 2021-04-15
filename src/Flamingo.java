import java.awt.*;

public class Flamingo extends Bird{
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

}