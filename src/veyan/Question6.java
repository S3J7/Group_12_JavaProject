package veyan;

/*
         Remove Duplicates
         Write a return method that can remove the duplicated values from the String
         Ex: removeDup("AAABBBCCC") ==> ABC
 */

import java.util.ArrayList;

public class Question6 {
    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCC")); // ABC

    }

    public static String removeDuplicates(String input) {

        ArrayList<Character> list = new ArrayList<>();

        String result = "";

        for (char eachChar : input.toCharArray()) {

            if (!list.contains(eachChar)) {
                list.add(eachChar);
                result += eachChar;
            }
        }

        return result;
    }

}


