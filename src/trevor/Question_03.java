package trevor;

public class Question_03 {

    //Swap two variables' values without using a third variable

    public static void main(String[] args) {

        int a,b;

        a=3;

        b=5;

        System.out.println("a = " + a);

        System.out.println("b = " + b);

        a = a + b;

        System.out.println("a = " + a);

        b = a - b;

        System.out.println("b = " + b);

        a = a - b;

        System.out.println("a = " + a);

        System.out.println("b = " + b);

    }
}
