class UseRational1
{
	public static void main(String args[])
	{
		Rational1 r=new Rational1();
		try
		{
			r.set(10,0);			
		}	
		catch(InvalidDenominatorException I1)
		{
			System.out.println(I1.getMessage());	
		}

		r.show();	

	}

}