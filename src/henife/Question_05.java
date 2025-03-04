package henife;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 String - Frequency of Characters
 Write a return method that can find the frequency of characters
 Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

public class Question_05 {
    public static void main(String[] args) {
        System.out.println(frequencyTask("AABBBDFFFFF"));

    }
    public static String frequencyTask(String str) {

        Map<Character, Integer> frequencyMap = new HashMap<>();

        char[] strChar = str.toCharArray();

        for(char c : strChar) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }
        return result.toString();
    }

}
