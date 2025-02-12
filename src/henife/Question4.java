package henife;

import com.sun.source.tree.BreakTree;

/**
 Write a return method that can reverse negative number and return it as int
 */


public class Question4 {
    public static void main(String[] args) {
        int number = 34;
        int reversedNumber = reverseMethod(number);
        System.out.println("Reversed negative number: " + reversedNumber);

    }

    public static int reverseMethod(int number) {
        if (number < 0) {
            int reversedNumber = 0;
            int absNumber = Math.abs(number);

            while (absNumber != 0) {
                int digit = absNumber % 10;
                absNumber = absNumber / 10;
                reversedNumber = reversedNumber * 10 + digit;
            }

            return -reversedNumber;
        }
        return number;
    }
}
