import java.util.Scanner;
public class NameAnalysis2 {

	public static void main(String[] args) {
		System.out.println("Input a name (last, first): ");
		Scanner input= new Scanner(System.in);
		String namelast= input.next();
		String namefirst= input.next();
		
		int vowel=0;
		int i;
		for (i=0;i<namefirst.length(); i++){

			if (namefirst.charAt(i)=='a'||namefirst.charAt(i)=='e'||namefirst.charAt(i)=='i'||namefirst.charAt(i)=='o'||
					namefirst.charAt(i)=='u'||namefirst.charAt(i)=='A'||namefirst.charAt(i)=='E'||namefirst.charAt(i)=='I'||
					namefirst.charAt(i)=='U'||namefirst.charAt(i)=='O'){
				vowel=i;
				break;
			}

		}

	

		System.out.println("The vowel is at postion "+vowel+" and is the letter "+ namefirst.charAt(vowel));


	}

}