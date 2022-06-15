package programing;

public class PerfectNumberBetween1to100 {

	public static void main(String[] args) {
       int a; int res=0;
		for ( a=1;a<100;a++)
		{     
			 for(int i=1;i<a;i++)
			 {
				 
				 if (a%i==0)
				 {
				   res=res+i;	 
				 }
				  
			 }
			 if(a==res)
			 {
				 System.out.println(res); 
			 }
			res=0;  
		}
		
	}

}
