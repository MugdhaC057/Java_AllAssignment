class A
{
int a=15;
void disp1()
{
System.out.println("in A method"+a);
}
A(int a)
{
this.a=a;
System.out.println("in A constructor"+a);
}
}
class B extends A

{
int b=20;
void disp2()
{
System.out.println("in B method"+b);
}
B(int b)
{
super(10);
this.b=b;
System.out.println("in B constructor"+b);
}

}
class Single
{
public static void main(String args[])
{
	B b=new B(100);
	b.disp1();
	b.disp2();
}
}