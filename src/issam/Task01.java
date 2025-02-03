package issam;

public class Task01 {
    /**
     Write  a method which can identify given number is even or odd
     Output ex:
     identify(5); ->"Odd"
     identify(6); ->"Even"
     */
    public static void main(String[] args) {
         checkNum(5);
         checkNum(6);
    }
    public static void checkNum( int num){
        if(num %2==0){
            System.out.println(
                    "identify ("+num+")" +" is Even");
        }
        else{
            System.out.println(
                    "identify ("+num+")" +" is Odd");
        }

    }


}
