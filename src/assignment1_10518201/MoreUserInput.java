/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_10518201;

/**
 *
 * @author Kwame Oppong
 */
import java.util.Scanner;
public class MoreUserInput {
    public static void main(String [] args ){
        Scanner keyboard = new Scanner(System.in);
        String fName, lName, login, id;
        double gpa;
        int grade;
        
        System.out.println("Please enter the following information so I can sell it for a profit.");
        System.out.println("First name: ");
        fName = keyboard.next();
        
        System.out.println("Last name: ");
        lName = keyboard.next();
        
        System.out.println("Grade (9-12): ");
        grade = keyboard.nextInt();
        
        System.out.println("Student ID: ");
        id = keyboard.next();
        
        System.out.println("Login: ");
        login = keyboard.next();
        
        System.out.println("GPA (0.0-4.0): ");
        gpa = keyboard.nextDouble();
        
        System.out.println("Your information: ");
        System.out.println("\t login: "+ login);
        System.out.println("\t ID: " + id);
        System.out.println("\t Name: " + fName  + ", " + lName);
        System.out.println("\t GPA: " + gpa);
        System.out.println("\t Grade: " + grade);
        
    }
    
}
