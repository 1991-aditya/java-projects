package a.b;
import a.b.c.Person;
public class ContactInfo extends Person
	{
		public int phone;
		
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