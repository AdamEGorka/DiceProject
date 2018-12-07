public class DiceRunner{
	public static void main (String[]args){
		Die dice = new Die();
		Die dice2 = new Die();
		boolean snakeEyes = false;

		while(!snakeEyes){
		dice.roll();
		dice2.roll();
		System.out.println(dice.toString() + "\t" + dice2.toString());
		if((dice.getValue() == 1) && (dice2.getValue() == 1))
			snakeEyes = true;
		}

	}
}