package programing;

public class PalendromeString {

	public static void main(String[] args) {

		String name ="mom";
		String rname="";
		for(int a=name.length()-1;a>=0;a--)
		{
			rname =rname +name.charAt(a);
			
		}
		if(name.equals(rname))
		{
			System.out.println("it is palendrome string ");

		}
		else 
			System.out.print("it is not palendrome String ");
		
}
}
