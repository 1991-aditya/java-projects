import java.io.*;
public class BubbleSort
{
	public static void main(String[] args)
	{
		Console con=System.console();
		int i,j,max,temp;
		int[] a=new int[10];
		System.out.println("enter the array elements");
		for(i=0;i<=9;i++)
		{
			a[i]=Integer.parseInt(con.readLine());
		
		}

		for(i=0;i<=9;i++)
		{
			System.out.println("the array is"+a[i]+" ");
		}
		
		int n=a.length;
		for(i=0;i<=n-1;i++)
		{
			
			for(j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;

				}

			}


		}

		for(i=0;i<=9;i++)
		{
			System.out.println("the sorted array is"+a[i]+" ");
		}

	}
}
