package programing;

public class SmallestNumberFromList {

	public static void main(String[] args) {
int a[]= {45,56,23,47,3,34,6,7,43};
int min=a[0];
for (int i=1;i<=a.length-1;i++)
{
	if(min>=a[i])
	{
		min=a[i];
	}
}
System.out.println(min);
	}

}
