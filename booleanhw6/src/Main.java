public class Main {
    public static void main(String[] args) {
        int nro = 13;
        boolean result = true;
        for (int i = 2; i <= nro/2; i++){
            if (nro%i == 0) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}