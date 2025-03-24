package hassnae;

public class Question7Answer {
    //Find the Unique
    //Write a return  method that can find the unique characters from the String
    //         Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";


        public static String unique(String str) {
            String uniqueResult = "";

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                    uniqueResult += ch;
                }
            }

            return uniqueResult;
        }

        public static void main(String[] args) {
            System.out.println(unique("AAABBBCCCDEF"));
        }
    }


