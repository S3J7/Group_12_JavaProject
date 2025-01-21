package Estela;

public class Answer2 {
    public static void main(String[] args) {
        /**
         Write a function which prints out the numbers
         from 1 to 30 but for numbers which are a multiple of 3,
         print "FIN" instead of the number and
         for numbers which are a multiple of 5,
         print "RA" instead of the number.
         For numbers which are a multiple of both 3 and 5,
         print "FINRA" instead of the number.
         */
        //

        for (int i = 1; i <= 30; i++) {

            boolean divBy3 = i % 3 == 0;
            boolean divBy5 = i % 5 == 0;

            String result = "";

            if (divBy3 && divBy5) {
                result = "FINRA";
            } else if (divBy3) {
                result = "FIN";
            } else if (divBy5) {
                result = "RA";
            } else {
                result = " " + i;
            }
            System.out.print(result + " ");
        }
    }
}