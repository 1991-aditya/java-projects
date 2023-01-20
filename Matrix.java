import java.io.*;
class InvalidSizeException extends Exception
{
	public InvalidSizeException (String str)
	{
		super(str);
	}
}

public class Matrix 
{
	int r,c;
	private int arr[][]=new int[r][c];
	
	/*public Matrix ()
	{
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				arr[i][j]=0;
			}
		}
	}*/

	public void set (int a,int b) throws InvalidSizeException 
	{
		int i,j;
		if(a>0 && b>0)
		{
			r=a;
			c=b;
		}
		else
		{
			InvalidSizeException I1=new InvalidSizeException("size is invalid");
			throw I1;

		}
		
		System.out.println("enter values for the matrix with rows : "+ r + " and column : "+ c );
		Console con=System.console();
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				arr[i][j]=Integer.parseInt(con.readLine());
			}
		}	
	} 

	/*public Matrix (Matrix m)
	{
		
		int i,j;
		arr=new int[m.arr.length][m.arr[0].length];
		for(i=0;i<m.arr.length;i++)
		{
			for(j=0;j<m.arr[i].length;j++)
			{
				arr[i][j]=m.arr[i][j];
			}
		}

	}*/

	public void show()
	{
		int i,j;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]);
			
			}
				System.out.println();
		}	


	}








}