public class Main {
    public static void main(String[] args) {
        int [] taul = {5, 4, -7, -2, -1};
        for (int i = 0; i <= taul.length / 2; i++){
            int k = taul [i];
            int s = taul [taul.length - i - 1];
            taul [taul.length - i - 1] = k;
            taul [i] = s;
        }
        for (int v : taul)
            System.out.println(v);
    }
}