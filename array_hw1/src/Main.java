public class Main {
    public static void main(String[] args) {
        int [] ar = {2, 5, -3, 11, 193, -2};
        int sum = 0;
        for (int v : ar){
            System.out.println(v);
            sum += v;
        }
        System.out.println(sum);
    }
}