package veyan;

/*
        Find the Unique
        Write a return  method that can find the unique characters from the String
        Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */

public class Question7 {
    public static void main(String[] args) {

        System.out.println(uniqueChar("AAABBBCCCDEF")); // DEF

    }

    public static String uniqueChar(String word) {

        // Initialize an empty string to store the result (unique characters)
        String result = "";

        // Loop through each character in the word string
        for (int i = 0; i < word.length(); i++) {
            // Get the character at the current index
            char letter = word.charAt(i);

            // Check if the character appears only once in the string.
            // If the first occurrence and the last occurrence of the-
            // -character are the same, it is unique.
            if (word.indexOf(letter) == word.lastIndexOf(letter)) {
                // Add the unique character to the result string
                result += letter;
            }
        }

        // Return the result containing all unique characters
        return result;
    }

}
