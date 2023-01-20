public class Factorial
{
	public static void main(String args[])
	{
		int n,fact=1,i;
		n=(int)(Math.random()*10);
		System.out.print("\nnumber is"+n+"\n");	
		
			for(i=n;i>=1;i--)
			{
				fact=fact*i;

			}

		System.out.print("\n factorial is"+fact+"\n");


	}
}