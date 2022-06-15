package programing;

public class am {

	public static void main(String[] args) {
		int n=370;int t=0;
		int t1=n;
		while(t1!=0)
		{
			t1=t1/10;
			t++;
			
		}
		System.out.println(t);	
		int t2=n;double t3=0;
		int res=0;
		double result=0;
		while(t2!=0)
		{
			 res=t2%10;
			result =Math.pow(res, t);
			t3=t3+result;
			  t2=t2/10;
		}
		System.out.println(t3);
		 if (t3==n)
		 {
			 System.out.println("it is amstrong number");
		 }
		 else 
			 System.out.println("it is not amstrong number");
		
		
	}
}