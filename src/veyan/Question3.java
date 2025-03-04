package veyan;

// Swap two variables' values without using a third variable

public class Question3 {
    public static void main(String[] args) {

        int a = 26;
        int b = 7;

        // Before swapping
        System.out.println("BEFORE swapping: ");
        System.out.println("Variable a = " + a + ", Variable b = " + b);

        System.out.println("-------------------");

        // swap by reassigning the values
        a = a + b; // 33
        b = a - b; // 26
        a = a - b; // 7

        System.out.println("AFTER swapping: ");
        System.out.println("Variable a = " + a + ", Variable b = " + b);
    }
}

