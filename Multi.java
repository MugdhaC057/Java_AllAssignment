class A
{
int a=10;
A(int a)
{
System.out.println("in constructor"+a);
}
}
class B extends A
{
int b=20;
B(int b)
{
super(30);
System.out.println("in constructor"+b);
}
}
class C extends B
{
int c=20;
C(int c)
{
super(40);
System.out.println("in constructor"+c);
}
}
class Multi
{
public static void main(String args[])
{
	C b=new C(1000);
}
}