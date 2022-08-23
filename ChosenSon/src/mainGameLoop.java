import java.util.Scanner;


public class mainGameLoop {
	/**
	 * @param args
	 */
	static public String username;
	static public int level = 1;
	static public int hp = 100;
	static public int potAmount = 0;
	static public int lockpicks = 5; //Amount of lockpicks held
	static public boolean gameComplete = false; //determines if you win the game
	
	public static void main(String[] args) 
	{
		//enemies.main(args);
		String input;
		Scanner in = new Scanner(System.in);
		int select = 0;
		while(!gameComplete)
		{
			System.out.println("Welcome to my Zombie Survival Game. The object of this game is " +
					"to survive for as long as you can, \nusing what you can manage to find. This " +
					"game is still being worked on, and this is just a test for now. \nAnyways, " +
					"I hope you enjoy.\n");
			System.out.println("Welcome to Z-Town, I hope you enjoy your stay here. There are many " +
					"creatures that cannot wait to \nfeast on your flesh. How long can you survive?\n");
			System.out.println("Currently you are home. You are wearing normal clothes, T-shirt and Jeans," +
					" and are carrying a pocket \nknife, and 5 lockpicks.\n");
			
			while(select == 0) // Loops back if you make incorrect selection
			{
				System.out.println("It is time to leave your home, where do you want to go? Type ‘s’ for the Streets, or ‘w’ for the Woods.");
				input = in.next();
				if (input.equals("s"))
				{
					places.streets(args);
					select = 1;
				}
				else if (input.equals("w"))
				{
					places.woods(args);
					select = 1;
				}
				else
				{
					System.out.println("Please press either 's' or 'w'");
				}
			}
			gameComplete = true;
		}
		System.out.println("You have won!!!");
	}

}
