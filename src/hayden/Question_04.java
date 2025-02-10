package hayden;

public class Question_04 {


    /**
     Write a return method that can reverse negative number and return it as int
     */

    public static int reverseNegativeNumber(int num) {

        if (num < 0) {
            int reversed = 0;
            num = -num;

            while (num != 0) {

                int digit = num % 10;

                reversed = reversed * 10 + digit;

                num /= 10;
            }

            return -reversed;
        }

        return num;
    }

    public static void main(String[] args) {
        int input = -123;

        int result = reverseNegativeNumber(input);

        System.out.println("result = " + result);
    }

}
