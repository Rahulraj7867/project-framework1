package programing;

public class DecimalToBinary {

	public static void main(String[] args) {
     int a=15;//100;
	 int b=0;	
	 String res="";
     while(a!=0)
     {
    	 b=a%2;//
    	 a=a/2;//
    	  res=b+res;
    	
     }
     System.out.println(res);
		
		
	}

}
