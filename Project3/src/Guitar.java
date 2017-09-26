import java.util.concurrent.ThreadLocalRandom;

public class Guitar {

	private double [][] guitar;
	private int string;
	private int chord;
	private double[] chordArray;
	

	//default Guitar constructor
	public Guitar(){

	}


	//Creates the guitar object based on the command line parameters
	//Creates the guitar array
	public Guitar(int string, int chord){
		System.out.println("Guitar(): Generated new guitar with "+string+" strings. Song length is "+chord+" chords.");
		this.string=string;
		this.chord=chord;
		guitar= new double[string+1][chord];
		
		//Generates and prints the loop upon object creation
		generateSong();
		printSong();
		
	}


	//Setters and Getters
	public void setStrings(int s){
		this.string=s;
	}

	public int getString(){
		return string;
	}

	public void setChords(int c){
		this.chord=c;
	}

	public int getChord(){
		return chord;
	}

	public double[] getChordArray(){
		return chordArray;
	}


	//Generates the song by using for loops to assign random numbers
	//to each spot in the array
	public void generateSong(){
		for(int i=0; i<string;i++){
			for (int j=0; j<chord; j++){
				//Makes the random number from 27.5 to 4186(exclusive)
				double random=ThreadLocalRandom.current().nextDouble(27.5,4186);
				guitar[i][j]= random;
			}
		}

		//Generates the time of each chord
		for (int i=string;i<string+1;i++){
			for(int j=0;j<chord;j++){
				//Makes the random time variable from 0 to 3 (both exclusive)
				double time=ThreadLocalRandom.current().nextDouble(.1,3);
				guitar[i][j]=time;
			}	
		}
		
	}

	//Prints out the song from generateSong()
	public void printSong(){
		for(int i=0; i<string;i++){
			for (int j=0; j<chord; j++){
				//Use %7.2 modifier to line up all the values in the table
				//and then print the value to a 2 decimal rounded value
				System.out.printf("%7.2f", guitar[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=string; i<string+1;i++){
			for (int j=0; j<chord; j++){
				//Use %7.1 modifier to line up all the values in the table
				//and then print the value to a 1 decimal rounded value
				System.out.printf("%7.1f", guitar[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	//Simulates the song using a rounded timer for the amount of time for each chord
	public void SimulateSong()throws InterruptedException{
		System.out.println("Guitar.SimulateSong()");
		double timer=0;
		int counter=0;

		//Prints the guitar array with each chord printed horizontally
		for(int i=0; i<chord;i++){
			for (int j=string-1; j>=0; j--){
				//Prints rounded values of guitar array to 2 decimal places
				System.out.printf("%7.2f", guitar[j][i]);
				System.out.print(" ");
				//Creates a single int value to be used for the timer rounded up to the nearest second
				timer=guitar[string][i];
				counter=(int)(Math.ceil(timer));
			}
			//Uses a loop to print the timed dots
			for(int z=0;z<counter;z++ ){
				System.out.print(". ");	
				Thread.sleep(1000);
			}

			System.out.println(" ");

		}
		System.out.println();
	}


	public double[] getChordAsArray(int chordNum){
		//Creates a chord to grab a single chord of the guitar array
		this.chordArray= new double[string+1];

		//Grabs the chord if it exists
		if(chordNum<=this.chord){
			for (int i=0;i<guitar.length; i++){
				this.chordArray[i]=guitar[i][chordNum];
			}
			return chordArray;
		}
		//Returns null if no chord is available
		else{
			System.out.println("No such chord!");
			return null;
		}

	}

}