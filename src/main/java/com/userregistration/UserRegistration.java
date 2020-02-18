package com.userregistration;

public class UserRegistration {
    String VALIDATE_NAME="^[A-Z]{1}[a-z]{2,}";
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

    public static void main(String[] args) {
        System.out.println("Welcome To User Registration");

    }
}
