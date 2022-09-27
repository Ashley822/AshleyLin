import java.util.Scanner;

public class ageInFiveYears {
    public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		String name;

		System.out.print( "Hello. What is your name?" );
		name = keyboard.next();

		System.out.print( "Hi, " + name + "! How old are you?" );
		age = keyboard.nextInt();

		System.out.print( "Did you know that in five years you will be " +(+ age + + 5)+ " years old?");
		System.out.print( " And five years ago you were " +(+ age + - 5)+ "! Imagine that!");
		keyboard.close();
	}
}
