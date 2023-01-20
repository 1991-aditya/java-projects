import java.io.*;
public class VerticalH
{
	public static void main(String[] args)
	{
		Console con=System.console();
		int i,j;
		int[] arr=new int[10];
		
		System.out.println("enter the values of the elements");
		
		for(i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(con.readLine());

		}
		
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	
		int max=arr[0];
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}

		System.out.println("max is"+max);
		int t=max;
		for(j=0;j<t;j++)
		{
			for(i=0;i<arr.length;i++)
			{
				if(arr[i]>=max)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
				
			}
		max--;
		System.out.print("\n");

		}

	}

}

