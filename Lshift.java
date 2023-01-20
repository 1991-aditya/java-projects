import java.io.*;
public class Lshift
{
	public static void main(String args[])
	{
		Console con=System.console();
		int i;
		int[] a=new int[10];
		for(i=0;i<=9;i++)
		{
			a[i]=Integer.parseInt(con.readLine());

		}
		
		for(i=0;i<=9;i++)
		{
			System.out.println(a[i]+" ");

		}	
					
		for(i=0;i<9;i++)
		{
			a[i]=a[i+1];
		}	
			a[9]=0;
		
		System.out.println("the sorted array is");
		for(i=0;i<=9;i++)
		{
			System.out.println(a[i]+" ");

		}	

	}

}