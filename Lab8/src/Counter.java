import java.util.Scanner;
public class Counter {
	public static void main(String[] args) throws InterruptedException{
		
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Start time in seconds: ");
		int seconds=s.nextInt();
		
		for (int i=seconds; i>=0;i--){
			int minutes=i/60;
			int sec=i%60;
			String minString="";
			String secString="";
			
			if (minutes>=10){
				minString=String.valueOf(minutes);
			}
			else if(minutes<10){
				minString="0"+String.valueOf(minutes);
			}
			
			if (sec>=10){
				secString=String.valueOf(sec);
			}
			else if (sec<10){
				secString="0"+String.valueOf(sec);
			}
			
			
			System.out.println(minString+":"+secString);
			
			Thread.sleep(1000);
			
			
		}
		
	}
}
