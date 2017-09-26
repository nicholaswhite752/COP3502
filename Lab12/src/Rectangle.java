
public class Rectangle extends Shape {
	
	int height;
	int width;
	String printRectangle="";
	static int counterRec=0;
	
	public Rectangle(String color, int height, int width){
		super(color);
		this.height=height;
		this.width=width;
		printRectangle=toString();
	}
	
	public double calculateArea(){
		double area=0;
		area=height*width;
		return area;
		
	}

	public String toString(){
		String result="";
		result="~~~~~~~~~~~~~~~"+"\n"+
				"Rectangle's "+(counterRec+1)+" Info:"+"\n"+
				"Color: "+ color+"\n"+
				"Height: "+height+"\n"+
				"Width: "+width+"\n"+
				"Area: "+calculateArea()+"\n"+
				"~~~~~~~~~~~~~~~";
		return result;
		
	}

}
