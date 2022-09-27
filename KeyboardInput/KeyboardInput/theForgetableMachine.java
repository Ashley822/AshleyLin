import java.util.Scanner;

public class theForgetableMachine {
    public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int favoriteNumber, secondFavoriteNumber;
		String word, secondWord;

		System.out.print( "Give me a word! " );
		word = keyboard.next();
		System.out.println("" + word +  "");

		System.out.print( "Give me a second word! " );
		secondWord = keyboard.next();
		System.out.println("" + secondWord +  "");

		System.out.print( "Great, now your favorite number? " );
		favoriteNumber = keyboard.nextInt();
		System.out.println("" + favoriteNumber +  "");

        System.out.print( "And your second-favorite number... " );
		secondFavoriteNumber = keyboard.nextInt();
		System.out.println("" + secondFavoriteNumber +  "");

		System.out.print( "Whew! Wasn't that fun? " );
		keyboard.close();
	}
}
