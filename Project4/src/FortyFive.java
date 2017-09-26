
public class FortyFive extends Record {
	
	//Creates a 45 record, Uses the variables from the Record superclass
	public FortyFive(String artist, String title, int year){
		super(artist,title,year);	
	}
	
	//Prints the information of the 45 in the specified format
	public String toString(){
			String result="45: "+getTitle()+" by "+getArtist()+", "+getYear();
			return result;
		}

}


