package com.bridgelabz;

import java.util.*;
import java.util.regex.*;

public class UserRegistrationSystem {
    /*
     * Adding Functional Interface, which is used to declare an interface as
     * functional interface.
     */
    @FunctionalInterface
    interface DataValidate {
        void Validator();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration System");
        /*
         * Using Lambda Function For The First Name
         */
        DataValidate FirstName = () -> {
            Scanner sc = new Scanner(System.in);
            String regex = "^[A-Z]{1}[a-z]{2,}$";
            System.out.println("Enter your First Name: ");
            String name = sc.next();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches())
                return;
            else
                System.out.println("First Name is not valid");
        };
        FirstName.Validator();


        /*
         * Using Lambda Function For The Last Name
         */
        DataValidate LastName = () -> {
            Scanner sc = new Scanner(System.in);
            String regex = "^[A-Z]{1}[a-z]{2,}$";
            System.out.println("Enter your Last Name: ");
            String name = sc.next();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches())
                return;
            else
                System.out.println("Last Name is not valid");
        };
        LastName.Validator();
        /*
         * Using Lambda Function For The EMail
         */
        DataValidate EMail = () -> {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Email Id: ");
            String email = sc.next();
            Pattern pattern = Pattern.compile("^([a-z0-9]+.)+@([a-z0-9]+.)([a-z]+.)[a-z]{2,3}+$");
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches())
                return;
            else
                System.out.println("Given Email Id is not valid");
        };
        EMail.Validator();
        /*
         * Using Lambda Function For The Mobile Number
         */
        DataValidate Mobile = () -> {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Mobile Number: ");
            String mobile = sc.nextLine();
            Pattern pattern = Pattern.compile("^[0-9]{2}[ ]{1}[0-9]{10}+$");
            Matcher matcher = pattern.matcher(mobile);
            if (matcher.matches())
                return;
            else
                System.out.println("Mobile number is not valid");
        };
        Mobile.Validator();
    }
}
