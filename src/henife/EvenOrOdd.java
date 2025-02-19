package henife;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(identify(11));
    }
        public static String identify(int num){
            if(num%2==0){
                return "even";
            }
            return "odd";
        }
    }
