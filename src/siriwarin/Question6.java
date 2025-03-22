package siriwarin;
/*
         Remove Duplicates
         Write a return method that can remove the duplicated values from the String
         Ex: removeDup("AAABBBCCC") ==> ABC
 */

public class Question6 {

    public static String removeDuplicate(String str) {

        String result = "";

        for (char ch : str.toCharArray()) {

            if (!result.contains(String.valueOf(ch))) {
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(removeDuplicate("AAABBBCCC"));
    }
}
