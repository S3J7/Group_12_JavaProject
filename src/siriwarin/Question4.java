package siriwarin;

public class Question4 {

    /**
     Write a return method that can reverse negative number and return it as int
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

            result += currentChar + Integer.toString(count);

            str = str.replaceAll(String.valueOf(currentChar), "");
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "AAABBCDD";
        String output = frequencyOfChars(input);
        System.out.println("output = " + output);
    }


}
