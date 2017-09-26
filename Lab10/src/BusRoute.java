import java.util.Scanner;
public class BusRoute {

	int bRName;
	String startDest;
	String endDest;
	int time;
	static int numRoutes=0;	
		
	public BusRoute(int name, String start, String end, int time){
		bRName=name;
		startDest=start;
		endDest=end;
		this.time=time;
		numRoutes++;
			}
	
	public String toString(){
		String result="";
		result= bRName+" "+startDest+" "+endDest+" "+time;
		return result;
	}
	
	static void printNumRoutes(){
		System.out.println("Number of routes:"+numRoutes);
		
	}
	
	public void changeRoute(){
		Scanner s= new Scanner(System.in);
		System.out.println("New Name: ");
		bRName=s.nextInt();
		System.out.println("New Start Destination: ");
		s.nextLine();
		startDest=s.nextLine();
		System.out.println("New End Destination: ");
		endDest=s.nextLine();
		System.out.println("New time: ");
		this.time=s.nextInt();
	}

	
	
	}


