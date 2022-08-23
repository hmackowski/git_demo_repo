import java.lang.reflect.Array;
import java.util.Random;


public class enemies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pickEnemy[] = new int[1];
		Random gen = new Random();
		int r = gen.nextInt(1);

		switch (r) {
		case 0:
			noviceThug(args);
			break;
		case 1:
			noviceGangster(args);
			break;

		}

	}

	public static void noviceThug(String[] args) {
		int noviceThugHP = 25;
		System.out.println("A Thug has appeared, prepare yourself.");
		while (noviceThugHP > 0)
		{
			Random gen = new Random();
			int noviceThugAttack = gen.nextInt(10) + 5;
			noviceThugHP = 0;

		}



	}
	
	public static void noviceGangster(String[] args) {
		int noviceGangsterHP = 25;
		System.out.println("A Gangster has appeared, prepare yourself.");
		while (noviceGangsterHP > 0)
		{
			Random gen = new Random();
			int noviceGangsterAttack = gen.nextInt(10) + 5;
			noviceGangsterHP = 0;
		}



	}
}
