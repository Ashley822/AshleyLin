import java.util.Scanner;
 
public class lab1 {
    public static void main(String[] args) {
 
        Scanner keyboard = new Scanner(System.in);
        int myGrade1, myGrade2, myGrade3, mySum;
        double myAverage, myVariance, mySTD;
        System.out.println("Enter grade 1:");
        myGrade1 = keyboard.nextInt();
        System.out.println("Enter grade 2:");
        myGrade2 = keyboard.nextInt();
        System.out.println("Enter grade 3:");
        myGrade3 = keyboard.nextInt();
        mySum = myGrade1 + myGrade2 + myGrade3;
        System.out.print("Sum of three grades is: " + mySum);
        myAverage = (double) mySum / 3;
        System.out.println("Average value of three grades:" + myAverage);
        myVariance = (Math.pow((myGrade1 - myAverage), 2) + Math.pow((myGrade2 - myAverage), 2)
                + Math.pow((myGrade3 - myAverage), 2)) / 3;
        System.out.println("The Variance of 3 values: " + myVariance);
        mySTD = Math.sqrt(myVariance);
        System.out.println("Standard deviation:" + mySTD);
        
        keyboard.close();
 
    }
}
