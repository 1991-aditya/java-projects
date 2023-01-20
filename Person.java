package a.b.c;
public class Person
{
	public String name;
	public String surname;
	
	public Person()
	{
		name="unknown";
		surname="unknown";
		
	}

	public Person(String s1,String s2)
	{
		name=s1;
		surname=s2;
	
	}

	public Person(Person p)
	{
		name=p.name;
		surname=p.surname;
	}
}