/** 
 * ACS-1904 edit this
 * your name
 * your student number
*/
import java.util.Scanner;

public class TotalNumbers{
    public static void main (String[] args) {
        int total = 0;
        int n = 0;
        
        // create a Scanner object to get keyboard input
        Scanner kb = new Scanner (System.in) ;
        
        // get the initial value for the while loop control variable
        System.out.println ("Enter a number (q to quit): ") ;
        String input = kb . next () ;
        
        while (!input.equals("q")) {
            
            // make your code impervious to clumsy or careless user input.
            try{
                n = Integer.parseInt(input) ;
                total += n;
            }// end try
            catch(NumberFormatException e){
                System.out.println("sorry invalid input, please enter an int.");
            }// end catch
            
            // update the control variable, you know what happens if we don't do this!
            System.out.println("Enter a number (q to quit):") ;
            input = kb.next();
        }//end while
        
        // bye bye
        System.out.println("The total of numbers is "+ total) ;
    }
}

