import java.util.Arrays;

public class JustMathyThings {

	public static void main(String[] args) {
		
		int [] numberList= new int[10];
		for (int i=0;i<10;i++){
			numberList[i]=(int)((Math.ceil(Math.random()*999)));	
		}
		
		displayArr(numberList);
		System.out.println("The mean is: "+findMean(numberList));
		System.out.println("The range is: "+findRange(numberList));
		EveryOtherVal(numberList);
		
}
	
	public static void displayArr(int[]arr){
		
		String array="";
		array=Arrays.toString(arr);
		System.out.println("Random array generated: "+"\n"+array);
	}
	
	public static double findMean(int[]arr){
		
		double result=0;
		int sum=0;
		
		for (int i=0;i<10;i++){
			sum+=arr[i];
		}
		
		result=(double)sum/10;
		return result;	
	}
	
	public static int findRange(int[]arr){
		
		int max=0;
		int min=1000;
		for (int i=0;i<10;i++){
			if (arr[i]>max){
				max=arr[i];
			}
			else if(arr[i]<min){
				min=arr[i];
			}
		}
		
		int result=max-min;
		return result;
	}
	
	public static void EveryOtherVal(int[]arr){
		
		
		for (int i=0;i<10;i+=2){
			int value=0;
			value=arr[i];
			value*=2;
			arr[i]=value;
		}
		
		String array="";
		array=Arrays.toString(arr);
		System.out.println("New Array: "+"\n"+array);
		
	}

}
	
	
	
