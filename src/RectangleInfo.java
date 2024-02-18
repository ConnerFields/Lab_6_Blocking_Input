import java.util.Scanner; //imports scanner tool
public class RectangleInfo
{
    public static void main(String[]args)
    {
        Scanner in =new Scanner(System.in);
        int width = 0; //initialize integers
        int length = 0;
        double diagonal = 0;
        String bad = "";// incorrect info dump
        boolean done = false; //Loop check

        do
        {
            System.out.println("What is the width?");

            if(in.hasNextInt())
            {
                width = in.nextInt(); //sets width to user input
                done =true; //moves on to next section
            }
            else
            {
                bad=in.nextLine(); //in case they do not enter a number
                System.out.println("Please enter a number, you entered "+ bad);
            }
        }while(!done); //moves to next section

        done = false; //reset done to trigger next input

        do
        {
            System.out.println("What is the length of the rectangle?");
            if(in.hasNextInt())
            {
                length = in.nextInt(); //Sets length to user input
                done =true; //moves on to next section
            }
            else
            {
                bad=in.nextLine(); //in case they do not enter a number
                System.out.println("Please enter a number, you entered "+ bad);
            }
        }while(!done); //moves to next section

        done = false; //reset done to trigger next input

        diagonal = Math.sqrt((width*width)+(length*length)); //math stuff could probably be more efficient

        System.out.println("The parameter is "+ ((width*2)+(length*2))); //simple math
        System.out.println("The area of the rectangle is "+(width * length)); //multiple values to get the area
        System.out.println("The diagonal of the rectangle is " + diagonal); // calls on diagonal

    }
}
