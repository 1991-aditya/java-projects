public class SuperPalindrome
{
	public static void main(string[] args)
	{
		int i,num,rem,rev,temp,temp2;
		for(i=1;i<=100;i++)
		{
			num=i;
			temp=num;
			rev=0;
			while(num!=0)
			{
				rem=num%10;
				rev=rev*10+rem;
				num=num/10;	
			}
			
			if(temp==rev)
			{
				num=num*num;
				temp2=num;
				rev=0;
				while(num!=0)
				{
					rem=num%10;
					rev=rev*10+rem;
					num=num/10;	
				}
				
				if(temp2==rev)
				{
					System.out.print("the number"+temp+"is super palindrome");

				}
			}

		}	



	}



}