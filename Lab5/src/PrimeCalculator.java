import java.util.Scanner;
public class PrimeCalculator {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		
		boolean notZero=true;

		while(notZero){
			System.out.print("Input: ");
			int number=num.nextInt();
			int lowerNumber=2;
			boolean prime=true;
			
			if (number==0){
				System.out.println("Goodbye");
				System.exit(0);
				notZero=false;
			}
			
			while (lowerNumber<number){
				if (number%lowerNumber==0){
					prime=false;
					break;
				}
				lowerNumber++;
			
			}
			
			System.out.println(prime);
		}
		System.exit(0);

	}	
	}
