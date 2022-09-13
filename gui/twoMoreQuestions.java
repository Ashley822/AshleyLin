package gui;
import java.util.Scanner;
public class twoMoreQuestions {
    public static void main( String[] args )
	{

        Scanner scanner = new Scanner(System.in);
		
        System.out.println( "TWO MORE QUESTIONS, BABY! " );   
        System.out.println( "Think of something and I'll try to guess it! " );   
        System.out.println();

        System.out.print( "Question 1) Does it stay inside or outside or both?" );  
        String place = scanner.next();
        System.out.print( "Question 2) Is it a living thing?" );  
        String life = scanner.next();
        if (place.equals("inside") && life.equals("yes"))
        {
            System.out.print( "Then what else could you be thinking of besides a houseplant?!?" );              
        }
        if (place.equals("inside") && life.equals("no"))
        {
            System.out.print( "Then what else could you be thinking of besides a shower curtain?!?" );              
        }
        if (place.equals("outside") && life.equals("yes"))
        {
            System.out.print( "Then what else could you be thinking of besides a bison?!?" );              
        }
        if (place.equals("outside") && life.equals("no"))
        {
            System.out.print( "Then what else could you be thinking of besides a billiboard?!?" );              
        }
        if (place.equals("both") && life.equals("yes"))
        {
            System.out.print( "Then what else could you be thinking of besides a dog?!?" );              
        }
        if (place.equals("both") && life.equals("no"))
        {
            System.out.print( "Then what else could you be thinking of besides a cell phone?!?" );              
        }

        scanner.close();
    }
}
