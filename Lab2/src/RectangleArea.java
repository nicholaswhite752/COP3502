import java.util.Scanner;
public class RectangleArea {

	private static Scanner readLength;

	public static void main(String[] args) {
		readLength = new Scanner(System.in);
		System.out.println("Length of rectangle:");
		int numLength=readLength.nextInt();
		System.out.println("Width of rectangle:");
		int numWidth=readLength.nextInt();
		int numArea=numLength*numWidth;
		System.out.println("The area of the rectangle is: "+numArea);

	}

}
