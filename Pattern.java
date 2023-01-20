public class Pattern
{
  public static void main(String args[])
 {
	int a,i,j;
		a=(int)(Math.random()*10);		
			
			for(i=1;i<=a;i++)
			{
				for( j=1;j<=a-i;j++)
					System.out.print(" ");
				for( j=1;j<=i;j++)
					System.out.print(j);
				for( j=j-2;j>0;j--)
					System.out.print(j);

				System.out.print("\n");

			}


	
}
}