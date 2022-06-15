package programing;

public class StrongNumber { // strong number =120+24+1=145;  

	public static void main(String[] args) {
		
		int v=0;
		
	  int num = 145; 
	  int fact=1;
	  while(num!=0)
	  {
		int  rem=num%10; 
		 fact = 1;
	  for (int i=1;i<=rem;i++)
	  {
		  fact =fact*i;
		  
	  }
	  v=v+fact;
	  num=num/10;
	  
	  }
	 
	  System.out.println(v);
	 
	//Strong Number=sum of thair digit factor is equal of the number such as factorial of 1 =1,factorial of 4=24;factorial of 5=120;
	  //sum of 1+120+21=145 

}
}