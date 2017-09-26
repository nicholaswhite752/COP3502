import java.util.Scanner;
public class TestContact {
	public static void main (String [] args){
		
		
		Scanner contacts=new Scanner(System.in);
		
		System.out.println("Contact 1");
		System.out.println("Enter Infomation (Name-Nickname-DOB)");
		String input1=contacts.nextLine();
		Contact contact1;
		if (input1.equals("")){
			contact1= new Contact();
		}
		else{
			contact1= new Contact(input1);
		}
		
		System.out.println("Contact 2");
		System.out.println("Enter Infomation (Name-Nickname-DOB)");
		String input2=contacts.nextLine();
		Contact contact2;
		if (input2.equals("")){
			contact2= new Contact();
		}
		else{
			contact2= new Contact(input2);
		}
		
		
		System.out.println("Contact 3");
		System.out.println("Enter Infomation (Name-Nickname-DOB)");
		String input3=contacts.nextLine();
		Contact contact3;
		if (input3.equals("")){
			contact3= new Contact();
		}
		else{
			contact3= new Contact(input3);
		}
		System.out.print("\n");
		
		System.out.println("Contact 1");
		contact1.printContact();
		System.out.print("\n");
		
		System.out.println("Contact 2");
		contact2.printContact();
		System.out.print("\n");
		
		System.out.println("Contact 3");
		contact3.printContact();
		System.out.print("\n");
		
		
	}
}
