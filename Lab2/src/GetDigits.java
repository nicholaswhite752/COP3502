import java.util.Scanner;
public class GetDigits {

	public static void main(String[] args) {
	Scanner number= new Scanner(System.in);
	System.out.println("Enter a number:");
	int hundreds=number.nextInt();
	int hundred=hundreds/100;
	System.out.println("The hundreds place is: " +hundred);
	int tens=(hundreds%100)/10;
	System.out.println("The tens place is:" +tens);
	int ones=hundreds%10;
	System.out.println("The ones pace is:" +ones);
	}

}
