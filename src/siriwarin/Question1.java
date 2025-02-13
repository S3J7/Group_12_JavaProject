package siriwarin;

public class Question1 {
    public static void main(String[] args) {

         /*
         Write  a method which can identify given number is even or odd
         Output ex:
         identify(5); ->"Odd"
         identify(6); ->"Even"
         */

        String s = identify(55);
        System.out.println(s);

        String s1 = identify(2);
        System.out.println(s1);
    }

    public static String identify(int num){
        if(num % 2 == 0){
            return "even";
        }
        return "odd";
    }
    }

