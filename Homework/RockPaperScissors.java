package Homework;
import java.util.Scanner;

public class RockPaperScissors 
{

	public static void main(String[] args) 
	{
		int userChoice;
		int result;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Rock, Paper Scissors!\n" +
		"Please enter your choice.\n" + "Rock = 1, Paper = 2" +
				"and Scissor = 3.");
		userChoice = input.nextInt();
		
		// assign subclass reference to a subclass variable
		Computer end = new Computer(userChoice);
		
		System.out.println("If you feel good about your selection, press 1, " +
				"otherwise press 2.");
		result = input.nextInt();
		
		if(result == 1)
		{
			end.Value(userChoice); // call Game class' Value object with subclass
		}
		else if(result == 2)
		{
			end.PolymorphismEnd(); // call Game class' PolymorphismEnd object with subclass
	}
	end.Display();
	}
}
