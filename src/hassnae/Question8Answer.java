package hassnae;

public class Question8Answer {

        public static String reverse(String str) {
            String reversed = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i);
            }
            return reversed;
        }

        public static void main(String[] args) {
            System.out.println(reverse("ABCD"));
        }
    }




