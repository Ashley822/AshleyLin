public class moreVariablesAndPrintingg
{

    public static void main( String[] args )
    {
        String Name, Eyes, Teeth, Hair;
        int Age, Height, Weight;
        double Cm, heightInCm;

        Name = "Ashley Lin";
        Age = 15;     // years
        Height = 66;  // centimeters
        Weight = 44; // kilograms
        Eyes = "Black";
        Teeth = "White";
        Hair = "Black";
        Cm = 2.54;
        heightInCm = Height * Cm;

        System.out.println( "Let's talk about " + Name + "." );
        System.out.println( "She's " + Height + " inches or " + heightInCm + " centimeters tall." );
        System.out.println( "She's " + Weight + " kilometers heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "She's got " + Eyes + " eyes and " + Hair + " hair." );
        System.out.println( "Her teeth are usually " + Teeth + " depending on the coffee." );

        System.out.println( "If I add " + Age + ", " + Height + ", and " + Weight
            + " I get " + (Age + Height + Weight) + "." );
    }
}