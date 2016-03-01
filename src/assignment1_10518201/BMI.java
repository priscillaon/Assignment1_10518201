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
public class BMI {
    public static void main(String [] args){
        double h, w;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println(" Your height in m: ");
        h = keyboard.nextDouble();
        
        System.out.println("Your weight in kg: ");
        w = keyboard.nextDouble();
        
        System.out.println("Your BMI is " + ( w/ (h*h)));
    }
    
}
