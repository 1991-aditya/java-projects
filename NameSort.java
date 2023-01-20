public class NameSort
{
	public static void main(String args[])
	{
		int i,j;
		for(i=0;i<args.length-1;i++)
		{
			for(j=0;j<args.length-i-1;j++)
			{
			if(args[j].compareTo(args[j+1])>0)
			{
				String temp;
				temp=args[j];
				args[j]=args[j+1];
				args[j+1]=temp;

			}
			}
			
		}
		for(i=0;i<args.length;i++)
		{
			System.out.print(args[i]);
			System.out.println();

		}

	}

}