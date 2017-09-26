import java.util.Scanner;

public class WatneyRescue {

	public static void main(String[] args) {

		//Creates a new instance object. Don't worry about this for now.

		WatneyRescue wr = new WatneyRescue();

		//A new scanner to read input from the user

		Scanner s = new Scanner(System.in);

		//The user's menu selection; 'd', 'r', 'q' or something else

		char inputChoice;

		do {

			System.out.println("Do you want 'd' distance mode, 'r' rover mode, or 'q' quit?");

			inputChoice = s.nextLine().charAt(0);

			switch(inputChoice) {

			//Enter distance mode; make the table then compute walking time based on the table

			case 'd':

				System.out.println("How many meters to Watney?");

				String line = s.nextLine();

				double metersToWatney = Double.parseDouble(line.trim());

				String table = wr.generateContingency(metersToWatney);

				System.out.println(table);

				System.out.println("Which row?");

				line = s.nextLine();

				int row = Integer.parseInt(line.trim());

				System.out.println(wr.computeWalkingTime(metersToWatney,table,row));

				break;

				//Enter rover mode; receive and translate a series of angles for the rover

			case 'r':

				System.out.println("What series of angles?");

				String angles = s.nextLine();

				System.out.println("Mission control on earth sends the following message:\n");

				System.out.println(wr.interpretHexadecimal(angles) + "\n");

				break;

				//Quit

			case'q':

				continue;

				//Ignore anything that isn't 'd', 'r', or 'q'

			default:

				continue;

			}

		} while (inputChoice != 'q'); //keep going until we get 'q'

		System.out.println("Goodbye. May the hexadecimals be with you.");

		//Close the scanner to keep eclipse from driving me crazy with its warnings

		s.close();

	}

	/**

	 * Generates a contingency table of distances that Watney

	 * will have to travel to the ship

	 * @param distLewisWatney The distance in meters from Lewis to Watney,

	 * as read from Lewis' suit sensors

	 * @return

	 */

	public String generateContingency(double distLewisWatney) {

		String result = "";

		result += "Contingencies given distance " + distLewisWatney + " from Lewis to Watney:\n";

		//TODO: Compute the table values for Lewis angle from north ranging every five degrees

		//from 15 to 75 inclusive, and for her distance to the hab for every three meters from 15

		//to 30 inclusive. Solve each row for Watney's distance to the hab. Round everything

		//to the nearest meter.
		
		
		
		//Sets up a count to number the rows
		int j=1;
		
		//the loop to print out the table of values
		for (int i=15; i<=75; i+=5,j+=6){
			//used the law of cosines to and appended each row to the result string
			result+=(j+")"+" "+i+" | "+15+" | "+ Math.round(Math.sqrt((distLewisWatney*distLewisWatney)+(15*15)
					-(2*distLewisWatney*15*Math.cos((Math.PI/2)-(i*(Math.PI/180))))))+"\n");
			result+=((j+1)+")"+" "+i+" | "+18+" | "+ Math.round(Math.sqrt((distLewisWatney*distLewisWatney)+(18*18)
					-(2*distLewisWatney*18*Math.cos((Math.PI/2)-(i*(Math.PI/180))))))+"\n");
			result+=((j+2)+")"+" "+i+" | "+21+" | "+ Math.round(Math.sqrt((distLewisWatney*distLewisWatney)+(21*21)
					-(2*distLewisWatney*21*Math.cos((Math.PI/2)-(i*(Math.PI/180))))))+"\n");
			result+=((j+3)+")"+" "+i+" | "+24+" | "+ Math.round(Math.sqrt((distLewisWatney*distLewisWatney)+(24*24)
					-(2*distLewisWatney*24*Math.cos((Math.PI/2)-(i*(Math.PI/180))))))+"\n");
			result+=((j+4)+")"+" "+i+" | "+27+" | "+ Math.round(Math.sqrt((distLewisWatney*distLewisWatney)+(27*27)
					-(2*distLewisWatney*27*Math.cos((Math.PI/2)-(i*(Math.PI/180))))))+"\n");
			result+=((j+5)+")"+" "+i+" | "+30+" | "+ Math.round(Math.sqrt((distLewisWatney*distLewisWatney)+(30*30)
					-(2*distLewisWatney*30*Math.cos((Math.PI/2)-(i*(Math.PI/180))))))+"\n");
		}

		return result;

	}

	/**

	 * This method computes how long it will take Watney and Lewis to walk to the hab

	 * given their distances from it. The necessary distances must be looked up within

	 * the table provided as a parameter.

	 * @param distLewisWatney The distance Lewis is from Watney, as measured by her suit

	 * @param table The table of angle and distance values generated from another method

	 * @param row The row of the table that should be used in the calculation

	 * @return

	 */

