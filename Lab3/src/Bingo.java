import java.util.Scanner;
public class Bingo {

	public static void main(String[] args) {
		Scanner number= new Scanner(System.in);
		System.out.println("Input 1: ");
		int first= number.nextInt();
		System.out.println("Input 2:  ");
		int second= number.nextInt();
		
		if (first>second){
			System.out.println(first +" > "+second);
		}
		else if (second>first){
			System.out.println(first +" < "+second);
		}
		else if(first==second){
			System.out.println("Bingo");
		}
	}

}
