import java.sql.SQLOutput;
import java.util.Scanner; //imports scanner tool
import java.util.concurrent.LinkedTransferQueue;


public class FuelCost
{
    public static void  main(String[] args)
    {
        Scanner in =new Scanner(System.in);

        double gallons=0; //declare all ints
        int mpg=0; //rounds to the nearest whole number
        double gasPrice=0; //this is a double to account for cents
        double cost =0; // will be used for calculations
        String bad = ""; //For bad inputs
        boolean done = false; //makes the loop go

        do
        {
            System.out.println("How many Gallons of gas do you have in the tank?");

            if(in.hasNextDouble())
            {
                gallons = in.nextDouble(); //sets gallons to user input
                done =true; //moves on to next section
            }
            else
            {
                bad=in.nextLine(); //in case they do not enter a number
                System.out.println("Please enter a number, you entered "+ bad);
            }
        }while(!done);

        done = false; //reset done to trigger next input

        do
        {
            System.out.println("What is your car's fuel economy?");
            if(in.hasNextInt())
            {
                mpg = in.nextInt(); //Sets MPG to user input
                done =true; //moves on to next section
            }
            else
            {
                bad=in.nextLine(); //in case they do not enter a number
                System.out.println("Please enter a number, you entered "+ bad);
            }
        }while(!done);

        done = false; //reset done to trigger next input

        do
        {
            System.out.println("What is the price per Gallon?");
            if(in.hasNextDouble())
            {
                cost=in.nextDouble(); //sets cost to user input
                done =true; //moves on to next section
            }
            else
            {
                bad=in.nextLine(); //in case they do not enter a number
                System.out.println("Please enter a number, you entered "+ bad);
            }
        }while(!done);
        System.out.println("You can make it " + (mpg*gallons) + " miles before you have to fill up"); //tells user how long they have remaining
        System.out.println("Your cost per 100 miles is $"+ (cost/mpg*100)); //calculates cost per 100 miles

    }
}
