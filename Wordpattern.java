import java.io.*;
public class Wordpattern
{
	public static void main(String args[])
	{
		String s1;
		Console con=System.console();
		s1=con.readLine();
		char arr[];
		arr=s1.toCharArray();
		for(int j=0;j<arr.length;j++)
		{
		char temp=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];

		}
		arr[arr.length-1]=temp;
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]);

		}
			System.out.println();
		}
	}
}