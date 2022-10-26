package ForLoop;
import java.util.Scanner;

public class countingMachine2
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print( "Count from: ");
        int from = keyboard.nextInt();
        System.out.print( "Count to: ");
        int number = keyboard.nextInt();
        System.out.print( "Count by: ");
        int by = keyboard.nextInt();


        for ( int n = from ; n <= number ; n = n+by )
        {
            System.out.print( +n+ " ");
        }

    }
}