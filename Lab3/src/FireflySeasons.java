import java.util.Scanner;
public class FireflySeasons {

	public static void main(String[] args) {
		Scanner number= new Scanner(System.in);
		System.out.println("Year: ");
		int year= number.nextInt();
		System.out.println("Month:  ");
		int month= number.nextInt();
		
		if (month==4 || month==5 || month==6){
			System.out.println("Beaumonde: spring");
		}
		else if (month==7 || month==8 || month==9){
				System.out.println("Beaumonde: summer");		
		}
		else if (month==10 || month==11 || month==12){
			System.out.println("Beaumonde: autumnn");		
		}
		else if (month==1 || month==2 || month==3){
			System.out.println("Beaumonde: winter");		
		}
		
		if (year%5==0 && (month==4 || month==5 || month==6)){
			System.out.println("Regina: spring");
		}
		else if (year%5==0 && (month==7 || month==8 || month==9)){
				System.out.println("Regina: summer");		
		}
		else if ( year%5==0 && (month==10 || month==11 || month==12)){
			System.out.println("Regina: autumnn");		
		}
		else if (year%5==0 && (month==1 || month==2 || month==3)){
			System.out.println("Regina: winter");		
		}
		
		if (year%5==1 && (month==4 || month==5 || month==6)){
			System.out.println("Regina: off-season");
		}
		else if (year%5==1 && (month==7 || month==8 || month==9)){
				System.out.println("Regina: spring");		
		}
		else if ( year%5==1 && (month==10 || month==11 || month==12)){
			System.out.println("Regina: summer");		
		}
		else if (year%5==1 && (month==1 || month==2 || month==3)){
			System.out.println("Regina: autumn");
		}
		
		if (year%5==2 && (month==4 || month==5 || month==6)){
			System.out.println("Regina: winter");
		}
		else if (year%5==2 && (month==7 || month==8 || month==9)){
				System.out.println("Regina: off-season");		
		}
		else if ( year%5==2 && (month==10 || month==11 || month==12)){
			System.out.println("Regina: spring");		
		}
		else if (year%5==2 && (month==1 || month==2 || month==3)){
			System.out.println("Regina: summer");
		}	
		
		if (year%5==3 && (month==4 || month==5 || month==6)){
			System.out.println("Regina: autumn");
		}
		else if (year%5==3 && (month==7 || month==8 || month==9)){
				System.out.println("Regina: winter");		
		}
		else if ( year%5==3 && (month==10 || month==11 || month==12)){
			System.out.println("Regina: off-season");		
		}
		else if (year%5==3 && (month==1 || month==2 || month==3)){
			System.out.println("Regina: spring");
		}	
		
		if (year%5==4 && (month==4 || month==5 || month==6)){
			System.out.println("Regina: summer");
		}
		else if (year%5==4 && (month==7 || month==8 || month==9)){
				System.out.println("Regina: autumn");		
		}
		else if ( year%5==4 && (month==10 || month==11 || month==12)){
			System.out.println("Regina: winter");		
		}
		else if (year%5==4 && (month==1 || month==2 || month==3)){
			System.out.println("Regina: off-season");
		}	
		
	}

}
