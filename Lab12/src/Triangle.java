
public class Triangle extends Shape{
	
	int height;
	int base;
	String printTriangle="";
	static int counterTri=0;
	
	public Triangle(String color, int height, int base){
		super(color);
		this.height=height;
		this.base=base;
		printTriangle=toString();
	}

	public double calculateArea(){
		double area=0;
		area=(height*base)/2;
		return area;
		
	}

	public String toString(){
		String result="";
		result="~~~~~~~~~~~~~~~"+"\n"+
				"Triangle's "+(counterTri+1)+" Info:"+"\n"+
				"Color: "+ color+"\n"+
				"Height: "+height+"\n"+
				"Base: "+base+"\n"+
				"Area: "+calculateArea()+"\n"+
				"~~~~~~~~~~~~~~~";
		return result;
		
	}
	
	
	
}
