import java.util.Scanner;


public class places {
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}
	public static void  home(String[] args)
	{
		String input;
		Scanner in = new Scanner(System.in);
		System.out.println("You are back home what would you like to do?\nPress '/h' to see a list of options.");
		input = in.next();
		if(input.equals("/h"))
		{
			System.out.println("These are your options.");
		}
	}

	
	public static void  streets(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("you are now in the streets.");
		int leave = 0;
		String input;
		while(leave == 0)
		{
			input = in.next();
			if (input.equals("/i"))
			{
				actions.viewInventory(args);
			}
		}
	}

	
	public static void  woods(String[] args)
	{
		System.out.println("you are now in the woods.");
	}
}