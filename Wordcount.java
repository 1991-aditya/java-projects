import java.io.*;
public class Wordcount
{
	public static void main(String args[])
	{
		String s1;
		Console con=System.console();
		s1=con.readLine();
		char arr[];
		arr=s1.toCharArray();
		int count=0;
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==' ')
			{
			if(arr[i+1]!=' ')
				count++;
			else
				{
					int k=i;
					while(k<arr.length-1)
					{
						arr[k]=arr[k+1];
						k++;
					}
					arr[arr.length-1]=0;
				}
			}
			
		}
		count++;	
		System.out.println("number of words"+count);

	}



}