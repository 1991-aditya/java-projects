interface A
{
	default void f1()
	{
		System.out.println("first");

	}
}

interface B
{
	default void f1()
	{
		System.out.println("second");

	}
}

class Test implements A,B
{
	public void f1()
	{
		//System.out.println("third");
		A.super.f1();
		B.super.f1();

	} 		
}