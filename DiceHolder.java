import java.util.ArrayList;
public class DiceHolder{
	private ArrayList<Die> cup = new ArrayList<>();

	public int addDie(Die die){
		if(cup.size() < 6)
			cup.add(die);
		else
			return -1;
	}
}