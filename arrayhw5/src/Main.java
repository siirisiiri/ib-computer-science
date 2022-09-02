public class Main {
    public static void main(String[] args) {
        int [] array = {-3, 2, 6, -11};
        int [] cumulativeSum = new int [array.length];
        cumulativeSum [0] = array [0];
        for (int i = 1; i < array.length; i++)
            cumulativeSum [i] = cumulativeSum[i - 1] + array [i];
        for (int v : cumulativeSum)
            System.out.println(v);
    }
}