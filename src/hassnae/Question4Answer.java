package hassnae;

public class Question4Answer {
    public static void main(String[] args) {

        //Reverse Negative Number
        //Write a return method that can reverse digits of a negative number and return it as int
        //input: -35  output: -53
        int num = -35;
        int result = reverseMethod(num);
        System.out.println(result);
    }

    // Reverse method
    public static int reverseMethod(int num){
        int reverseNum = 0;
        while(num!=0)
        {
           reverseNum = reverseNum * 10 + num % 10;
            num = num / 10;
        }
        return reverseNum;
    }
    }

