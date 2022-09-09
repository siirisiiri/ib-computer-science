public class Main {
    public static void main(String[] args) {
        int k = 0;
            for (int i = 2; i < 10000000; i++) {
                if (prime(i) == true) {
                    System.out.println(i);
                    k++;
                }
                if (k >= 100){
                    break;
                }
            }
    }
    static boolean prime (int n){
        boolean result = true;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}