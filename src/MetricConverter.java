import java.util.Scanner; //import scanner tool
public class MetricConverter
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        double meters = 0; //sets double
        String bad = ""; //bad data dump
        boolean done = false; //loop checker

        do
        {
            System.out.println("What is the amount of meters?");

            if (in.hasNextInt()) {
                meters = in.nextDouble(); //sets meters to user input
                done = true; //moves on to next section
            } else {
                bad = in.nextLine(); //in case they do not enter a number
                System.out.println("Please enter a number, you entered " + bad);
            }

        } while(!done);

        System.out.println("Your meters convered to inches is " + meters * 39.3701); //Converts input to measurement
        System.out.println("Your meters convered to feet is " + meters * 3.28084); //Converts input to measurement
        System.out.println("Your meters convered to miles is " + meters * .000621371); //Converts input to measurement
    }
}
