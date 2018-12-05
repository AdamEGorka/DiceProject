import java.util.ArrayList;
public class DiceHolder{
	private ArrayList<Die> cup;

	public DiceHolder(){
		cup = new ArrayList<>();
	}
	public int addDie(Die die){
		if(cup.size() < 6)
			cup.add(die);
		else
			return -1;
	}
	public void shake(){

	}
}