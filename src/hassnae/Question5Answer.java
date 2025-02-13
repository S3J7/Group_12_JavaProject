package hassnae;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Question5Answer {
    /*
    Frequency of Characters
         Write a return method that can find the frequency of characters
         Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

     */

    public static void main(String[] args) {

        System.out.println("FrequencyOfChars(\"AAABBCDD\") = " + FrequencyOfChars("AAABBCDD"));
        System.out.println("FrequencyOfChars(\"MMDHHBBC\") = " + FrequencyOfChars("MMDHHBBCNN"));
        System.out.println("FrequencyOfChars(\"MOROCCO\") = " + FrequencyOfChars("MOROCCO"));
    }
    public static String FrequencyOfChars(String str) {
        String nonDuplicate = "";


        for(int i=0; i < str.length(); i++)
            if(!nonDuplicate.contains(""+str.charAt(i)))
                nonDuplicate+= ""+str.charAt(i);

        String expectedResult = "";

        for( int j=0;j < nonDuplicate.length(); j++) {
            int count = 0;
            for(int i=0; i < str.length(); i++) {
                if(str.charAt(i) == nonDuplicate.charAt(j))
                    count++;
            }
            expectedResult +=nonDuplicate.charAt(j)+"" + count;
        }
        return expectedResult;
    }

}
