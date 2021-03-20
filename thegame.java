//Student Name: Khushdeep Bawa
//Student Id:201907236
// Date Submitted:20 March,2021
// Class IN2203  Section Number- group 2
// Name of work: Assignment 1: The Gambling Game

import java.util.*;
abstract class Game
{
	public abstract void setRandomNumber();
	public abstract int getRandomNumber();
	public abstract void setUserNumber();
	public abstract int getUserNumber();
	public abstract boolean match();
	public abstract void setUserDecision();
	public abstract String getUserDecision();
	
	
}
class Player extends Game
{
	Random r=new Random();
	int usernumber,systemnumber;
	String userdecision;
	Scanner s=new Scanner(System.in);
	public Player()
	{
		usernumber=0;
		systemnumber=0;
		userdecision="";
	}
	public void setRandomNumber()
	{
		systemnumber=r.nextInt(50);
	}
	public int getRandomNumber()
	{
		return(systemnumber);
	}
	public void setUserNumber()
	{
		
		System.out.print("Enter your number(1-50): ");
		usernumber=s.nextInt();
		while(usernumber<1||usernumber>50)
		{
			System.out.print("\nWrong entry fill 1 to 50: ");
			usernumber=s.nextInt();
		}
	}
	public int getUserNumber()
	{
		return(usernumber);
	}
	public boolean match()
	{
		if(usernumber==systemnumber-10 || usernumber==systemnumber+10)
		{
			return(true);
		}
		else
		{
			return(false);
		}			
		
	}
	public  void setUserDecision()
	{
		System.out.print("Enter Yes to play the game: ");
		userdecision=s.nextLine();
		
	}
	public String getUserDecision()
	{
		return(userdecision);
	}
}
class TestGame
{
	public static void main(String args[])
	{
			Scanner s=new Scanner(System.in);
			String option="";
			Player p=new Player();
			while(true)
			{
			p.setUserDecision();
			option=p.getUserDecision();
				if(option.toLowerCase().equals("yes"))
				{
					p.setRandomNumber();
					p.setUserNumber();
					if(p.match())
					{
						System.out.println("\nUser Win!!!!");
					}
					else
					{
						System.out.println("\nUser Lose!!!!");
					}
					
				}
			System.out.print("Enter 1 to play more game: ");
			int opt=s.nextInt();
				if(opt!=1)
				{
					System.out.println("\nYou are exiting from casino");
					break;
				}
			s.nextLine();
			}
			System.out.println("Thanks for playing Game!!");
	}
}
