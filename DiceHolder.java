import java.util.ArrayList;
public class DiceHolder{

	private ArrayList<Die> cup;
	Die die;

	public DiceHolder(){
		cup = new ArrayList<>();
		die = new Die();
	}
	public int addDie(Die die){
		if(cup.size() < 6){
			cup.add(die);
			return 1;
		}
		else
			return -1;
	}
	public void shake(){
		for(int i = 0; i< cup.size(); i++){
			die = cup.get(i);
			die.roll();
			cup.set(i, die);
		}
	}

	public String toString(){
		String string = "";
		for(int i = 0; i < cup.size(); i++)
			string+=cup.get(i).toString();
		return string;
	}
}