import java.util.Scanner;
public class NameAnalysis {

	public static void main(String[] args) {
		System.out.println("Input a name (last, first): ");
		Scanner input= new Scanner(System.in);
		String namelast= input.next();
		String namefirst= input.next();
		 
		String nameupperlast=namelast.toUpperCase();
		String nameupperfirst=namefirst.toUpperCase();
		System.out.println(nameupperlast+nameupperfirst);
		 
		int lengthlast=(namelast.length()-1);
		int lengthfirst=(namefirst.length());
		System.out.println(lengthlast+lengthfirst);
		
		String firstlower=namefirst.toLowerCase();
		System.out.println(firstlower);
		
	int vowel=999;
	if (namefirst.indexOf('a')!=-1 && namefirst.indexOf('a')<vowel){
		vowel=namefirst.indexOf('a');
		}
	if (namefirst.indexOf('e')!=-1 && namefirst.indexOf('e')<vowel){
		vowel=namefirst.indexOf('e');
		}
	if (namefirst.indexOf('i')!=-1 && namefirst.indexOf('i')<vowel){
		vowel=namefirst.indexOf('i');
		}
	if (namefirst.indexOf('o')!=-1 && namefirst.indexOf('o')<vowel){
		vowel=namefirst.indexOf('o');
		}
	if (namefirst.indexOf('u')!=-1 && namefirst.indexOf('u')<vowel){
		vowel=namefirst.indexOf('u');
		}
	if (namefirst.indexOf('A')!=-1 && namefirst.indexOf('A')<vowel){
		vowel=namefirst.indexOf('A');
		}
	if (namefirst.indexOf('E')!=-1 && namefirst.indexOf('E')<vowel){
		vowel=namefirst.indexOf('E');
		}
	if (namefirst.indexOf('I')!=-1 && namefirst.indexOf('I')<vowel){
		vowel=namefirst.indexOf('I');
		}
	if (namefirst.indexOf('O')!=-1 && namefirst.indexOf('O')<vowel){
		vowel=namefirst.indexOf('O');
		}
	if (namefirst.indexOf('U')!=-1 && namefirst.indexOf('U')<vowel){
		vowel=namefirst.indexOf('U');
		}

	System.out.println(vowel);
	
	
	int letter= (int)(Math.random()*namefirst.length());
	System.out.println("The random character is "+namefirst.charAt(letter)
	+" at postion " +(letter+1)+" of the first name");

	
	
	}
		
}

