package textio;
import java.util.Queue;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * A garden of oak trees
 * Concepts covered: File reading; File writing; using Queue<E>; 
 * pass-by-value; Queue traversal. 
 * @author Dr. Boyer
 *
 */
public class Garden {

	/*************
	 * MEMBER VARIABLES
	 *************/
	//A queue of trees awaiting transplant onto the land
	Queue<OakTree> treesToPlant;

	//The land represented as a grid
	OakTree[][] land;

	//The dimensions of the land 
	int landWidth;
	int landLength;

	/**
	 * MAIN METHOD
	 */	
	public static void main (String [] args)  {
		Garden g = new Garden();
		//try {
			//TODO 1: make a new Scanner s on a new File where the tree info is stored
			Scanner s= new Scanner("/Users/Whitey/Desktop/trees.txt");

			while (s.hasNextLine()) {
				//TODO 2: make a new Scanner lineScanner on the next line of the tree file
				Scanner lineScanner=new Scanner(s.nextLine());
				lineScanner.useDelimiter(", ");
				
				String name = lineScanner.next();

				//TODO 3: read the double age of the tree on this line
				double age=Double.parseDouble(lineScanner.next());
				
				int height = Integer.parseInt(lineScanner.next().trim());

				//TODO 4: add a new OakTree with the above attributes to the queue
				//OakTree newTree= new OakTree(name,age,height);
				
				g.treesToPlant.add(new OakTree(name,age,height));
				

			} //while
		//} //try

		//TODO 5: write the catch block
//		catch(Exception e){
//		System.out.println("No garden planted yet but here's the queue!");
//		System.out.println(g.treesToPlant);
//		}
		//Add some baby trees to the queue
		g.treesToPlant.add(new OakTree("Tree1"));
		g.treesToPlant.add(new OakTree("Tree2"));
		g.treesToPlant.add(new OakTree("Tree3"));
		g.treesToPlant.add(new OakTree("Tree4"));
		
		//Write the resulting queue out as a file of trees
				try {
				      //create an print writer for writing to a file
				      PrintWriter out = new PrintWriter(new FileWriter("/Users/Whitey/Desktop/tree-output.txt"));

				      //output to the file a line
				      out.println(g.treesToPlant);

				      //close the file (VERY IMPORTANT!)
				      out.close();
				   }
				      catch(IOException e1) {
				        System.out.println("Error during reading/writing");
				   }
				
				//TODO 6: Change this so that it prints the trees in the same format
				//as the trees.txt file (comma-separated without the brackets etc.)

	}//main

	/*************
	 * METHODS
	 *************/

	public Garden() {
		treesToPlant = new LinkedList<OakTree>();
		landWidth=50;
		landLength=50;
		land = new OakTree[landWidth][landLength];
	}

	/**
	 * Plants every tree in the queue into a randomly selected spot
	 * in the garden. If there is a tree already there, this method moves
	 * on to the next available spot
	 */
	public void plantTreesInGarden() {

	}

	/**
	 * Grows every planted oak tree in the garden by its default amount
	 */
	public void grow() {

	}

	/**
	 * Adds land to the garden. Doesn't lose the trees
	 * that were already planted
	 * @param newWidth The new garden width, must be equal to
	 * or larger than old width
	 * @param newLength The new garden length, must be equal to
	 * or larger than old length
	 */
	public void expandLand(int newWidth, int newLength) {

	}

	/**
	 * Prints the trees awaiting planting
	 */
	public void printTreeQueue() {
		//Method 1: Print with a for-each loop
		//TODO 7
		

		//Method 2: Print with a for-loop that removes
		//and re-adds each tree
		//TODO 8 

	}//printTreeQueue
	
	/**
	 * Trees that are too large can't be transplanted into the garden.
	 * This method removes all trees higher than a threshold and leaves
	 * the rest of the queue intact. 
	 * @param threshold The height above which a tree must be removed from the queue
	 */
	public void removeLargeTreesFromQueue(int threshold) {
		//TODO 9: Fill in this method. Remember not to clobber the queue. 
	}

} //class
