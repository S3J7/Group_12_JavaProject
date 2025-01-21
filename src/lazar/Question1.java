package lazar;

public class Question1 {
    public static void main(String[] args) {

        String x = identify(10);
        System.out.println("x= " + x);
        String y = identify(5);
        System.out.println("y= " + y);
    }



    public static String identify(int num) {
        if (num % 2 == 0) {
            return "even";
        } else
            return "odd";
    }
}
