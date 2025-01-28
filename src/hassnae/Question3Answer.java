package hassnae;

public class Question3Answer {
    public static void main(String[] args) {
        int a = 20, b = 5;

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swap without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}




