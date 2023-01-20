public class Power
{
	public static void main(String args[])
	{
		int a,b,p=1,i;
		
		a=(int)(Math.random()*10);
		b=(int)(Math.random()*10);
		System.out.print("\n first number is:"+a+"\nsecond number is:"+b+"\n");

		for(i=1;i<=b;i++)
		{
			p=p*a;


		}
	
		System.out.print("\nfirst number raised power second is"+p+"\n");

	}

}