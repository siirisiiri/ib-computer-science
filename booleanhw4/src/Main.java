public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 387 * 6381; i++) // tässä tehtävässä voitaisiin myös käyttää hw10 eukleideen algoritmia ja jakaa lukujen tulo löydetyllä sytillä
            if (i%387 == 0 && i%6381 == 0) {
                System.out.println(i);
                break;
            }
    }
}