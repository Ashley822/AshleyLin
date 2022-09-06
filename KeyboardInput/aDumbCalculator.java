import java.util.Scanner;

public class aDumbCalculator {
    public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int firstNumber, secondNumber, thirdNumber;

		System.out.print( "What is your first number?" );
		firstNumber = keyboard.nextInt();

        System.out.print( "What is your seond number?" );
		secondNumber = keyboard.nextInt();

        System.out.print( "What is your third number?" );
		thirdNumber = keyboard.nextInt();

        System.out.println( "(" +firstNumber+ " + " +secondNumber+ " + " +thirdNumber+ ") / 2 = " + ( +firstNumber+ + +secondNumber+ + +thirdNumber++)/2 );
        keyboard.close();

	}
}
