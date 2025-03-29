package Estela;

import java.sql.SQLOutput;

public class Question9 {
    public static boolean isValidPassword(String password) {

        // Write a return method that can verify if a password is valid or not.
        //         requirements:



        if (password.length() < 6) {
            return false;
        }
        if (password.contains(" ")) {
            return false;
        }
        //         2. PassWord should at least contain one upper-case letter
        //         3. PassWord should at least contain one lowercase letter
        //         4. Password should at least contain one special character
        //         5. Password should at least contain a digit
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // ) Check each character
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                // If it's not letter or digit, it's a special character
                hasSpecialChar = true;
            }

        }

        // Return true only if all conditions are met
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
        //         if all requirements above are met, the method returns true, otherwise returns  false

    }
    public static void main(String[] args) {
        System.out.println("Is valid password: " + isValidPassword("Cydeo2025!"));
    }




    }

