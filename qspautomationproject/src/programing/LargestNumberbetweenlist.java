package programing;

public class LargestNumberbetweenlist {

	public static void main(String[] args) {
		int a[]= {5,10,20,8,4,23};
		int max= a[0];
		for (int x=1;x<a.length;x++)
		{
			if(max<=a[x])
			{
				max=a[x];
			}
			
		}
		System.out.println(max);
		

	}
	
	
	

}
