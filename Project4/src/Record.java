
public class Record {
	
	private String artist;
	private String title;
	private int year;
	
	
	public Record(String artist, String title, int year){
		//Sets the variables for all record objects, including 45 and LP
		this.artist=artist;
		this.title=title;
		this.year=year;
		
	}
	
	//Getters
	public String getArtist(){
		return artist;
	}
	
	public String getTitle(){
		return title;
	}
	
	public int getYear(){
		return year;
	}
	
	//The default toString record method, gets overridden by the toString of 45 and LP classes 
	public String toString(){
		String result="";
		return result;
	}

}