package IFStatement;
import java.util.Scanner;

public class howOldAreYouu {
    public static void main( String[] args )
	{

        Scanner scanner = new Scanner(System.in);
		
        System.out.print( "What's your name? " );   
        String name = scanner.next();
        
        System.out.println();
        System.out.print( "Ok" +name+ ", how old are you? " );  
      
        int age = scanner.nextInt();
        System.out.println();
		
		if ( age < 16 )
		{
			System.out.println( name + ", you can't drive." );   
        }
        else 
        {
            System.out.println( name + ", you can drive." ); 
        }

        if ( age < 18 )
		{
			System.out.println( name + ", you can't vote." );
        }
        else 
        {
            System.out.println( name + ", you can vote." ); 
        }

        if ( age < 25 )
		{
			System.out.println( name + ", you can't rent a car." );
        }
        else
		{
			System.out.println( name + ", you can do anything that's legal." );
        }

        scanner.close();
	}
}
