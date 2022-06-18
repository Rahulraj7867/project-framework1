package programing;

public class LargestNumberbetweenlist {

	public static void main(String[] args) {
		int a[]= {5,10,20,8,4,23};
		int max= a[0];
		for (int i=1;i<a.length;i++)
		{
			if(max<=a[i])
			{
				max=a[i];
			}
			
		}
		System.out.println(max);
		

	}
	
	
	

}
