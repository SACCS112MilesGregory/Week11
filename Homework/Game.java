package Homework;

public class Game 
{
	int user;
	int num;
	
	public Game(int num)
	{
		setChoice(num);
	}
	
	public int getPlay()
	{
		return getChoice();
	}
	
	public void PolymorphismEnd()
	{
		System.out.println("...");
	}
	
	public void Value(int num)
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
}
