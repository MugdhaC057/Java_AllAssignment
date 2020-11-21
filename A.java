class B
{
static int a=10;
int b=20;
 static void disp() 
	{
		System.out.println("static variable"+a);
		//System.out.println("non static variable"+b);
	}
	void disp1()
	{
		System.out.println("static variable"+a);
		System.out.println("non static variable"+b);
	}
}
public class A
{
public static void main(String args[])
	{ 
	B a=new B();
	a.disp();
	a.disp1();
	}
}
