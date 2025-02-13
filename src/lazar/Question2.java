package lazar;

public class Question2 {
    public static void main(String[] args) {

        checkMultiple();


    }

    public static void checkMultiple() {

        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " FINRA");
            } else if (i % 5 == 0) {
                System.out.println(i + " RA");
            } else if (i % 3 == 0) {
                System.out.println(i + " FIN");
            } else {
                System.out.println(i + " NOT MULTIPLE BY 3 OR 5! ");
            }
        }
    }
}