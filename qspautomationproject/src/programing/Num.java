package programing;

public class Num {

	public static void main(String[] args) {
int a=567;
int b=0;
int rev=0;
while(a!=0)
{
	b=a%10;//765
	rev=rev*10+b;//7,76,765
	a=a/10;//56,5
	System.out.println(rev);
}

	}

}
