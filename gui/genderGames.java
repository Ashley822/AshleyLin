package gui;
import java.util.Scanner;

public class genderGames 
{
    
    public static void main( String[] args )
	{

        Scanner scanner = new Scanner(System.in);
		
        System.out.print( "What is your gender (M or F):" );   
        String gender = scanner.next();

        System.out.print( "First name:" );   
        String firstName = scanner.next();

        System.out.print( "Last name:" );   
        String lastName = scanner.next();

        System.out.print( "age:" );   
        int age = scanner.nextInt();

        System.out.print( "Are you married," +firstName+ "(y or n)? " );   
        String marry = scanner.next();

        if (age < 20)
        {
            System.out.print( "Then I shall call you" +firstName+ " " +lastName+ "." );   
        }
        else if (gender.equals("m"))        
        {
            System.out.print( "Then I shall call you Mr. " +lastName + "." );   
        }
        else if (marry.equals("y")) 
        {
            System.out.print( "Then I shall call you Mrs. " +lastName + ".");  
        }
        else
        {
            System.out.print( "Then I shall call you Ms. " + lastName +  ".");  
        }

        scanner.close();
    }
}
