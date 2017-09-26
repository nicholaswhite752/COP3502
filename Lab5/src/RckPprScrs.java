import java.util.Scanner;
public class RckPprScrs {

	public static void main(String[] args) {
	
	Scanner input= new Scanner(System.in);

	boolean play=true;
			
	while(play){
	System.out.println("Enter your choice: ");
	System.out.println("1. Rock ");
	System.out.println("2. Paper ");
	System.out.println("3. Scissors ");
	System.out.println("4. Exit ");
	int playerChoice= input.nextInt();
	int computerValue=(int)(1+(Math.random()*3));
	
	while(true)
	if (playerChoice==1){
		System.out.println("You choose: 1");
		switch (computerValue){
		case 1: 
			System.out.println("Computer choose: Rock.");
			System.out.println("Rock=Rock, It's a tie!");
			break;
		case 2: 
			System.out.println("Computer choose: Paper");
			System.out.println("Rock<Paper, You lose!");
			break;
		case 3: 
			System.out.println("Computer choose: Scissors");
			System.out.println("Rock>Scissors, You win!");
			break;
		}
		break;
		}
	else if (playerChoice==2){
		System.out.println("You Choose: Paper.");
		switch (computerValue){
		case 1: 
			System.out.println("Computer choose: Rock");
			System.out.println("Paper>Rock, You win!");
			break;
		case 2: 
			System.out.println("Computer choose: Paper");
			System.out.println("Paper=Paper, It's a tie!");
			break;
		case 3: 
			System.out.println("Computer choose: Scissors");
			System.out.println("Paper<Scissors, You lose!");
			break;
		}
		break;
	}
		else if(playerChoice==3){
			System.out.println("You Choose: Scissors.");
			switch (computerValue){
			case 1: 
				System.out.println("Computer choose: Rock");
				System.out.println("Scissors<Rock, You lose!");
				break;
			case 2: 
				System.out.println("Computer choose: Paper");
				System.out.println("Scissors>Paper, You win!");
				break;
			case 3: 
				System.out.println("Computer choose: Scissors");
				System.out.println("Scissors=Scissors, It's a tie!");
				break;
			}
			break;
		}
	
	
			else if (playerChoice==4){
				System.out.println("You Choose: 4");
				System.exit(0);
				play=false;
			}
	System.out.println("\n");	
	
	}
	}

}	
