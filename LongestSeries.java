public class LongestSeries
{
	public static void main(String[] args)
	{
		int a,b,count=1,max=0,i;
		
		a=(int)(Math.random()*100);	
		System.out.print(a+" ");
		b=a;
		for(i=1;i<=9;i++)
		{
			a=(int)(Math.random()*100);	
			System.out.print(a+" ");	
			
			if(a>b)
			{
				count++;
				b=a;
			}
			else
			{
			if(count>max)
				{
					max=count;
					
				}
				b=a;
				count=1;
			}
		}
		
	
		System.out.print("\n"+"longest increasing series is"+max+"\n");
	}
}	