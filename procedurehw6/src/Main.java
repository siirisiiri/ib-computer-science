public class Main {
    public static void main(String[] args) {
        int [] test = {1, 2, 3, 4, 5, 6};
        for (int v : alternate(test))
            System.out.println(v);
    }
    static int [] alternate (int [] a){
        int [] b = new int [a.length];
        int k = 0;
        for (int i = 0; i < a.length; i += 2){
            b [i] = a [k];
            if (i + 1 < a.length)
            b [i + 1] = a[a.length - k - 1];
            k++;
        }
        return b;
    }
}