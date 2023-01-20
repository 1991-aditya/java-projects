import java.io.*;
public class UseRational
{
	public static void main(String args[])
	{
		
		Rational r1=new Rational();
		Console con=System.console();
		int x,y;
		System.out.println("enter values of numerator and denominator");
		x=Integer.parseInt(con.readLine());
		y=Integer.parseInt(con.readLine());
		r1.set(x,y);
		System.out.println("entered fraction is : ");
		r1.show();
		Rational r2=new Rational();
		System.out.println("enter values of numerator and denominator");
		x=Integer.parseInt(con.readLine());
		y=Integer.parseInt(con.readLine());
		r2.set(x,y);
		System.out.println("entered fraction is : ");
		r2.show();
	}

}