package ForLoop;
import java.util.Scanner;

public class countinMachine
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print( "Count to: ");
        int number = keyboard.nextInt();


        for ( int n = 0 ; n <= +number ; n = n+1 )
        {
            System.out.print( +n+ " ");
        }

    }
}