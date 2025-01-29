package Estela;

public class Question3Answer {
    public static void main(String[] args) {
        //Swap two variables' values without using a third variable


    int a = 4;
    int  b = 20;
        System.out.println("Variables before Swap: a = " + a + ", b = " + b);

    a = a + b;//a becomes 24(4 + 20)
    b = a - b;//b becomes 4(24-20)
    a = a - b;//a becomes 20(24-4)
        System.out.println(" Variables after Swap: a = " + a + ", b = " + b);
}
}
