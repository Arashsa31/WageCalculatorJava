import java.util.Scanner;

/**
 * @author Arash
 * This program takes user total hours and hourly wage and outputs a wage, assuming full time hours is 40+ and overtime pay is 1.5x. 
 */
public class WageCalculator 
{
	public static void main(String[] args) 
	{
		//take user input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter hours worked:");
		double hours = keyboard.nextDouble();
		System.out.print("Please enter wage per hour:");
		double wage = keyboard.nextDouble();
		
		//prints total wage
		System.out.printf("Your total wage is %.2f.", paycheck(hours, wage));
		
		//close scanner object
		keyboard.close();		
	}
	
    static double paycheck(double hours, double wage) 
    {
    	double paycheck, overtimeRate, overtimeHours;
    	overtimeRate = 1.5;
    	overtimeHours = 40;
    	
    	//check if worked less or equal to 40 hours
    	if (hours <= overtimeHours) 
    		{
	    		//calculate base pay
	    		paycheck = hours * wage;
    		}
        else
        	{
	        	//calculate overtime pay
	        	paycheck = (hours * wage) + (wage * overtimeRate) * (hours - overtimeHours);
        	}
        return paycheck;
    }
	
}
