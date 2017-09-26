
public class NumSum {

	public static void main(String[] args) {
		
		
		int sum=0;
		int count=0;
		while (count<101){
			if ((count<=100 && (count%2!=0 && count%5!=0))){ 
				sum+=count;
				count++;
			}
			else if(count<=100 && (count%10==0)){
				sum+=count;
				count++;
			}
			else {
				count++;
			}
		}
		System.out.println(sum);
		
		
	}

}
