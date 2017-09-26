import java.util.Scanner;
public class ConverterToDecimal {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("How many numbers do you want to convert?");
		int count= input.nextInt();
		int i=0;

		while (i<count){
			System.out.println("Convert from \n"+"1.Binary \n"+"2.Octal \n"+"3.Hexadecimal");
			int choice= input.nextInt();
			input.nextLine();

			if (choice==1){
				System.out.println("Choice: 1");
				System.out.println("Number to convert: ");
				String binary=input.nextLine();
				System.out.println("Conversion: "+Integer.parseInt(binary, 2)+"\n");
				i++;
			}
			else if (choice==2){
				System.out.println("Choice: 2");
				System.out.println("Number to convert: ");
				String octal=input.nextLine();
				System.out.println("Conversion: "+Integer.parseInt(octal, 8)+"\n");
				i++; 
			}
			else if (choice==3){
				System.out.println("Choice: 3");
				System.out.println("Number to convert: ");
				String hexadecimal=input.nextLine();
				System.out.println("Conversion: "+Integer.parseInt(hexadecimal, 16)+"\n");
				i++; 	
			}
			else {
				System.out.println("Invalid Choice! \n");
			}

		}

	}

}
