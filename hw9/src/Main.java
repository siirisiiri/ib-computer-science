public class Main {
    public static void main(String[] args) {
        int highest = 0;
        int thigh = 0;
        for (int t = 0; t <= 100; t++) {
            int s1 = t * (t - 20) * (t - 100) + 120000;
            int s2 = (t + 1) * (t - 19) * (t - 99) + 120000;
            if ((s1 - s2) > highest) {
                highest = s1 - s2;
                thigh = t + 1;
            }
        }
        System.out.println(thigh);
    }
}