package lazar;

public class Question1 {
    public static void main(String[] args) {

        String a = identify(10);
        System.out.println("x= " + a);
        String b = identify(5);
        System.out.println("y= " + b);
    }



    public static String identify(int num) {
        if (num % 2 == 0) {
            return "even";
        } else
            return "odd";
    }
}
