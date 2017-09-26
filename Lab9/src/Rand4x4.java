//For array char[][][]x= new char[9][5][4]
//Number of elements: 180
//x.length = 9
//x[2].length = 5
//x[0][0].length = 4

public class Rand4x4 {

	public static void main(String[] args) {
		//initializes array
		int[][] rand= new int[4][4];
		//puts in values for the array and prints
		for(int i=0; i<rand.length;i++){
			for (int j=0; j<rand[i].length; j++){
				rand[i][j]=(int)(Math.rint(Math.random()));
				System.out.print(rand[i][j]+" ");
			}
			System.out.println();
		}
		
		
		int row=0;	
		int max=0;
		//finds how many "1" are in each row
		for(int i=0; i<rand.length;i++){
			int input=0;
			for (int j=0; j<rand[i].length; j++){
				if (rand[i][j]== 1){
			    	  input+=1;
			      }
			}
		//sets the row index to the value with the most "1"
			if (input>max){
				max=input;
				row=i;
				}
		}
		System.out.println("The largest row index: " +row);
		
		int column=0;	
		int columnmax=0;
		//Finds how many "1" are in each column
		for(int i=0; i<rand.length;i++){
			int input=0;
			for (int j=0; j<rand[i].length; j++){
				if (rand[j][i]== 1){
			    	  input+=1;
			      }
			}
			//set column index to column with greatest number of "1"
			if (input>columnmax){
				columnmax=input;
				column=i;
				}
		
		}
		System.out.println("The largest column index: " +column);
	
		//gets the sum of the diagonal spots 
		int sum=0;
		for(int i=0,j=0; i<rand.length;i++, j++){
			sum+=rand[i][j];
		}
		System.out.println("The sum of the diagonal: "+sum);
		
	}
	

}
