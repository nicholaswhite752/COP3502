import java.util.Scanner;

public class Card {

	int Rank;
	String Suit;

	public Card(String s){
		Scanner read= new Scanner(s);
		read.useDelimiter(", ");
		Rank=read.nextInt();
		Suit=read.next();

	}

	public void printCard(){
		System.out.println(Rank+", "+Suit);
	}


}
