public class Main {
    public static void main(String[] args) {

        int n = 0;
        boolean found = false;
        while (found == false){
            if ((n*n*n + 91)%47 == 0)
                found = true;
            else
                n += 1;
        }
        System.out.println(n);
    }
}