package siriwarin;

public class Question5 {

    /*
    Frequency of Characters
         Write a return method that can find the frequency of characters
         Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static String frequencyOfChars(String str) {

        String result = "";


        while (str.length() > 0) {

            char currentChar = str.charAt(0);

            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == currentChar) {

                    count++;
                }
            }

            result += currentChar + "" + count;

            str = str.replaceAll("" + currentChar, "");
        }

        return result;
    }

    public static void main(String[] args) {

        String input = "AAABBCDD";

        String result = frequencyOfChars(input);

        System.out.println("result = " + result);
    }
}
