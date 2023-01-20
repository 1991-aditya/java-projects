class InvalidDenominatorException extends Exception
{
	public InvalidDenominatorException (String str)
	{
		super(str);
	}
}

class Rational1 
{
	int p;
	int q;
	
	public void set(int a,int b)throws InvalidDenominatorException 
	{
		if(b!=0)
		{
			p=a;
			q=b;
			
		}
		else
		{
			InvalidDenominatorException I=new InvalidDenominatorException ("denominator can't be zero");	
			throw I;		
		}
	}

	public void show()
	{
		System.out.println(p+"/"+q);

	} 




}