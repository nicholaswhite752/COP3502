import java.util.Scanner;
public class Lab12 {

	static int[] circleCounter= new int[50];
	static int cirCount=0;
	static int[] recCounter=new int[50];
	static int recCount=0;
	static int[] triCounter=new int[50];
	static int triCount=0;
	static int counter=0;
	static Shape[] shapes;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("How many shapes do you want to create?");
		counter=s.nextInt();
		shapes= new Shape[50];


		for(int i=0;i<counter;i++){
			System.out.println("What shape do you want to make? (1:Circle 2:Rectangle 3:Triangle)");
			int input=s.nextInt();

			if(input==1){
				System.out.println("What color is this circle?");
				String color=s.next();
				System.out.println("What's the radius?");
				int radius=s.nextInt();
				Shape circle= new Circle(color,radius);

				shapes[i]=circle;
				circleCounter[cirCount]=i;
				cirCount++;
			}

			else if (input==2){
				System.out.println("What color is this rectangle?");

				String color=s.next();
				System.out.println("What's the height?");
				int height=s.nextInt();
				System.out.println("What's the width?");
				int width=s.nextInt();
				Shape rectangle= new Rectangle(color, height, width);

				shapes[i]=rectangle;
				recCounter[recCount]=i;
				recCount++;	
			}
			else if (input==3){
				System.out.println("What color is this triangle?");
				String color=s.next();
				System.out.println("What's the height?");
				int height=s.nextInt();
				System.out.println("What's the base?");
				int base=s.nextInt();
				Shape triangle= new Triangle(color, height, base);

				shapes[i]=triangle;
				triCounter[triCount]=i;
				triCount++;	

			}
		}

		while(true){
			System.out.println("1. Display info for Circles");
			System.out.println("2. Display info for Rectangles");
			System.out.println("3. Display info for Triangles");
			System.out.println("4. Add Another Shape");
			System.out.println("5. Exit");
			int input=s.nextInt();

			if(input==1){
				print(shapes, 1);
			}
			else if(input==2){
				print(shapes, 2);
			}
			else if(input==3){
				print(shapes, 3);
			}
			else if(input==4){
				shapes[counter]=addNewShape();
				counter++;
				
			}
			else if(input==5){
				System.out.println("Good Bye");
				System.exit(0);
			}

		}







	}

	public static Shape addNewShape(){
		Scanner a= new Scanner(System.in);
		
		System.out.println("What shape do you want to make? (1:Circle 2:Rectangle 3:Triangle)");
		int input=a.nextInt();

		if(input==1){
			System.out.println("What color is this circle?");
			String color=a.next();
			System.out.println("What's the radius?");
			int radius=a.nextInt();
			Circle circle2= new Circle(color,radius);
			
			circleCounter[cirCount]=counter;
			cirCount++;

			return circle2;
		}

		else if (input==2){
			System.out.println("What color is this rectangle?");

			String color=a.next();
			System.out.println("What's the height?");
			int height=a.nextInt();
			System.out.println("What's the width?");
			int width=a.nextInt();
			Rectangle rectangle2= new Rectangle(color, height, width);
			
			recCounter[recCount]=counter;
			recCount++;

			return rectangle2;	
		}
		else if (input==3){
			System.out.println("What color is this triangle?");
			String color=a.next();
			System.out.println("What's the height?");
			int height=a.nextInt();
			System.out.println("What's the base?");
			int base=a.nextInt();
			Triangle triangle3= new Triangle(color, height, base);
			
			triCounter[triCount]=counter;
			triCount++;

			return triangle3;	
		}
		
		
		else{
			return null;
		}
	}

	public static void print (Shape myShapes[], int option){

		if (option==1){
			for(int i=0, j=0; i<myShapes.length; i++){
				if(myShapes[i] instanceof Circle){
					Circle.counter=j;
					j++;
					System.out.println(myShapes[i]);
					
				}
			}
		}

		else if (option==2){
			for(int i=0,j=0; i<myShapes.length; i++){
				if(myShapes[i] instanceof Rectangle){
					Rectangle.counterRec=j;
					j++;
					System.out.println(myShapes[i]);
					
				}
			}
		}
		
		else if (option==3){
			for(int i=0, j=0; i<myShapes.length; i++){
				if(myShapes[i] instanceof Triangle){
					Triangle.counterTri=j;
					j++;
					System.out.println(myShapes[i]);
			
				}
			}
		}

	}


}


