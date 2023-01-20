import java.util.*;
import java.io.*;
public class Demo 
{
	private int x;
	private int y;
	private int arr[]=new int[5];	
	
	public Demo()
	{
		x=0;
		y=0;
		arr[0]=10;
		arr[1]=0;
		arr[2]=9;
		arr[3]=0;
		arr[4]=8;
	}
	
		/*System.out.println("initialization block called")*/
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int) (Math.random()*100);	

		}

	}

	public void showdemo()
	{
		int i;
		System.out.println(" x = "+x+" y = "+y);
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");

		}			


	}




}