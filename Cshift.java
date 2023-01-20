import java.io.*;
public class Cshift
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

		int temp=a[0];
		for(i=0;i<9;i++)
		{
			a[i]=a[i+1];
		}
			a[9]=temp;

		for(i=0;i<=9;i++)
		{
			System.out.println(a[i]+" ");
		}

	}

}