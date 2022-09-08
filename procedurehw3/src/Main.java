public class Main {
    public static void main(String[] args) {
        int [] testi1 = {1, 2, 3, 4, 5};
        int [] testi2 = {6, 10, 4, 10, 7};
        System.out.println(any (testi1, testi2));
    }
    static boolean contains (int [] array, int value){
        boolean k = false;
        for (int i = 0; i < array.length; i++){
            if (array [i] == value){
                k = true;
                break;
            }
        }
        return k;
    }
    static boolean any (int [] a, int [] b){
        boolean s = false;
        boolean l = false;
        for (int i = 0; i < b.length; i++){
            l = contains (a, b [i]);
            if (l == true){
                s = true;
            }
        }
        return s;
    }
}