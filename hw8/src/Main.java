public class Main {
    public static void main(String[] args) {

        final int tnr = 2; // number of the subexercise (1 or 2)
        int a = 3;
        int b = 2;
        int fac = 1;
        if (tnr == 1) {
            for (int k = 0; k < a; k += 1) {
                fac *= 3;
            }
        }
        if (tnr == 2){
            for (int k = 0; k < a; k += 1) {
                fac *= b;
            }
        }

        System.out.println(fac);

    }
}