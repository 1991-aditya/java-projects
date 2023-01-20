import java.io.*;
public class Palindrome
{
	public static void main(String[] args)
	{
		for(int i=1;i<=100;i++)
		{
			int num,rev,rem;
			num=i;
			rev=0;
			while(num>0)
			{
				rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
		
		if(num==rev)
		{
			System.out.println("the number "+num+ " is a pallindrome");	

		}		

		}
	}


}