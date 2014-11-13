package Homework;

public class Game 
{
	int user;
	int num;
	
	// constructor
	public Game(int num)
	{
		setChoice(num);
	}
	
	public int getPlay()
	{
		return getChoice();
	}
	
	public void PolymorphismEnd() // superclass object to be called by subclass
	{
		System.out.println("...");
	}
	
	public void Value(int num) // superclass object to be called by subclass
	{
		if(num == 1)
			num = 1;
		else if(num == 2)
			num = 2;
		else if(num == 3)
			num = 3;
	}
	
	public int getChoice()
	{
		return user;
	}
	
	public void setChoice(int user)
	{
		this.user = user;
	}
} // end class Game
