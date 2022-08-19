public class Main {
    public static void main(String[] args) {
        final int w = 6;
        int price = 0;
        if (w <= 2)
            price = 3;
        else if (w > 2 && w <= 5)
            price = 3 + 2*(w - 2);
        else
            price = 9 + 3*(w - 5);
        System.out.println(price);
    }
}