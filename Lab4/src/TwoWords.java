import java.util.Scanner;
public class TwoWords {

	public static void main(String[] args) {
		System.out.println("Input two words: ");
		Scanner message= new Scanner(System.in);
		String word1=message.next();
		String word2=message.next();
		
		if (word1.equals(word2)){
			System.out.print(word1);
		}
		else if ((word1.charAt(0)==word2.charAt(0)) && (!word1.equals(word2))){
			System.out.println(word1 +"\n"+word2 );
		}
		else{
			System.out.println(word1+" "+word2);
		}
		

	}

}
