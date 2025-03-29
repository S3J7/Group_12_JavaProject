package Estela;

public class Question8 {
    //Write a return method that can reverse  String
    //         Ex: Reverse("ABCD"); ==> DCBA
    public static void main(String[] args) {
        String input = "Cydeo";
        String reversed = "";

        for(int i = input.length()-1; i >= 0; i--){
            reversed += input.charAt(i);
        }
        System.out.println(reversed);
    }
}
