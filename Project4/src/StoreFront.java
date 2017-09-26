import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

/**
 * This is a skeleton code provided for students' convenience. 
 * The public methods specified here are required. The private methods are optional.
 * Do not change names of member variables for this class. Do not change public method signatures.
 * All of those items will be tested by the teaching staff's JUnit testing. 
 * The private methods here (or ones that you create as part of your own design) will not be
 * JUnit tested. 
 * @author Dr. Boyer
 *
 */
public class StoreFront {
	private Queue<Record> repairQueue= new LinkedList<Record>();
	private RecordStack inventory45s = new RecordStack();
	private RecordStack inventoryLPs = new RecordStack();
	private RecordStack initialInventory=new RecordStack();

	/**
	 * This main method takes two command-line arguments. 
	 * First it takes a string of the full path to a file from which Lucy's
	 * repair queue should be initialized.
	 * Second it takes a string of the full path to a file from which Lucy's
	 * inventory stacks be initialized. That file has LPs and 45s interleaved.
	 * The main method deals with that to create the two inventory stacks.
	 * @param args The full path to a file for the repair queue and a file for inventory
	 */
	public static void main(String[] args) {

		System.out.println("Hello Lucy! How are you? What will you be doing today?");

		//You can name this whatever you want, but this line of code is left here
		//to help you see that you'll instantiate a StoreFront object inside this main method
		StoreFront lucysStore = new StoreFront();

		//Here's a helpful hint of how to initialize the repair queue. 
		//You call the methods for this class from the instantiated StoreFront object
		//whether you call it lucysStore or something else is up to you. 
		lucysStore.repairQueue = InventoryPopulator.getInitialRepairQueue(args[0]);

		//TODO: Code to initialize both inventory stacks.

		//Takes the information from the second command line files and populates the inventory
		lucysStore.initialInventory= InventoryPopulator.getInitialInventory(args[1]);

		for(int i=0;i<lucysStore.initialInventory.getDataSize();i++){
			Record fileInput=lucysStore.initialInventory.peek();
			

			//Differentiates between an LP and 45 when populating the initial inventory
			if( fileInput instanceof FortyFive){
				lucysStore.inventory45s.push(lucysStore.initialInventory.pop());
			
			}
			else if(fileInput instanceof LP){
				lucysStore.inventoryLPs.push(lucysStore.initialInventory.pop());
				
			}

		}


		//TODO: Code that displays the menu and gets Lucy's response until she wants to quit

		//Method that displays and runs the menu
		lucysStore.displayMenu();
	} 

	/**
	 * StoreFront constructor. Initializes the repairQueue, inventory45s, and inventoryLPs
	 * to empty structures.
	 */
	public StoreFront() {

	}

	/**
	 * Adds the specified album to the end of the repair queue.
	 * Since there is no limit to the size of the repair queue this method just adds the record.
	 * @param r The record to add to the repair queue
	 */
	public void addAlbumToRepair(Record r) {
		//Adds Album to the repair Queue with a built in method
		try{
		repairQueue.add(r);
		}
		catch(Exception e){
			
		}
	}

	/**
	 * Removes the album at the head of the repair queue.
	 * If the repair queue was already empty, this does nothing. 
	 */
	public void repairAlbum() {
		//Removes Album from repair Queue with a built in Queue method
		try{
			repairQueue.remove();
			System.out.println("\n"+"An Album has been Repaired!"+"\n");
		}
		//Uses a catch for the exception if no more albums need to be repaired
		catch(Exception e){
			System.out.println("\n"+"You have fixed everything! Congrats!"+"\n");	
		}
	}		

	/**
	 * Displays the repair queue, as a list of single albums per line. 
	 * Each album is displayed precisely as mandated for the Record.toString method. 
	 * There is no new line at the end of the returned String but there is a newline between
	 * each displayed album.
	 * @return
	 */
	public String printRepairQueue() {
		String result="";

		//Made a temporary Queue so the original doesn't get destroyed in the printing process
		Queue<Record> temp= new LinkedList<Record>();

		//Uses a for-loop to grab the top of the Queue, print, and assign the printed object to the temporary queue
		try{
		for(int i=0;i<repairQueue.size()+i && repairQueue.size()>1;i++){
			Record obj1=repairQueue.peek();
			temp.add(repairQueue.remove());
			result+=obj1.toString()+"\n";
			}
		//uses an if statement so the last print doesn't have an extra line
		if(repairQueue.size()==1){
			Record obj1=repairQueue.peek();
			temp.add(repairQueue.remove());
			result+=obj1.toString();
			}
		}
		catch(Exception e){
			
		}
		
		//Resetting the original Queue
		repairQueue=temp;

		return result;
	}

	/**
	 * Adds a new album to the top of the appropriate inventory stack.
	 * @param r The LP or 45 to add to the inventory. 
	 */
	public void addAlbumToSell(Record r) {

		//Adds and album to sell and puts in on appropriate stack
		if( r instanceof FortyFive){
			inventory45s.push(r);
		}
		else if(r instanceof LP){
			inventoryLPs.push(r);
		}
	}


	/**
	 * Removes the topmost item from the inventory of LPs.
	 * If the inventory is empty, calling this method will cause a runtime exception.
	 * Your code must check for empty before calling this method. 
	 */
	public void sellLP() {

		//Sells an LP, but only if there is an Album on the stack 
		try{
			Record sell= inventoryLPs.getSpecifiedRecord();
			String toPrint=sell.toString();
			System.out.println("\n"+"An Album of type LP has been sold!");
			System.out.println(toPrint);
			System.out.println();
			inventoryLPs.pop();
		}
		//If no album is on the stack, the exception is bypassed and the program prints a message and shuts down
		catch(Exception e){
			System.out.println("Warning: Planetary Explosion Inevitable!");
			System.out.println("Shutting Down!");
			System.exit(0);
		}
	}

