package programing;

import io.netty.util.internal.SystemPropertyUtil;

public class PerfectNumber {

	public static void main(String[] args) {
		
int a=28;
int res=0;
for (int i=1;i<a;i++)
{
	if (a%i==0)
	{
	res=res+i;	
	}
}
if (a==res)
{
System.out.println("it is perfect number");	
}
else 
	System.out.println("it is  not perfect number");	

System.out.println(res);
}
	
}