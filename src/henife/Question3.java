package henife;
/*
        Swap two variables' values without using a third variable

 */

public class Question3 {
    public static void main(String[] args) {
swapVariable("access","excess");
    }
    public static void swapVariable(String first, String second) {

        int firstLength = first.length();

        first = first +second;
        second = first.substring(0,firstLength);
        first = first.substring(firstLength);

        System.out.println("The first variable is: " + first);
        System.out.println("The second variable is: " + second);

    }
    }
