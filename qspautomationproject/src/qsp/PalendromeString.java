class PalendromeString 
{
	public static void main(String[] args) 
	{
		String name="mom;
		String rname="";
		 for (int n=name.length()-1;n>=0 ; n--)
		 {
			 rname=rname+name.charaAt(n);

		 }
		 

		System.out.println(rname);
	}
}
