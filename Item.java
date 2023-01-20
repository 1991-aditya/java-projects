import java.io.*;
interface Item
{
	void read();
	void show();

}

class Book implements Item
{
	String title,author,publication;
	Console con=System.console();
	
	public void read()
	{
		System.out.println("enter the title of book");
		title=con.readLine();
		System.out.println("enter the name of author of book");
		author=con.readLine();
		System.out.println("enter the name of author of publication");
		publication=con.readLine();
	}

	public void show()
	{
		System.out.println(" title "+title+" author "+author+" publication "+publication);
		
	}


}

class Dvd implements Item
{
	String title,director,category;
	Console con=System.console();
	
	public void read()
	{
		System.out.println("enter the title of movie");
		title=con.readLine();
		System.out.println("enter the name of the director of movie");
		director=con.readLine();
		System.out.println("enter the category of the movie");
		category=con.readLine();
	}
	
	public void show()
	{
		System.out.println(" title "+title+" director "+director+" category "+category);
		
	}


}