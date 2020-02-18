package com.userregistration;

public class UserRegistration {
    String VALIDATE_NAME="^[A-Z]{1}[a-z]{2,}$";
    String VALIDATE_EMAIL= "^[a-z]{3,}[.|+|_|-]?[a-zA-Z0-9]{3,}?[.|+|_|-]{0}[@][a-zA-Z]{2,}[.][a-z]{2,3}[.]?[a-z]{2,3}?$";
    String VALIDATE_PHONE_NUMBER="^[0-9]{1,3}[ ][1-9]{1}[0-9]{9}$";
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
}
