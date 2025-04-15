package org.example;

import java.util.Scanner;

public class FullNameGenerator {
    static Scanner input = new Scanner(System.in);

    public String firstName;
    public String middleName;
    public String lastName;
    public String suffix;

    public void fullName(){

        System.out.println("Enter your first name");
        firstName = input.nextLine().trim();

        System.out.println("Enter your middlename");
        middleName = input.nextLine().trim();

        System.out.println("Enter your lastname ");
        lastName = input.nextLine().trim();

        System.out.println("Enter your suffix");
        suffix = input.nextLine().trim();


        String fullName = firstName;

        if (!middleName.isEmpty()) {
            fullName += " " + middleName;
        }

        fullName += " " + lastName;

        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        // Print it
        System.out.println("Full name:  " + fullName);
    }







}




