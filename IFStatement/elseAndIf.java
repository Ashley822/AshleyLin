package IFStatement;

public class elseAndIf {
    public static void main( String[] args )
	{
		int people = 30;
		int cars = 40;
		int buses = 15;

		if ( cars > people ) // if statement
        {
			System.out.println( "We should take the cars." ); // if if statement if true, this if statement will be performed.
        }
		else if ( cars < people ) // else if statement
        {
			System.out.println( "We should not take the cars." ); // if is statement if not true and else if statement is true, else if statement will be performed.
		}

		else // else statement
        {
			System.out.println( "We can't decide." ); // if if statement and else if statement is not true, else if statement is true,  else statement will be performed.
		}
		

		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		else if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}


		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}
        //else if and else is that if specific statement is true, perform the originial funciton. It the specific statement is not true, perform the else function.
        //there's no difference between the result. if the if statement is true, it will be preformed. If the if statement is not true, else if statement will be performed.
	}
}
