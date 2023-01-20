import java.io.*;
public class UseMatrix
{
	public static void main(String args[])
	{
		Console con=System.console();
		//System.out.println("default constructor called");
		Matrix m1=new Matrix();
		try
		{
			m1.set(3,3);

		}
		catch(InvalidSizeException I1)
		{
			System.out.println(I1.getMessage());


		}
		//m1.show();
		//int x,y;
		//System.out.println(" enter the number of rows u want ");
		//x=Integer.parseInt(con.readLine());
		//System.out.println(" enter the number of columns u want ");
		//y=Integer.parseInt(con.readLine());
		//Matrix m2=new Matrix(x,y);
		//System.out.println("parameterized constructor called");
		//Matrix m2=new Matrix(3,3);
		//m2.show();
		//System.out.println("copy constructor called");
		//Matrix m3=new Matrix (m2);
		//m3.show();
	}

}