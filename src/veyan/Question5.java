package veyan;

/*
    Frequency of Characters :

        Write a return method that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

public class Question5 {
    public static void main(String[] args) {

        System.out.println(FrequencyOfChars("AAABBCDD")); // A3B2C1D2

    }

    public static String FrequencyOfChars(String input){

        String result = "";

        // Loop through each character in the input string
        for (char character : input.toCharArray()){
            // Check if the character is already in the result string
            if (result.indexOf(character) == -1){
            // "result.indexOf(character)": This looks for the position of
            // character in the result string.
            // "== -1": This checks if indexOf returned -1,
            // meaning the character is not found in the result string.
                int count = 0; // Initialize count for the current character

                // Count how many times the character appears in the input string
                for (char eachCharacter : input.toCharArray()){
                    if (eachCharacter == character) {
                        count++; // Increase the count if characters match
                    }
                }
                // Add the character and its count to the result string
                result += character + Integer.toString(count);
                // "Integer.toString(count)": Converts the integer 'count'
                // to a string so it can be concatenated to the result string.
            }
        }
        return result; // Return the final result string showing character frequencies

    }

}
