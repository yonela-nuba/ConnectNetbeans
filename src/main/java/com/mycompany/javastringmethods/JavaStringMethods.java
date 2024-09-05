/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javastringmethods;

/**
 *
 * @author RC_Student_lab
 */
public class JavaStringMethods {

    public static void main(String[] args) {
        String hello = "Hello ";
        String compare = "World";
        
        //charAt() => Returns a Character
        char results = hello.charAt(0);
        System.out.println(results);
        
        //contains() => Returns a Boolean        
        System.out.println(hello.contains("Hello"));
        
        //length() => Returns an Integer
        System.out.println(hello.length());
        
        //CompareTo() => Returns an Integer
        System.out.println(hello.compareToIgnoreCase(compare));
        
        //endsWith() => Returns a Boolean
        System.out.println(hello.endsWith("Worl"));
        
        //concat() => Returns String
        System.out.println(hello.concat(compare));
        
        //equals() => Returns Boolean
        System.out.println(hello.equals("Hello "));
        
        /*
        Create a method with parameter email. Your method should
        check if the email has the '@' and also contains
        either (.com, .ca.za, .org).Your function should display
        "Correct email" if it meets the requirements and 
        "Wrong email format" if it does not meet the requirements
        */
    }
}
