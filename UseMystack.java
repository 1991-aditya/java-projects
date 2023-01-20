class UseMystack
{
	public static void main(String []args)
	{
		Mystack m= new Mystack();
		
		System.out.println("enter the values ");
		Console con=system.console();
		int x=(Integer.parseInt)con.readline();
		for(int i=0;i<=9;i++)
		{
			int x=(Integer.parseInt)con.readline();
			Integer aObj=new Integer(x);
			m.push(aObj);
		}

		System.out.println("removing the values from stack");
		
			for(int i=0;i<=9;i++)
			{
				System.out.println(m.pop());
			}
		
		
			

		
		
		
	}




}