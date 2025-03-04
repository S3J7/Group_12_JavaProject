package Estela;

import java.util.LinkedHashSet;

public class Question6 {

        public static String removeDuplicates(String e) {
            LinkedHashSet<Character> set = new LinkedHashSet<>();
            for (char c : e.toCharArray()) {
                set.add(c);
            }
            StringBuilder result = new StringBuilder();
            for (char c : set) {
                result.append(c);
            }
            return result.toString();
        }


        public static void main(String[] args) {
            System.out.println(removeDuplicates("AABBHCHHJJJDDD"));
        }
    }
