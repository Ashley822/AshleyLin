package WhileLoop;
import java.util.Scanner;
public class countingWithAWhileLoop
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println( "Type in a message, and I'll display it however many times you want." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
		System.out.print( "How many times? " );
		int time = keyboard.nextInt();
		
		int n = 0;
		while ( n < time )
		{
			System.out.println( (10*n+10) + ". " + message );
			n++;
		}

	}
}