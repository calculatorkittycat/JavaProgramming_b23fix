package day_34_LocalDateTime_Wrapper;

public class PasswordValidation {

    public static void main(String[] args) {

        String password = "Cyb3rTek1!";

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;

        for (char each : password.toCharArray()) {

            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r4 = true;
            } else {
                r5 = true;

            }


        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5 ;

        System.out.println("isStrongPassword = " + isStrongPassword);

    }

}

/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */