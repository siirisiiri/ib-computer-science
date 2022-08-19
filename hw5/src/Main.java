public class Main {
    public static void main(String[] args) {
        final int tnr = 2; // number of the subexercise
        final int A = 50;
        final int B = 50;
        int n = 0;
        if (tnr == 1) {
            if (A >= 100)
                if (B <= 50)
                    n = 1;
        }
        if (tnr == 2) {
            if (A > B)
            {
                if (A >= 100)
                    if (B <= 50)
                        n = 1;
            }
            else {
                if (B >= 100)
                    if (A <= 50)
                        n = 1;
            }
        }
        System.out.println(n);
    }
}