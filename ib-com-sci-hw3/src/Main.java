public class Main {
    public static void main(String[] args) {
        int tnr = 4;
        if (tnr == 1) {
            for (int k = 10; k <= 37; k += 3) {
                System.out.println(k);
            }
        } else if (tnr == 2) {
            for (int s = 998; s >= 900; s -= 1)
                System.out.println(s);
        } else if (tnr == 3) {
            for (int t = 1; t <= 20; t += 1) {
                if (t % 2 == 1)
                    System.out.println(1);
                else
                    System.out.println(-1);
            }
        } else if (tnr == 4)
        {
            for (int q = 1; q <= 20; q += 1)
            {
                System.out.println(7);
                System.out.println(7);
                System.out.println(9);
            }
        }
    }
}