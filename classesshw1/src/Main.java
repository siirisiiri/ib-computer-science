import static ibio.Helpers.*;
public class Main {
    public static void main(String[] args) {
        double angle = 0;
        for (int k = 0; k < 11; k++){
            angle = k * (Math.PI / 5);
            output (angle + ", " + Math.sin(angle) + ", " + Math.cos(angle));
        }
    }
}