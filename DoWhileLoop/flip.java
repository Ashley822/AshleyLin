package DoWhileLoop;
import java.util.Scanner;
import java.util.Random;

public class flip
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();
        System.out.print( "do u want to try?(y/n)" );
        String again = keyboard.next();

		while ( again.equals("y") )
		{
			int flip = rng.nextInt(2);
			String coin;

			if ( flip == 1 )
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println( "You flip a coin and it is... " + coin );

			System.out.print( "Would you like to flip again (y/n)? " );
			again = keyboard.next();
		}
	}
}