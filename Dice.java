import java.util.Random;

public class Dice {
	int sides;
	int outcome;

	public Dice(int sides) {
	this.sides = sides;
	}
	public void rollDice() {
	Random rand = new Random();
	String[] d2 = {"HEAD", "TAIL"};
	String[] d4 = {"ONE", "TWO", "THREE", "FOUR" };
	String[] d6 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX" };
    outcome = rand.nextInt(sides);
 
	switch(sides) {
	  case 2:
		  System.out.println(d2[outcome]);
	      break;

	   case 4:
			  System.out.println(d4[outcome]);
	      break;

	    case 6:
			  System.out.println(d6[outcome]);
	      break;

	}
	}
}	