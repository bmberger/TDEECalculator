/**
 * This program illustrates the use of logigal operators to calculate 
 * total daily energy expenditure.
 *
 * @author Briana Berger
 * @version 10/22/2017
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double activityFactor = 0.0;
        double TDEE = 0.0;

        //Gather input
        System.out.println("TDEE Calculator");
        System.out.println();
        System.out.println("What is your name?: ");
        String name = in.nextLine();
        System.out.println("What is your physical gender? (M/F): ");
        String gender = in.next();
        System.out.println("What is your BMR?: ");
        double BMR = in.nextDouble();
        System.out.println("Select Your Activity Level:");
        System.out.println("  [A] Resting (Sleeping, Reclining)");
        System.out.println("  [B] Sedentary (Minimal Movement)");
        System.out.println("  [C] Light (Sitting, Standing)");
        System.out.println("  [D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println("  [E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("  [F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");
        System.out.println();
        System.out.println("Enter the letter corresponding to your activity level: ");
        String activityLevel = in.next();

        //Determine TDEE
        if(activityLevel.equalsIgnoreCase("A") && gender.equalsIgnoreCase("F"))
        {
            activityFactor = 1.0;
        }
        else if(activityLevel.equalsIgnoreCase("B") && gender.equalsIgnoreCase("F"))
        {
            activityFactor = 1.3;
        }
        else if(activityLevel.equalsIgnoreCase("C") && gender.equalsIgnoreCase("F"))
        {
            activityFactor = 1.5;
        }
        else if(activityLevel.equalsIgnoreCase("D") && gender.equalsIgnoreCase("F"))
        {
            activityFactor = 1.6;
        }
        else if(activityLevel.equalsIgnoreCase("E") && gender.equalsIgnoreCase("F"))
        {
            activityFactor = 1.9;
        }
        else if(activityLevel.equalsIgnoreCase("F") && gender.equalsIgnoreCase("F"))
        {
            activityFactor = 2.2;
        }
        else if(activityLevel.equalsIgnoreCase("A") && gender.equalsIgnoreCase("M"))
        {
            activityFactor = 1.0;
        }
        else if(activityLevel.equalsIgnoreCase("B") && gender.equalsIgnoreCase("M"))
        {
            activityFactor = 1.3;
        }
        else if(activityLevel.equalsIgnoreCase("C") && gender.equalsIgnoreCase("M"))
        {
            activityFactor = 1.6;
        }
        else if(activityLevel.equalsIgnoreCase("D") && gender.equalsIgnoreCase("M"))
        {
            activityFactor = 1.7;
        }
        else if(activityLevel.equalsIgnoreCase("E") && gender.equalsIgnoreCase("M"))
        {
            activityFactor = 2.1;
        }
        else if(activityLevel.equalsIgnoreCase("F") && gender.equalsIgnoreCase("M"))
        {
            activityFactor = 2.4;
        }
        else if (gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F"))
        {
            System.out.println();
            System.out.println("Sorry! Your input for Activity Level is not an option. Please try again.");
            return;
        }
        else
        {
            System.out.println();
            if((activityLevel.equalsIgnoreCase("A") || activityLevel.equalsIgnoreCase("B") || activityLevel.equalsIgnoreCase("C") 
            || activityLevel.equalsIgnoreCase("D") || activityLevel.equalsIgnoreCase("E") || activityLevel.equalsIgnoreCase("F")) != true)
            {
                System.out.println("Sorry! Your input for Activity Level and Gender is not an option. Please try again.");
            }
            else
            {
                System.out.println("Sorry! Your input for Gender is not an option. Please try again.");
            }
            return;
        }
        
        TDEE = BMR * activityFactor;
                
        //Output
        System.out.println();
        System.out.println();
        System.out.println("Your Results:");
        System.out.print("Name: " + name);
        System.out.println("        " + "Gender: " + gender.toUpperCase());
        System.out.print("BMR: " + BMR + " calories");
        System.out.println("        " + "Activity Factor: " + activityFactor);
        System.out.println("TDEE: " + TDEE + " calories");
    }
}