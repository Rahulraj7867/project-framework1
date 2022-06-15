package programing;

public class ExchanngeValueWithoutUsingThirdVeriable {

	public static void main(String[] args) {
int a=4;
int b=5;

a=b+a;
b=a-b;
a=a-b;

System.out.println("a="+a);
System.out.println("b="+b);


	}

}
