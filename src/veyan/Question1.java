package veyan;
/**
 Write  a method which can identify given number is even or odd
 Output ex:
 identify(5); ->"Odd"
 identify(6); ->"Even"
 */
public class Question1 {
    public static void main(String[] args) {

        System.out.println(identify(5)); // Odd
        System.out.println(identify(6)); // Even

    }

    public static String identify (int a){
        if (a % 2 == 0 && a > 0){
            return "Even";
        } else {
            return "Odd";
        }
    }
}
