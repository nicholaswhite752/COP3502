import java.util.Scanner;
public class TriangleArea {

	private static Scanner readHeight;

	public static void main(String[] args) {
		readHeight = new Scanner(System.in);
		System.out.println("Height of Triangle:");
		double numHeight=readHeight.nextInt();
		System.out.println("Base of Triganle:");
		double numBase=readHeight.nextInt();
		double numArea=(numHeight*numBase)/2;
		System.out.println("The area of the triangle is: "+numArea);

	}

}
