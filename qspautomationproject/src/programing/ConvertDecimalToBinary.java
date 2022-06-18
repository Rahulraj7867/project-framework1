package programing;

public class ConvertDecimalToBinary {

	public static void main(String[] args) {
		int n=50;
		String b="";
		int rem=0;
		while(n!=0)
		{
			
			 rem=n%2; 
			
			 
			 n=n/2;
			 b=rem+b;
			
		}
		System.out.println(b);
		
	}
	

}
