import java.util.Random;


public class poop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<=10; i++){
			Random gen = new Random();
			int r = gen.nextInt(2);

			switch (r) {
			case 1:
				System.out.println("00000000");
				break;
			case 2:
				System.out.println("111111111");
				break;
			}
		}
	}
}