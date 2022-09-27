import java.util.Scanner;

public class moreUserImputsOfData {
    public static void main( String[] args )
    {
		Scanner keyboard = new Scanner(System.in);

		int grade, studentID ;
		String firstName, lastName, loginName ;
		double GPA;

		System.out.print( "Please enter the following information so I can sell it for a profit! " );

        System.out.print( "First Name:" );
		firstName = keyboard.next();

        System.out.print( "Last Name:" );
		lastName = keyboard.next();

		System.out.print( "Grade (9-12):" );
		grade = keyboard.nextInt();

		System.out.print( "Student ID:");
		studentID = keyboard.nextInt();

        System.out.print( "Login:");
		loginName = keyboard.next();

        System.out.print( "GPA(0.0-4.0:");
		GPA = keyboard.nextInt();

		System.out.println( "Your information:" );
        System.out.println( "   Login:" + loginName +"");
        System.out.println( "   ID:" + studentID ++);
        System.out.println( "   Name:" + firstName + ", " + lastName +"");
        System.out.println( "   GPA:" + GPA ++);
        System.out.println( "   Grade:" + grade ++);
        keyboard.close();
	} 
}
