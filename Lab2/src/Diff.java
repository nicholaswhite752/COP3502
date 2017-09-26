import java.util.Scanner;
public class Diff {

	public static void main(String[] args) {
		Scanner reada= new Scanner(System.in);
		System.out.println("Enter first letter:");
		int firstletter=reada.next().charAt(0);
		System.out.println("Enter second letter:");
		int secondletter=reada.next().charAt(0);
		int difference=secondletter-firstletter;
		System.out.println("The difference is:" +difference);
		
	
		
	}
}
