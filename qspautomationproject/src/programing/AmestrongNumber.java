package programing;

public class AmestrongNumber {
public static void main(String[] args) {
	
		
		int num=145;
		int temp=num;
		int fact=0;
		int v=0;
		while(temp!=0)
		{
			int res=temp%10;
			fact=1;
			for (int a=1;a<=res;a++)
			{
			fact=fact*a;	
			}
		v=v+fact;
		temp=temp/10;
			
		}
		if (v==num)
		{
			System.out.println("it is strong number");
		}
		else 
  System.out.println("it is not strong number");
}
}
