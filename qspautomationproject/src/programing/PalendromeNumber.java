package programing;

public class PalendromeNumber {
	public static void main(String[] args) {
		
	
 int a=121;
 int b=a;
 int res=0;
 int rev=0;
 while (b!=0)
 {
	 res=b%10;
	  rev=rev*10+res;
	 b= b/10;
 }
 if (a==rev)
 {
	 System.out.println("it is palendrome number");	 
 }
 else 
	 
	 System.out.println("it is not a palendrome number");	 
	}
}
