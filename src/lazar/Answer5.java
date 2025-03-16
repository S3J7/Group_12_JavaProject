package lazar;

public class Answer5 {

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


    }
}
