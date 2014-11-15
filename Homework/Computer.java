package Homework;

// class Computer generates a random number to represent
// the computer's choice determines the winner between
// the user and the computer
public class Computer extends Game
{
	// A private integer variable used to store the random
	// numbers created by generator method.
	private int randoms = generator();
	
	// constructor with one parameter
	public Computer(int user)
	{
		super(user);
	}
	
	// Creating a random number to represent the computer's choice
	public int generator()
	{
		int num = 1 + (int)(Math.random() * 3);
		return num;
	} // end method generator
	
	// display winner or loser depending upon user's choice
	public void Display()
	{
		if(super.getPlay() == randoms)
		{
			System.out.println("Its a tie!");
		}
		else if(super.getPlay() == (1))
		{
			if(randoms == (3))
			 System.out.println("Rock crushes scissors. You win!");
		else if(randoms == (2))
			System.out.println("Paper covers rock. You lose!");
		}
		else if(super.getPlay() == (2))
		{
			if(super.getPlay() == (3))
				System.out.println("Scissors cuts paper. You lose!");
			else if(randoms == (1))
				System.out.println("Paper covers rock. You win!");
		}
		else if(super.getPlay() == (3))
		{
			if(randoms == (2))
				System.out.println("Scissors cut paper. You win!");
				else if(randoms == (1))
					System.out.println("Rock crushes scissors. You lose!");
		}
	} // method Display
} // class Computer
