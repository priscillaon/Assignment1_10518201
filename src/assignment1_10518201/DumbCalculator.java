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
public class DumbCalculator {
    
    public static void main(String args[]){
        
        Scanner keyboard = new Scanner(System.in);
        int a1, a2, a3;
        System.out.println("What is your first number? ");
        a1 = keyboard.nextInt();
        
         System.out.println("What is your second number? ");
        a2 = keyboard.nextInt();
        
         System.out.println("What is your third number? ");
         a3 = keyboard.nextInt();
         
         System.out.println("(" + a1 + " + " + a2 + " + " + a3 + " ) / 2 is ...." + (a1+a2+a3)/2);
    }
    
}
