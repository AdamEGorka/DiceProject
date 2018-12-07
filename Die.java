public class Die{
	//instance variables
	private int sides;
	private int value;

	public Die(){
		sides = 6;
		value = 1;
	}

	public Die(int sides){
		this.sides = sides;
	}

	public int getValue(){
		return value;
	}


	public void roll(){
		value = (int)(Math.random() * sides);
	}

	public String toString(){
		return "Number of sides: " + sides + ", Value: " + getValue();
	}
}