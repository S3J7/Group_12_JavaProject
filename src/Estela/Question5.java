package Estela;

import java.util.HashMap;
import java.util.Map;
//  /*
//    Frequency of Characters
//         Write a return method that can find the frequency of characters
//         Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
//
//     */
public class Question5 {
        public static String frequencyTask(String str) {
            StringBuilder result = new StringBuilder();

            while (!str.isEmpty()) {
                char ch = str.charAt(0);
                int count = str.length() - str.replace(String.valueOf(ch), "").length();

                result.append(ch).append(count);
                str = str.replace(String.valueOf(ch), "");
            }

            return result.toString();
        }

        public static void main(String[] args) {
            System.out.println(frequencyTask("AAABBDDFFFFF"));


        }}