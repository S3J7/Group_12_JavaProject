package hishge;

import java.util.stream.Stream;

public class Question_4 {

    /**
     Write a return method that can reverse negative number and return it as int
     */

    public static void main(String[] args) {

        int o = -308987;
        System.out.println(returnNonNegative(o));

    }

    public static Integer returnNonNegative(int i){
        String newS = "";
        Integer n = 0;
        if ( i >= 0){
            return i;
        }
        if ( i < 0){
            n = Integer.parseInt(String.valueOf(i));
            String s = String.valueOf(n);
            if (s.contains("-")) {
                newS = s.substring(1);
            }
        }
        n = Integer.parseInt(newS);
        return n;
    }
}
