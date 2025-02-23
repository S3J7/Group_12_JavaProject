package issam;

public class swap {

    public static void main(String[] args) {
        Swp(1,6);
    }
    public  static  void Swp(int a , int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value is A is "+ a + " value b is B is "+ b);
    }
}
