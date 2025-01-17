package mohamed;

public class Question1 {
    public static void main(String[] args) {
  /*
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"
*/

        identify(5);
        identify(6);

    }

    public static void identify(int num){
        if (num % 2 == 0 ){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
