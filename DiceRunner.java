public class DiceRunner{
	public static void main (String[]args){
		Die dice = new Die();
		dice.roll();
		DiceHolder cup = new DiceHolder();
		System.out.println(dice.toString());
	}
}