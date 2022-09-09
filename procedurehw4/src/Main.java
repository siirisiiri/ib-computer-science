public class Main {
    public static void main(String[] args) {
        int[] test = {4, 7, 8, 7, 4};
        System.out.println(equal(test, reverse(test)));
    }
        static int[] reverse ( int[] a){
            int[] b = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                b[i] = a[a.length - i - 1];
            }
            return b;
        }
        static boolean equal (int [] a, int [] b){
            boolean k = true;
            for (int i = 0; i < a.length; i++){
                if (a [i] != b [i])
                    k = false;
            }
            return k;
        }
    }