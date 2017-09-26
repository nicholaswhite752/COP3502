
public class Circle extends Shape {
	
	int radius;
	String printCircle="";
	static int counter=0;
	
	
	public Circle(String color, int radius){
		super(color);
		this.radius=radius;
		printCircle=toString();
		
	}
	
	
	public double calculateArea(){
		double area=0;
		area=Math.PI*Math.PI*radius;
		return area;
		
	}

	public String toString(){
		String result="";
		result="~~~~~~~~~~~~~~~"+"\n"+
				"Circle's "+(counter+1) +" Info:"+"\n"+
				"Color: "+ color+"\n"+
				"Radius: "+radius+"\n"+
				"Area: "+calculateArea()+"\n"+
				"~~~~~~~~~~~~~~~";
		counter++;
		return result;
		
	}
	
	
	
}
