package hishge;

public class Question_1 {

    /**
     Write  a method which can identify given number is even or odd
     Output ex:
     identify(5); ->"Odd"
     identify(6); ->"Even"
     */
    public static void main(String[] args) {
        int n = 6;
        System.out.println(OddOrEven(n));

    }
    public static String OddOrEven(int n) {
        String result = "Invalid";
        if (n % 2 == 0){
            result = "Even";
        } else if (n % 2 == 1) {
            result = "Odd";
        } else if (n== 0 || n<0){
            result = "Invalid Number";
        }
        return result;
    }
}
