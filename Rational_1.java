package finance;
public class Rational
{
	private int num;
	private int den;
	
	public Rational()
	{
		num=1;
		den=1;
	}
	
	public Rational(int x ,int y)
	{
		num=x;
		den=y;
	}
	
	public Rational (Rational r)
	{
		num=r.num;
		den=r.den;
	}

	public void show()
	{
		System.out.println(num+"/"+den);

	}
	
	public void set(int x,int y)
	{
		num=x;
		den=y;
	}

	public Rational add(Rational r)
	{
		Rational temp=new Rational();
		temp.num=num*r.den+den*r.num;
		temp.den=den*r.den;
		return temp;

	} 
	
	public Rational less(Rational r)
	{
		Rational temp=new Rational();
		temp.num=num*r.den-den*r.num;
		temp.den=den*r.den;
		return temp;

	} 
	
	public Rational multiply(Rational r)
	{
		Rational temp=new Rational();
		temp.num=num*r.num;
		temp.den=den*r.den;
		return temp;

	} 

	public Rational divide(Rational r)
	{
		Rational temp=new Rational();
		temp.num=num*r.den;
		temp.den=den*r.num;
		return temp;

	} 



}