	public String computeWalkingTime (double distLewisWatney, String table, int row) {

		//TODO: Traverse the table to get the correct row's string. (Hint: look at the

		//starter code for the interpretHexadecimal method to see a cool trick for stepping

		//through a String and breaking it apart using a certain character.)

		
		// creates a scanner to read the table
		Scanner s= new Scanner(table);
		
		

		//TODO: Extract from that row the needed distance.

		
		//creates the variables needed to compute the time of walking
		int count=0;
		String temporaryLine="";
		String lewisString="";
		String watneyString="";

		//this "for" loop grabs the row needed by replacing temporaryLine with the only the row used in the user input
		for (count=0; count<=row; count++){
			temporaryLine=s.nextLine();
		}
		
		//appends the distance for Lewis and Watney to a string 
		lewisString=temporaryLine.substring(8, 11);
		watneyString=temporaryLine.substring(13);
		
		

		//TODO: Compute the walking time for Watney and Lewis to the ship.

		//Watney is injured so his walking pace is 0.9 meters per second.

		//Lewis' walking pace is 1.7 meters per second.

		
		
		//creates variables for Lewis and Watney's distance as a double instead of a string for use in math functions
		double lewisDistance= Double.parseDouble(lewisString);
		double watneyDistance=Double.parseDouble(watneyString);

		//computation for walking time of Lewis and Watney bases on numbers from the table
		int lewisTime= (int)Math.rint(lewisDistance/1.7);
		int watneyTime=(int)Math.rint(watneyDistance/.9);

		//initializes the result string so it can be returned at the end of the method
		String result="";
		result=("Watney walking time: "+watneyTime+ "\n"+"Lewis walking time: "+lewisTime);

		return result;

	}

	/**

	 * This method interprets a series of angles around a circle to find the hexadecimal

	 * digit they "point to" on the circle. Then, it maps those hexadecimal pairs to characters from the

	 * English alphabet. The 360 degrees of the circle are broken into 16 equal pieces of 22.5 degrees each.

	 * @param angles The comma-delimited list of angles

	 * @return a String with the message in English

	 */

	public String interpretHexadecimal(String angles) {

		//An easy way to break apart a list of things is to make a Scanner on it

		//This Scanner is unrelated to any other variables with the same name because this

		//one is only meaningful inside this method. Also, this scanner does not read from the

		//console! It only operates over the one String you created it on, namely angles.

		Scanner s = new Scanner(angles);

		//You can tell each Scanner what you want it to use to break up the String.

		//Making it a comma, when you call next() you get whatever is between the commas.

		//Pretty convenient.

		s.useDelimiter(",");

		//TODO: Complete this method :)
		
		
		//creates a count variable by computing the number of commas in the input of angles
		int count=angles.length()-angles.replace(",","").length();
		//initializes the string that will hold the hexadecimal string
		String convert="";
		
		
		//creates a for loop with iterations of count plus one to account for the last angle after the comma
		for (double i=0;i<count+1; i++){
			//reads the next double
			double degree=s.nextDouble();
			//computes any degree over 360 to a degree of equal value under 360
			while (degree>=360){	
				degree-=360;
			}
			//the if statement takes the values of the angles and converts them to hexadecimal
			//and then appends them to the string that will be converted
			if((degree>337.5&&degree<360)||degree==0){
				convert+=0;
			}
			else if(degree>0&&degree<=22.5){
				convert+=1;
			}
			else if(degree>22.5&&degree<=45){
				convert+=2;
			}
			else if(degree>45&&degree<=67.5){
				convert+=3;
			}
			else if(degree>67.5&&degree<=90){
				convert+=4;
			}
			else if(degree>90&&degree<=112.5){
				convert+=5;
			}
			else if(degree>112.5&&degree<=135){
				convert+=6;
			}
			else if(degree>135&&degree<=157.5){
				convert+=7;
			}
			else if(degree>157.5&&degree<=180){
				convert+=8;
			}
			else if(degree>180&&degree<=202.5){
				convert+=9;
			}
			else if(degree>202.5&&degree<=225){
				convert+="A";
			}
			else if(degree>225&&degree<=247.5){
				convert+="B";
			}
			else if(degree>247.5&&degree<=270){
				convert+="C";
			}
			else if(degree>270&&degree<=290.5){
				convert+="D";
			}
			else if(degree>290.5&&degree<=315){
				convert+="E";
			}
			else if(degree>315&&degree<=337.5){
				convert+="F";
			}
		}


		//initializes the string that will be returned at end of method
		String result="";
		
		//if statement used for an even number of angle inputs
		if (convert.length()%2==0){
			for(int i=0; i<convert.length(); i+=2){
				//uses a substring method to grab the values in intervals of two
				String converted=convert.substring(i,i+2);
				//converts to char type because integer cannot go to string easily
				char toCharacter=((char)Integer.parseInt(converted, 16));
				//converts the char to a string and appends them to the return variable
				result=result.concat(Character.toString(toCharacter));
			}
		}
		
		//else statement does the same as the above if except for an odd number of angle inputs
		//essentially dropping the last angle input
		else{
			for(int i=0; i<convert.length()-1; i+=2){
				String converted=convert.substring(i,i+2);
				char toCharacter=((char)Integer.parseInt(converted, 16));
				result=result.concat(Character.toString(toCharacter));
			}
		}

		return result;
	}

}