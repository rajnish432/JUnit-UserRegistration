package com.userregistration;

public class UserRegistration {
    String VALIDATE_NAME="^[A-Z]{1}[a-z]{2,}$";
    String VALIDATE_EMAIL= "^[a-z]{3,}[.|+|_|-]?[a-zA-Z0-9]{3,}?[.|+|_|-]{0}[@][a-zA-Z]{2,}[.][a-z]{2,3}[.]?[a-z]{2,3}?$";
    String VALIDATE_PHONE_NUMBER="^[0-9]{1,3}[ ][1-9]{1}[0-9]{9}$";
    String VALIDATE_PASSWORD_WITH_RULE_1= "^(?=.[a-zA-Z0-9]).{8,}$";
    String VALIDATE_PASSWORD_WITH_RULE_2="^(?=.*[A-Z])(?=.[a-zA-Z0-9]).{8,}$";
    String VALIDATE_PASSWORD_WITH_RULE_3= "^(?=.*[0-9])(?=.*[A-Z])(?=.[a-zA-Z]).{8,}$";
    String VALIDATE_PASSWORD_WITH_RULE_4= "^(?=.*[A-Z])(?=.[a-zA-Z])(?=.*[0-9])(?=[^@|#|$|%|^|&|+|=]*[@|#|$|%|^|&|+|=][^@|#|$|%|^|&|+|=]*$).{8,}$";
    public boolean validateFirstName(String firstName)
    {
        if (firstName.matches(VALIDATE_NAME)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean validateLastName(String lastName)
    {
        if (lastName.matches(VALIDATE_NAME)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean validateEmailID(String emailID)
    {
        if (emailID.matches(VALIDATE_EMAIL)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean validatePhoneNumber(String phoneNumber)
    {
        if (phoneNumber.matches(VALIDATE_PHONE_NUMBER)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome To User Registration");
    }

    public boolean validatePassword(String password)
    {
        if (password.matches(VALIDATE_PASSWORD_WITH_RULE_1)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean validatePasswordWithRule2(String password)
    {
        if (password.matches(VALIDATE_PASSWORD_WITH_RULE_2)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean validatePasswordWithRule3(String password)
    {
        if (password.matches(VALIDATE_PASSWORD_WITH_RULE_3)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean validatePasswordWithRule4(String password)
    {
        if (password.matches(VALIDATE_PASSWORD_WITH_RULE_4)) {
            return true;
        }
        else {
            return false;
        }
    }
}
