import java.io.*;
class Library
{
	public static void main(String args[])
	{
		Item I[]=new Item [10];
		int i;
		String str,str1;
		str1="b";
		Console con=System.console();
		
		for(i=0;i<=3;i++)
		{
			System.out.println(" whether book or dvd ");	
			str=con.readLine();
			if(str1.equals(str))
			{
				I[i]=new Book();
				I[i].read();
			}
			else
			{
				I[i]=new Dvd();
				I[i].read();
			}

		}

		for(i=0;i<=3;i++)
		{
			I[i].show();
		}
		

	}

}