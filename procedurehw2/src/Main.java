public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 21; i++){
            System.out.println(sumUpTo(i));
        }
        }
        static int sumUpTo (int n){
            int k = (n * (n + 1)) / 2;
            return k;
        }
}