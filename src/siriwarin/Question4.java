package siriwarin;

public class Question4 {

    /*
    Reverse Negative Number

Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
     */
    public static int reverseNegativeNumber(int num) {

        if (num < 0) {
            num = -num;
            int reversed = 0;

            while (num > 0) {
                reversed = reversed * 10 + num % 10;
                num /= 10;
            }

            return -reversed;
        }
        return num;
    }

    public static void main(String[] args) {

        int number = -48;

        int result = reverseNegativeNumber(number);

        System.out.println("Reversed Number: " + result);
    }

}
