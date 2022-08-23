
public class actions {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}
	
	public static void viewInventory(String[] args)
	{
		System.out.println("## " + mainGameLoop.username + " - " +  "  -  Level " + mainGameLoop.level + "\n########  Inventory  ########" + "\n## Health: " + mainGameLoop.hp  + "  ##\n## Potions: " + mainGameLoop.potAmount + ".");
		System.out.println("## LockPicks: " + mainGameLoop.lockpicks);
	
	}

}
