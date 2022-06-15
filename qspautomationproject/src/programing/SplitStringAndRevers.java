package programing;

public class SplitStringAndRevers {

	public static void main(String[] args) {
		String sentance ="my name is rahuls";
		String rev="";
		String[] splitsen = sentance.split(" ");
		for (String we:splitsen)
		{ 
			String revWord="";
		for(int i=we.length()-1;i>=0;i--)
		{
			revWord=revWord+we.charAt(i);
		}
		 rev=rev+revWord+" ";
			
		}
		System.out.println(rev);
		
	}

}
		