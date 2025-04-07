package lazar;

public class Question3 {
    //Swap two variables' values without using a third variable
    public static void main(String[] args) {

        int a = 4;
        int  b = 20;
        System.out.println("Variables before Swap: a = " + a + ", b = " + b);

        a = a + b;//a becomes 24(4 + 20)
        b = a - b;//b becomes 4(24-20)
        a = a - b;//a becomes 20(24-4)
        System.out.println(" Variables after Swap: a = " + a + ", b = " + b);
    }

}
