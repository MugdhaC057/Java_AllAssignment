class A
{
	static int f=5;
	int h=2;
	static void Add()
	{
		System.out.println("Ad");
		System.out.println("in A first static initializer");
	}
}
class B
{
	static int g=10;
	int p=89;
	static void Sub()
	{
		System.out.println("Ac");
		System.out.println("in B second static initializer");
	}
}
class C
{
	static int k=22;
	int q=99;
	static void Mul()
	{
		System.out.println("Ab");
		System.out.println("in C Third static initializer");
	}
}

public class Demo
{
public static void main(String args[])
{
	A Ob1=new A();
	B Ob2=new B();
	C Ob3=new C();
	System.out.println("static is:"+Ob1.f + " "+"non static is:"+Ob1.h);
	System.out.println("static is:"+Ob2.g + " "+"non static is:"+Ob2.p);
	System.out.println("static is:"+Ob3.k + " "+"non static is:"+Ob3.q);
	A.Add();
	B.Sub();
	C.Mul();	
	new A();
	new B();
	new C();
}
}
