import java.util.Scanner;
public class Contact {
	String name;
	String nickname;
	String DOB;

	public Contact(){
		this.name="No Entry";
		this.nickname="";
		this.DOB="";
	
	}


	public Contact(String s){
		Scanner input=new Scanner(s);
		input.useDelimiter("-");
		
		this.name=input.next();
		this.nickname=input.next();
		this.DOB=input.next();
	}
	
	public void printContact(){
		System.out.println(name);
		System.out.println(nickname);
		System.out.println(DOB);
	}

}
