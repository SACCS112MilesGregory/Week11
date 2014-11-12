package Homework;

public class Computer extends Game
{
	private int randoms = generator();
	
	public Computer(int user)
	{
		super(user);
	}
	
	public int generator()
	{
		int num = 1 + (int)(Math.random() * 3);
		return num;
	}
	
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
				System.out.println("Scissors cut paper. You lose!");
				else if(randoms == (1))
					System.out.println("Rock crushes scissors. You lose!");
		}
	}
}