	/**
	 * Sells a 45. Removes the topmost 45 from the inventory stack.
	 */
	public void sell45() {

		//Sells an 45, but only if there is an Album on the stack 
		try{
			Record sell= inventory45s.getSpecifiedRecord();
			String toPrint=sell.toString();
			System.out.println("\n"+"An Album of type 45 has been sold!");
			System.out.println(toPrint);
			System.out.println();
			inventory45s.pop();
		}
		//If no album is on the stack, the exception is bypassed and the program prints a message and shuts down
		catch(Exception e){
			System.out.println("Warning: Planetary Explosion Inevitable!");
			System.out.println("Shutting Down!");
			System.exit(0);
		}

	}

	/**
	 * This method displays the inventory. It is PROVIDED to students to avoid annoying
	 * test case failure due to small formatting problems. :) 
	 * It is JUnit testable for precise, correct output. 
	 * @return a String representation of the inventory. First LPs then 45s. 
	 * 		   Does not include a new line at the end of this string representation. 
	 */
	public String displayInventory() {
		String LPs = (this.inventoryLPs.size() == 1) ? " LP " : " LPs ";
		String FortyFives = (this.inventory45s.size() == 1) ? " 45." : " 45s.";
		return "You have " + this.inventoryLPs.size() + LPs + "and " + 
		this.inventory45s.size() + FortyFives;	
	}

	/*
	 * This method displays the storefront menu. Dr. Boyer thinks it is convenient to 
	 * display the menu to Lucy, get her choice, and then return that choice from this method.
	 * If your menu items are not ints then you would change the return type. 
	 * You can also just delete this method if it doesn't fit your design.  
	 * @return the selection that Lucy made, as an integer
	 */
	private void displayMenu() {

		//Creates Scanner for menu input
		Scanner menu= new Scanner(System.in);

		//While loop prints and runs the menu until stopped
		while(true){
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("1. Add a New Album to be Repaired");
			System.out.println("2. Repair an Album");
			System.out.println("3. View Album Repair Queue");
			System.out.println("4. Add an Album to be Sold");
			System.out.println("5. Sell an LP Album");
			System.out.println("6. Sell an EP Album");
			System.out.println("7. View Sales Inventory");
			System.out.println("8. Abandon All Hope");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Pick an option: ");

			int input= menu.nextInt();
			
		
			if (input==1){
				//Gets record information from user
				Record newRepair=getRecordInfoFromLucy();

				//Only adds a record to the Queue is the record is not returned as null
				//This is so no exceptions occur and the program doesn't break upon trying to repair a null object
				if(newRepair!=null){
					addAlbumToRepair(newRepair);
					System.out.println("\n"+"An Album has been added to the Repair Queue!"+"\n");
				}
			}

			else if (input==2){

				//Calls the method to remove an object off the repair queue
				repairAlbum();
			}

			else if (input==3){

				//Calls the method to print the Queue
				System.out.println("\n"+"The Repair Queue Contains: ");
				String printQueue=printRepairQueue();
				System.out.println(printQueue);

			}


			else if (input==4){
				//Asks user for record information
				Record addition= getRecordInfoFromLucy();

				//Only adds a record to the appropriate stack if the record is not returned as null
				//This is so no exceptions occur and the program doesn't break upon trying to sell a null object
				if(addition!=null){
					addAlbumToSell(addition);
					System.out.println("\n"+"An Album has been Aquired to Sell!"+"\n");
				}
			}


			else if (input==5){
				//Calls method to sell a LP
				sellLP();
			}

			else if (input==6){
				//Calls method to sell a 45
				sell45();
			}

			else if (input==7){
				//Calls the method given to us to display the amount in each of the sell stacks
				System.out.println(displayInventory());
			}

			else if (input==8){
				//Turns the program off
				System.out.println("Program Terminating.");
				System.exit(0);
			}

			else{

			}
		}
	} 



	/*
	 * This is a service method within this class, provided only for your convenience. 
	 * You do not have to use it (you can delete this method  and structure your code
	 * however you like, including the ways in which you get the info for the new Record
	 * that Lucy wants to either add to inventory or add to the repair queue). 
	 * It is  up to your discretion how to ask Lucy for each new record's information
	 * This method will NOT be JUnit tested. 
	 * @return a new Record which will either be added to a queue or a stack, depending on context
	 */


	//additional ones
	private  Record getRecordInfoFromLucy() {
		//Tries to create an album object based on input from the user
		try{
			Scanner s = new Scanner(System.in);
			System.out.println("Ok! What is the title of the album?");
			String title = s.nextLine();
			System.out.println("What is the artist name?");
			String artist = s.nextLine();
			System.out.println("What is the album's year?");
			int year = Integer.parseInt(s.nextLine().trim());
			System.out.println("Is it an LP or a 45? Type 'LP' or '45'.");
			String type = s.nextLine();
			if (type.equals("LP")) 
				return new LP(artist, title,year);
			else if (type.equals("45")) 
				return new FortyFive(artist,title,year);
			else return null;
		}
		//If the information is incorrect it returns null
		//A null object will not be used in the other methods because of the 
		//if(album!=null) statements in the other methods
		catch(Exception e){
			return null;
		}
	}

}//class

