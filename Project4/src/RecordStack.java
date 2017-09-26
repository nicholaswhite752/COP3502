
public class RecordStack {
	
	//Creates the variables for the top of the stack and the stack itself
	//Data is set to 0 length, so the resizeStack works correctly
	private Record[] data=new Record[0];
	private int top=0;
	
	
	public RecordStack(){
		//Default
		
	}
	
	
	//Reaches the top of the stack with top-1, due to some incrementing in the push method
	public Record getSpecifiedRecord(){
		return data[top-1];
	}
	
	//Pushes the record onto the stack
	public void push(Record r){
		//Checks if the stack is empty or at capacity as well and resizes 
		if (isAtCapacity()){
			resizeStack(data.length+1);
		}
		
		//pushes the album to the top of the stack
		data[top] = r; 
		//increments top
		top++;
	}
	
	//resizes the stack if it is atCapacity or Empty by adding 1
	public void resizeStack(int newCapacity){
		//Creates a temporary array that is one size bigger than the data array
		Record[] newArray = new Record[newCapacity]; 
		//Uses a for loop to assign all the spots in the temporary array with the data array information
		for(int i = 0; i < top; i++){
			newArray[i] = data[i]; 
		}
		//Reassigned data array
		data = newArray; 
	}
	
	//Takes an element off of the top of the stack and resizes if need be
	public Record pop(){
		if(top!=0){
			Record poppedElement = data[--top];
			return poppedElement;
		}
		else{
			return null;
		}
	}

	//Checks if the stack is empty as well as if the array is at capacity for resizing purposes
	public boolean isEmpty(){
		if (top==0)
			return true;
		else
			return false;
	}
	
	//Checks the capacity for resizing purposes
	public boolean isAtCapacity(){
		return top==data.length;
	}
	
	//Returns array size
	public int size(){
		return top;
	}
	
	//Getter for the data length
	public int getDataSize(){
		return data.length;
	}
	
	//Getter for the top of the record stack
	public Record peek(){
		return data[top-1];
	}
	
	
	//To String method, overwritten by the individual records toString method
	public String toString(){
		String result= "The album sold is: ";
		for (int i = 0; i < top ; i++){
			result+=data[i]+ " ";
		}
		return result;
	}
}
