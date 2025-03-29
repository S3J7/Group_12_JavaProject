package Estela;

public class Question7 {
    //Find the Unique
    //Write a return  method that can find the unique characters from the String
    //         Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (input.indexOf(ch) == input.lastIndexOf(ch)) {
                System.out.println(ch);
            }
        }}}
