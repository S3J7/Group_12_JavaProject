package hassnae;

public class Question6Answer {
    public static String removeDuplicate(String str) {
        String result = "";

        for (char ch : str.toCharArray()) {
            // Check if the character is not already in the result
            if (!result.contains(String.valueOf(ch))) {
                result += ch;
            }
        }

        return result; // Return the string with no duplicates
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicate("AAABBBCCC"));
        System.out.println(removeDuplicate("MMDAAABC"));
    }
}



