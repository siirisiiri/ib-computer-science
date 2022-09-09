public class Main {
    public static void main(String[] args) {
        int [] test1 = {1, 2, 3, 4, 5, 6, 4, 3, 2, 1};
        int x = 1;
        int [] test2 = {6, 6, 5, 6, 6, 6, 6, 6, 6, 6};
        for (int v : REMOVE (test1, x, test2))
            System.out.println(v);
    }
    static int[] REMOVE (int [] I, int X, int [] OUT){
        int k = 0;
        for (int i = 0; i < 11; i++){
            if (i > I.length - 1){
                for (int s = i - k; s < i; s++)
                    OUT [s] = 0;
                break;
            }
            else if (I [i] == X){
                k++;
            }
            else {
                OUT [i - k] = I [i];
            }
        }
        return OUT;
    }
}