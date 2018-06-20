import java.util.Scanner;

public class output {
	public static void main(String []args){
		int side;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of sides of Dice");
		side = scan.nextInt();
		if(side == 2 || side == 4 || side == 6) {
			Dice dice = new Dice(side);
			for(int i=0; i<5; i++) {
		
		dice.rollDice();
		}
		}
		else
			System.out.println("Only for Two,Four and Six Sided Dice!!!!!");
		scan.close();
		}
}