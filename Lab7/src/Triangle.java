import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("---Triangle Area Calculator---");
		System.out.println("1: Enter Sides");
		System.out.println("2: Enter base and height");
		int choice=s.nextInt();

		if (choice==1){
			System.out.println("Please enter the lengths of the three sides: ");
			double a=s.nextDouble();
			double b=s.nextDouble();
			double c=s.nextDouble();

			if (getArea(a,b,c)==-1){
				displayError();
			}
			else {
				System.out.println("The area of the triangle is: "+getArea(a,b,c));
			}

		}

		else if (choice==2){
			System.out.println("Please enter the base and height: ");
			double b=s.nextDouble();
			double h=s.nextDouble();
			getArea(b,h);
		}
		else{
			System.out.println("Invalid choice!");
		}


	}

	public static double getArea(double a, double b, double c){
		double s= (a+b+c)/2;
		double area=0;

		if (validTriangle(a,b,c)==true){
			area=Math.sqrt(((s)*(s-a)*(s-b)*(s-c)));


		}
		else if (validTriangle(a,b,c)==false) {		
			area=-1;
		}

		return area;
	}

	public static boolean validTriangle(double a, double b, double c){
		boolean x=true;
		if (a>c && a>b && a>=(b+c)){
			x=false;
		}
		else if (b>a && b>c && b>=(a+c)){
			x=false;
		}
		else if (c>a && c>b && c>=(a+b)){
			x=false;
		}
		return x;
	}

	public static double getArea(double b, double h){
		double area= (b*h)/2;
		System.out.println("The area of the triangle is "+area);
		return area;	
	}

	public static void displayError(){
		System.out.println("Error! Cannot form triangle.");
	}

}
