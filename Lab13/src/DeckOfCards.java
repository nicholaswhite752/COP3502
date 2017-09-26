import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DeckOfCards {

	static String deck;


	public static void main (String [] args) throws FileNotFoundException, IOException{


		try(BufferedReader br = new BufferedReader(new FileReader("Cards.txt"))) {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			deck = sb.toString();
		}

		Scanner read= new Scanner(deck);
		Card[] cardDeck= new Card[52];
		for(int i=0;i<52;i++){
			cardDeck[i]=new Card(read.nextLine());

		}

		viewDeck(cardDeck);
		System.out.println();
		System.out.println("Shuffled: ");
		long start = System.currentTimeMillis(); 
		// Start timer 
		shuffleDeck(cardDeck);
		long end = System.currentTimeMillis(); 
		// Stop timer 
		//print out the array to show it is shuffled 
		System.out.println("Shuffle Runtime: " + (end-start)); 
		//print time
		viewDeck(cardDeck);

	}


	public static void viewDeck(Card[] card){

		for(int i=0;i<52;i++){
			card[i].printCard();
		}
	}

	public static void shuffleDeck(Card[] card){

		Random random = ThreadLocalRandom.current();
		for (int i = 51; i > 0; i--)
		{
			int index = random.nextInt(i + 1);
			Card temp = card[index];
			card[index] = card[i];
			card[i] = temp;
		}
		
		
	}
}
