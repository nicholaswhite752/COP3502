import java.util.Scanner;

/**

 * This class translates messages from aliens on planets

 * Beaumonde and Regina into Earth English.

 * @author Kristy Boyer

 *

 */

public class AlienTranslator {

	/**

	 * This main method creates an AlienTranslator and then calls the

	 * translateInput method. Students should not modify this method.

	 * @param args

	 */

	public static void main(String[] args) {

		AlienTranslator a = new AlienTranslator();

		Scanner s = new Scanner(System.in);

		a.translateInput(s);
		
		

	}

	/**

	 * This method gets the necessary input from the user regarding planet

	 * and the message to be translated.

	 * Students should fill in the missing code in this method.

	 * @param in A Scanner created on the appropriate stream of input.

	 */

	public String translateInput(Scanner in) {

		//TODO: Get from user which planet the inter-galactic message is from.

		//1=Beaumonde and 2=Regina

		//Store value in an int variable named planet. If it is not valid, print

		//an error to the user and exit the program. Otherwise (a valid planet)

		//Get the inter-galactic message that needs to be translated.

		//Store it in a String variable named message

		//---- > Fill in Student Code Here < ------
		
		//Ask for planet and get input
		
		
		System.out.println("What planet?");
		int planet=in.nextInt();
		if (planet==1){
			System.out.println("What message?");
		}
		else if(planet==2){
			System.out.println("What message?");
		}
		else {
			System.out.println("Not a valid planet.");
			System.exit(0);
		}
		in.nextLine();
		String message= in.nextLine();
		
		// print original message
		
		if (planet==1){
			System.out.println("Original message in Beaumondian: "+message);
		}
		else if (planet==2){
			System.out.println("Original message in Reginian: "+message);
		}

		
		

		//---- > End Student Code < -----

		//Teaching staff code - STUDENTS DO NOT MODIFY - extracts characters

		//one at a time from the String message and stores each character in

		//the char variable named charToTranslate

		//The result variable is used to build and store the translated message

		// which will be sent back when this method is finished.

		String result = "";
		
		for (int i=0; i < message.length(); i++) {

			char charToTranslate = message.charAt(i);

			//End teaching staff code

			//TODO: translate the character stored in variable charToTranslate

			//and append the translated character to the result variable

		//incrementing character value
			
			if (planet==1){
				if (charToTranslate>64 && charToTranslate<67){
					charToTranslate+=24;
				}
				else if (charToTranslate>66 && charToTranslate<91){
					charToTranslate-=2;
				}
				else if (charToTranslate>96 && charToTranslate<99){
					charToTranslate+=24;
				}
				else if (charToTranslate>98 && charToTranslate<123){
					charToTranslate-=2; 
				}
			}		

			if (planet==2){
				if (charToTranslate>64 && charToTranslate<89){
					charToTranslate+=2;
				}
				else if (charToTranslate>88 && charToTranslate<91){
					charToTranslate-=24;
				}
				else if (charToTranslate>96 && charToTranslate<121){
					charToTranslate+=2;
				}
				else if (charToTranslate>120 && charToTranslate<123){
					charToTranslate-=24;
				}
			}
						
			

// relates result to charToTranslate
			result=result.concat(Character.toString(charToTranslate));
			


			
					
			//----- > End Student Code < -----

		} //ends the for loop

		//TODO: perform the necessary output as specified in the requirements

		// **** This TODO was added to this starter code on Mon 1/25 2:55pm ****

		//------> Fill in Student Code < -------
		
	//prints out result
	
		System.out.print("Translation in Earth English: "+result);
		
		
		


		//------> End Student Code < -------

		//Sends back the value of the result variable

		return result;

	} //ends the translateInput method

} //ends the AlienTranslator class