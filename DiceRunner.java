public class DiceRunner{
	public static void main (String[]args){
		Die dice = new Die();
		dice.roll();
		System.out.println(dice);

		//Test 2
		DiceHolder cup = new DiceHolder();
		for(int i = 0; i< 6; i++){
			cup.addDie(new Die((int)(Math.random()*17)+4));
			System.out.print(cup+"\n");
		}
		cup.shake();
		System.out.println(cup);
	}
}