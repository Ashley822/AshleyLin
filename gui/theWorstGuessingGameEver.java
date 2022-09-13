package gui;
import java.util.Scanner;

public class theWorstGuessingGameEver 
{
    
    public static void main( String[] args )
    
	{
        Scanner scanner = new Scanner(System.in);

    System.out.print( "TEH WORST NUBMER GESSING GAME EVAR!!!!!!!" );
    System.out.print( "I'M THKING OF A NBR FROM 1-10. TRY 2 GESS!" );  
  
        int number = scanner.nextInt();
        if (number <= 9)
        {
            System.out.print( "W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS 4!" );
        }
        else
        {
            System.out.print( "LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS 10!" );
        }

        scanner.close();
    }
   
}
