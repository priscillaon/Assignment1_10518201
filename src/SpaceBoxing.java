/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kwame Oppong
 */
import java.util.Scanner;
public class SpaceBoxing {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        
        double w; 
        int p;
        
        System.out.println("Please enter your current earth weight. ");
        w = keyboard.nextDouble();
        
        System.out.println("I have information for the following planets"
                + "\n \t 1. Venus \t 2. Mars \t  3. Jupiter \n \t 4. Saturn  \t 5. Uranus  \t 6. Neptune");
        
        System.out.println("Which planet are you visiting? ");
        p = keyboard.nextInt();
        
        if ( p == 1)
        {
            System.out.println("Your weight would be " + (0.78 * w) + " on that planet.");
        }
        else  if ( p == 2)
        {
            System.out.println("Your weight would be " + (0.39 * w) + " on that planet.");
        }
        else  if ( p == 3)
        {
            System.out.println("Your weight would be " + (2.65 * w) + " on that planet.");
        }
        else  if ( p == 4)
        {
            System.out.println("Your weight would be " + (1.17 * w) + " on that planet.");
        }
        else  if ( p == 5)
        {
            System.out.println("Your weight would be " + (1.05 * w) + " on that planet.");
        }
        else  if ( p == 6)
        {
            System.out.println("Your weight would be " + (1.23 * w) + " on that planet.");
        }
        
               
        
    }
    
}
