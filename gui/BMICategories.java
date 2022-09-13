package gui;
import java.util.Scanner;

public class BMICategories {
    public static void main( String[] args )
	{

        Scanner scanner = new Scanner(System.in);
		int weight;
		double height, BMI;

		System.out.print( "Your height in m: " );
		height = scanner.nextDouble();

		System.out.print( "You weight in kg: " );
		weight = scanner.nextInt();

        BMI = weight/(height*height);
        System.out.print( "Your BMI is" +BMI++ );

        if (BMI < 18.5)
        {
            System.out.print( "BMI Category: under weight" );   
        }
        if (BMI >= 18.5 && BMI <= 24.9 )
        {
            System.out.print( "BMI Category: normal weight" );   
        }
        if (BMI >= 25 && BMI <= 29.9 )
        {
            System.out.print( "BMI Category: over weight");  
        }
        if (BMI >= 30 )
        {
            System.out.print( "BMI Category: obese");  
        }

        scanner.close();
    }
}
