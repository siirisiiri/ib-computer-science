public class Main {
    public static void main(String[] args) {
        final int T = 21;
        String action = "alku";
        if (T < 17)
            action = "hit";
        else if (T > 21)
            action = "bust";
        else
            action = "stay";
        System.out.println(action);

    }
}