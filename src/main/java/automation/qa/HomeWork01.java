package automation.qa;

import java.util.Scanner;

public class HomeWork01 {

    public static void main(String[] args) {

        System.out.println("Please enter your first name");

        Scanner scanner = new Scanner (System.in);

        String firstName = scanner.next();

        System.out.println("Please enter your last name");

        String lastName = scanner.next();

        System.out.println("Please enter your age");

        int userAge = scanner.nextInt();

        System.out.println("Please enter your hobby");

        String hobby = scanner.next();

        System.out.println("Your first name is: " + firstName + ". Your last name is: " + lastName +
                ". Your age is: " + userAge +
                ". Your hobby is: " + hobby);


             }



        }








