/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javastringmethods;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class ClassWork {
    //Create a method
    public static void main(String[] args) {
        //declaration
        String email;
        
        //Create object of the scanner
        Scanner sc = new Scanner(System.in);
        
        //Prompt the user to enter email
        System.out.print("Enter your email");
        email = sc.next();
        
        checkEmail(email);
    }
    
    //Create a method 
    public static void checkEmail(String email){
        if(email.contains("@") && (email.endsWith("com") ||
                email.endsWith(".co.za") || email.endsWith(".org"))){
            System.out.println("Correct Email !");
        }
        else{
            System.out.println("Wrong email format");
        }
    }
}
/*
1+1 + (2*3+4)
         10
*/