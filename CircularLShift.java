import java.io.*;
public class CircularLShift
{
	public static void main(String[] args)
	{
		Console con=System.console();
		
		int[] arr=new int[10];
		int i,j,temp;
		
	System.out.println("enter the values of the elements");

	for(i=0;i<arr.length;i++)
	{
		arr[i]=Integer.parseInt(con.readLine());

	}

	for(i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");	
	
	}

	
	System.out.println("enter number of times u want to shift");
	int n;
	n=Integer.parseInt(con.readLine());

	for(j=1;j<=n;j++)
	{
		temp=arr[0];
		int t=arr.length;
		for(i=0;i<t-1;i++)
		{
			arr[i]=arr[i+1];
		}
			arr[t-1]=temp;
	}	

	for(i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");	
	
	}

	}

}