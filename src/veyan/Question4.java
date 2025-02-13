package veyan;

/*
    Reverse Negative Number

    - Write a return method that can reverse digits of a negative number and
       return it as int.
    => input: -35   output: -53
*/

public class Question4 {
    public static void main(String[] args) {

        System.out.println(reverseTwoDigits(-35)); // -53

    }

    public static String reverseTwoDigits(int num) {

        int reversedNum = 0;

        for ( int i = 0; i < 2; i++ ) {

            if ( num >= 0 ) {
                return "";
            } else {
                reversedNum = reversedNum * 10 + num % 10;
                // ^^^ Adds last digit of num to reversedNum
                num /= 10; // Removes the last digit from num
            }

        }
        return reversedNum + "";

    }
}

