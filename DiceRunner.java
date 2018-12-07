public class DiceRunner{
	public static void main (String[]args){
		Die dice = new Die();
		dice.roll();
		System.out.println(dice.toString());
	}
}