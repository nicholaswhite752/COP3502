
public class LP extends Record {
	
	//Creates a LP record, Uses the variables from the Record superclass
	public LP(String artist, String title, int year){
		super(artist,title,year);	
	}
	
	//Prints the information of the LP in the specified format
	public String toString(){
		String result="LP: "+getTitle()+" by "+getArtist()+", "+getYear();
		return result;
	}

}
