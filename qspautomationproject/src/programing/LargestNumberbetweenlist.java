package programing;

public class LargestNumberbetweenlist {

	public static void main(String[] args) {
		int a[]= {5,10,20,8,4,23};
		int max= a[0];
		for (int v=1;v<a.length;v++)
		{
			if(max<=a[v])
			{
				max=a[v];
			}
			
		}
		System.out.println(max);
		

	}
	
	
	

}
