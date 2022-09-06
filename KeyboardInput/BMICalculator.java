import java.util.Scanner;

public class BMICalculator {
    public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int weight;
		double height;

		System.out.print( "Your height in m: " );
		height = keyboard.nextDouble();

		System.out.print( "You weight in kg: " );
		weight = keyboard.nextInt();

        System.out.println( "Your BMI is" +(+weight++/ +(+height++ * +height++)));

        keyboard.close();

	}
}
