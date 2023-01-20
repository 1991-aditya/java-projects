class Person
{
	String name;
	String surname;
	
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

class ContactInfo extends Person
	{
		int phone;
		
		public  ContactInfo()
		{
			phone=0;
		}
		
		public  ContactInfo(String s1,String s2,int x)
		{
			super(s1,s2);
			phone=x;
		}
		
		public  ContactInfo(ContactInfo c)
		{
			super(c);
			phone=c.phone;
		}
	}

class Employee extends ContactInfo
	{
		int salary;
		
		public  Employee()
		{
			salary=0;
		}
		
		public  Employee(String s1,String s2,int x,int y)
		{
			super(s1,s2,x);
			salary=y;
		}
		
		public  Employee(Employee e)
		{
			super(e);
			salary=e.salary;
		}
	

		public void show()
		{
			System.out.println(" "+name+" "+surname+" "+" phone number "+phone+" "+" salary "+ salary);

		}

	}

