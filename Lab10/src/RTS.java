import java.util.Scanner;
public class RTS {



	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+"\n"+"~~~~Regional Transit System Scheduler~~~~"
		+"\n"+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		

		BusRoute[] myRoutes= new BusRoute[3];

		for (int i=0; i<3; i++){
			System.out.println("Creating route"+(i+1));
			System.out.println("Name of route: ");
			int name= s.nextInt();
			System.out.println("Start Destination: ");
			s.nextLine();
			String start=s.nextLine();
			System.out.println("End Destination: ");
			String end=s.nextLine();
			System.out.println("Time: ");
			int time=s.nextInt();
			myRoutes[i]=new BusRoute(name, start, end, time);
		}
		BusRoute route1=myRoutes[0];
		BusRoute route2=myRoutes[1];
		BusRoute route3=myRoutes[2];


		boolean on=true;
		while (on){
			System.out.println("Main Menu" + "\n");
			System.out.println("1. View Route");
			System.out.println("2. View Number of Routes");
			System.out.println("3. Change Route");
			System.out.println("4. Exit");


			int input=s.nextInt();

			if (input==1){
				System.out.println("Which route: ");
				String busRoute=s.next();

				if (busRoute.equals("route1")){
					System.out.println(route1.toString());
				}
				else if (busRoute.equals("route2")){
					System.out.println(route2.toString());

				}
				else if (busRoute.equals("route3")){
					System.out.println(route3.toString());
				}
			}
			else if (input==2){
				BusRoute.printNumRoutes();

			}
			else if (input==3){
				System.out.println("Which Route: ");
				String changeInput=s.next();
				
				if (changeInput.equals("route1")){
					route1.changeRoute();
				}
				else if (changeInput.equals("route2")){
					route2.changeRoute();

				}
				else if (changeInput.equals("route3")){
					route3.changeRoute();
				}
			}
			else if (input==4){
				on=false;
			}


		}

		System.out.println("Stop requested. For your safety, if crossing the street: please wait till the bus" +"\n" +
				"departs, look both ways, and use crosswalk if available.");




	}

}
