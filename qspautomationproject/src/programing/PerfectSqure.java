package programing;

public class PerfectSqure {

	public static void main(String[] args) {
	int rs=0;
	int a=36;
	for(int i=1;i<=a;i++)
	{
		if((a%i==0)&&(a/i==0))
		{
			System.out.println(i);
			
		}
	}
	
	}
}

