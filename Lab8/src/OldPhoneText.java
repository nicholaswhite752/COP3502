import java.util.Scanner;
public class OldPhoneText {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number of letters: ");
		int number=s.nextInt();
		char[] phoneText= new char[number];
		
		System.out.println("Enter letters separatd by spaces: ");
		
		for (int i=0;i<number;i++){
			phoneText[i]=s.next().charAt(0);
			}
		
		
		toNumerals(phoneText);
		
		}

	public static void toNumerals(char[] word){
		String result="";
		
		for (int i=0;i<word.length;i++){
			char translate=word[i];
			
			switch (translate){
			case ('a'): case ('b'): case ('c'):case ('A'): case ('B'): case ('C'):
				result+=2;
				break;
			case ('d'): case ('e'): case ('f'):case ('D'): case ('E'): case ('F'):
				result+=3;
				break;
			case ('g'): case ('h'): case ('i'):case ('G'): case ('H'): case ('I'):
				result+=4;
				break;	
			case ('j'): case ('k'): case ('l'):case ('J'): case ('K'): case ('L'):
				result+=5;
				break;
			case ('m'): case ('n'): case ('o'):case ('M'): case ('N'): case ('O'):
				result+=6;
				break;	
			case ('p'): case ('q'): case ('r'):case ('s'): case ('P'): case ('Q'): case ('R'): case ('S'):
				result+=7;
				break;
			case ('t'): case ('u'): case ('v'):case ('T'): case ('U'): case ('V'):
				result+=8;
				break;
			case ('w'): case ('x'): case ('y'):case ('z'): case ('W'): case ('X'): case ('Y'): case ('Z'):
				result+=9;
				break;
			}
			
		}
		System.out.println(result);
	}
	
	
}
