import java.util.Scanner;  // before the class at top of the file

public class CtoFConverter
{
    public static void main(String[] args)
    {
        int celTemp = 0; //create int for celsius
        int fahTemp = 0; //create int for Fahrenheit
        final int FREEZING = 0; //set value for lower limit
        final int BOILING = 100; //set value for upper limit
        Scanner in = new Scanner(System.in); //Create scanner
        String bad = ""; //user for bad input which will be used as a string
        boolean done = false; //This keeps the loop going
        do
        {
            System.out.println("Enter the temp in celsius "); //gets input from user

            if (in.hasNextInt()) //captures input
            {
                celTemp = in.nextInt(); //sets celTemp to input value
                done = true; //This will kick us out of the loop with a valid input
                fahTemp =(celTemp * 9/5) + 32 ; //converts Celsius to Fahrenheit
                System.out.println(fahTemp);
            }
            else
            {
                bad = in.nextLine(); //invalid input brings us here

                System.out.println("You said the temperature was " + bad);
                System.out.println("This is not a valid temperature"); //tells user they input something wrong
                System.out.println("Press any key to continue"); //Gets user back to the top of the "do"
                in.nextLine(); //Prevents an infinite loop
            }
        } while(!done);  // initially done is false so !done is true when done is true !done is false
        if (celTemp >= BOILING) //test temp against limits
        {
            System.out.println("This is the at or above the known boiling point for water");
        }
        else if (celTemp <= FREEZING) //test temp against lower limit
        {
            System.out.println("This is at or below the known freezing point");
        }

    }
}