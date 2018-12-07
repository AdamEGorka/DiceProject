public class DiceRunner{
	public static void main (String[]args){
		//Test
		Die dice = new Die();
		Die dice2 = new Die();
		boolean snakeEyes = false;
		int roll = 0;

		while(!snakeEyes){
		roll++;
		dice.roll();
		dice2.roll();
		System.out.println("Roll " + roll + ":");
		System.out.println(dice.toString() + dice2.toString());
		if((dice.getValue() == 1) && (dice2.getValue() == 1))
			snakeEyes = true;
		}

		//Test 2
		System.out.println("Test 2");
		DiceHolder cup = new DiceHolder();
		for(int i = 0; i< 6; i++){
			cup.addDie(new Die((int)(Math.random()*17)+4));
			System.out.print(cup+"\n");
		}
		System.out.println("DiceHolder is full.\nShake:");
		cup.shake();
		System.out.println(cup);
	}
}