
public class UnderstandingStrings {

	public static void main(String[] args) {
		String s1 = "Go";
		String s2 = "Gators";
		String s3 = new String("Go");
		System.out.println(s1.equals(s2));
		// prints out false because the two strings do not equal each other
		System.out.println(s1.equals(s3));
		//prints out true, because the string in the two different memory addresses are the same
		System.out.println(s1 == s3);
		//false, the memory addresses are being compared and are not the same
		System.out.println(s1.compareTo(s3));
		//0, s1 and s3 are the same object inside two different memory addresses so it comes back 0
		s1 = "Gators";
		s3 = "Florida";
		System.out.println(s1 == s2);
		//true, both s1 and s2 point to the same memory because they are now the same object for Gators
		System.out.println(s1.compareTo(s2));
		//0, both the objects are the same now so when compared they is no difference
		System.out.println(s3.compareTo(s1));
		//-1, because Florida comes before Gators lexicographically
		
		//additional question: What does s3 have to be equal to in order to
		//get a positive number when doing compareTo?
		// s3 has to be a word that starts with a letter after G, so H-Z or any lowercase letter


	}

}
