import java.io.*;
public class Rational
{
	
		private int numerator;
		private int denominator;
		
		public void set(int x,int y)
		{
			numerator=x;
			denominator=y;
		}
	
		public void show()
		{
			System.out.println(numerator+"/"+denominator);
		}
	
}

