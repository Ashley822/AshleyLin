package gui;

import java.util.Scanner;

public class twoQuestions {
    public static void main( String[] args )
	{

        Scanner scanner = new Scanner(System.in);
		
        System.out.println( "Two Questions! " );   
        System.out.println( "Think of an object, and I'll try to guess it. " );   
        System.out.println();

        System.out.print( "Question 1) Is it animal, vegetable, or mineral? " );  
        String answer = scanner.next();
        if (answer.equals("animal"))
        {
            System.out.print( "Question 2) Is it bigger than a breadbox? " );   
            String size = scanner.next();
            if (size.equals("yes"))
            {
                System.out.print( "My guess is that you are thinking of a moose. " );   
                System.out.print( "I would ask you if I'm right, but I don't actually care. " );  
            }
            else
            {
                System.out.print( "My guess is that you are thinking of a squirrel. " );   
                System.out.print( "I would ask you if I'm right, but I don't actually care. " );   
            }
        }

        if (answer.equals("vegetable"))
        {
            System.out.print( "Question 2) Is it bigger than a breadbox? " );   
            String size = scanner.next();
            if (size.equals("yes"))
            {
                System.out.print( "My guess is that you are thinking of a watermelon. " );   
                System.out.print( "I would ask you if I'm right, but I don't actually care. " );  
            }
            else
            {
                System.out.print( "My guess is that you are thinking of a carrot. " );   
                System.out.print( "I would ask you if I'm right, but I don't actually care. " );   
            }
        }

    
        if (answer.equals("mineral"))
        {
            System.out.print( "Question 2) Is it bigger than a breadbox? " );   
            String size = scanner.next();
            if (size.equals("yes"))
            {
                System.out.print( "My guess is that you are thinking of a Camaro. " );   
                System.out.print( "I would ask you if I'm right, but I don't actually care. " );  
            }
            else
            {
                System.out.print( "My guess is that you are thinking of a paper clip. " );   
                System.out.print( "I would ask you if I'm right, but I don't actually care. " );   
            }
        }

        scanner.close();
	}
}
