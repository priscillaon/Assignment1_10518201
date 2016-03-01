/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kwame Oppong
 */
public class ElseAndIf {
    public static void main( String[] args )
	{
		int people = 30;
		int cars = 40;
		int buses = 15;
                
                /*
                    1. They are a group of multi-way if statements.
                       When the first if statement fails, the second
                       (else-if) is executed. When the condition in the 
                       2nd also fails, the else statement is executed.
                       
                    2. An extra statement gets printed since the first if 
                        statement no longer forms a chain with the remaining if-else statements.  
                             
                */

		if ( cars > people )
		{
			System.out.println( "We should take the cars." );
		}
		else if ( cars < people )
		{
			System.out.println( "We should not take the cars." );
		}
		else
		{
			System.out.println( "We can't decide." );
		}


		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		else if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}


		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}

	}
    
}
