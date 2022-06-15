package programing;

import java.util.stream.IntStream;

public class ProgramForOccuranceOfCharector {

	public static void main(String[] args) {
		String name= "vishal is vijay";
		String[] split = name.split("");
		String nam="";
		for(int i=0;i<=name.length()-1;i++)
		{
			 nam = nam+name.charAt(i);
			
		}
		System.out.println(nam);
		 for(String we:split)
		 {
			we=we+we;
			System.out.println(we);
		 }

}
}