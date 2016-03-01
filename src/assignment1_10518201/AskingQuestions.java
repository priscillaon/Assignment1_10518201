/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_10518201;

/**
 *
 * @author Kwame Oppong
 */import java.util.Scanner;
public class AskingQuestions {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);

		int age;
		int h1, h2;
		double weight;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How tall are you? Enter height in feet followed by height in inches" );
		h1 = keyboard.nextInt();
                h2 = keyboard.nextInt();

		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + " old, " + h1 + "feet " + h2 + " inches tall and " + weight + " heavy." );
    }
    
}
