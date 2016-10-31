package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner Function = new Scanner(System.in);
        System.out.println("Welcome to the calculator\nPlease input which function you would like to use\n\n(add, subtract, multiply, divide)");
        String ending = Function.next();

        if (ending.toLowerCase().equals("add")) {
            System.out.println("First number?");
            int first = Function.nextInt();
            System.out.println("Second number?");
            int second = Function.nextInt();
            int theEnd = first + second;
            Double finalending = Math.sqrt(theEnd);
            System.out.println("The answer is" + finalending);
            System.out.println("Good response, (Y) or (N)");
            String answer = Function.next();
            if (answer.toLowerCase().equals("y")) {
                System.out.println("Thanks, it's wrong");
            } else {
                System.out.println("Can you figure out what's wrong");
                String helloo = Function.next();
                if (helloo.toLowerCase().equals("square root")) {
                    System.out.println("Good job");
                } else
                    System.out.println("Nope, fooled ya.");
            }
        }
        if (ending.toLowerCase().equals("subtract")) {
            System.out.println("First number?");
            int first = Function.nextInt();
            System.out.println("Second number?");
            int second = Function.nextInt();
            int theEnd = first - second;
            Double finalending = Math.sqrt(theEnd);
            System.out.println("The answer is" + finalending);
            System.out.println("Good response, (Y) or (N)");
            String answer = Function.next();
            if (answer.toLowerCase().equals("y")) {
                System.out.println("Thanks, it's wrong");
            } else {
                System.out.println("Can you figure out what's wrong");
                String helloo = Function.next();
                if (helloo.toLowerCase().equals("square root")) {
                    System.out.println("Good job");
                } else
                    System.out.println("Nope, fooled ya.");

            }

        }
        if (ending.toLowerCase().equals("multiply")) {
            System.out.println("First number?");
            int first = Function.nextInt();
            System.out.println("Second number?");
            int second = Function.nextInt();
            int theEnd = first * second;
            Double finalending = Math.sqrt(theEnd);
            System.out.println("The answer is" + finalending);
            System.out.println("Good response, (Y) or (N)");
            String answer = Function.next();
            if (answer.toLowerCase().equals("y")) {
                System.out.println("Thanks, it's wrong");
            } else {
                System.out.println("Can you figure out what's wrong");
                String helloo = Function.next();
                if (helloo.toLowerCase().equals("square root")) {
                    System.out.println("Good job");
                } else
                    System.out.println("Nope, fooled ya.");
            }

        }
        if (ending.toLowerCase().equals("divide")) {
            System.out.println("First number?");
            int first = Function.nextInt();
            System.out.println("Second number?");
            int second = Function.nextInt();
            int theEnd = first / second;
            Double finalending = Math.sqrt(theEnd);
            System.out.println("The answer is" + finalending);
            System.out.println("Good response, (Y) or (N)");
            String answer = Function.next();
            if (answer.toLowerCase().equals("y")) {
                System.out.println("Thanks, it's wrong");
            } else {
                System.out.println("Can you figure out what's wrong");
                String helloo = Function.next();
                if (helloo.toLowerCase().equals("square root")) {
                    System.out.println("Good job");
                } else
                    System.out.println("Nope, fooled ya.");
            }
        }
     }
}
