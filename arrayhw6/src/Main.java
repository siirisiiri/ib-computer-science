public class Main {
    public static void main(String[] args) {
        int m = 1;
        int [] array = {4, -3, -5, 9, 1, 11};
        int [] smaller = new int [array.length];
        int [] larger = new int [array.length];
        for (int i = 0; i < array.length; i++){
            if (array [i] < m)
                smaller [i] = array [i];
            else if (array [i] > m)
                larger [i] = array [i];
        }
        System.out.println("smaller:");
        for (int v : smaller){
            if (v != 0)
                System.out.println(v);
        }
        System.out.println("larger:");
        for (int s : larger){
            if (s != 0)
                System.out.println(s);
        }
    }
}