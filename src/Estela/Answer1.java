package Estela;


public class Answer1 {
    public static void main(String[] args) {


        String s = identify (35);
        System.out.println("String s = " + s);
        String s1  = identify(4);
        System.out.println("String s1  = " + s1);

    }
    public static String identify(int num) {
        //String result = "";
        if(num % 2 ==0){
            return "even";

        }else{
            return "odd";

        }

    }





    /**
     Write  a method which can identify given number is even or odd
     Output ex:
     identify(5); ->"Odd"
     identify(6); ->"Even"
     */
}
