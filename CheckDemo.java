class Check
{
public int a=10;
protected int b=20;
int c=30;
private int d=40;

public void disp()
{
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
}
}

class CheckDemo
{
public static void main(String args[])
{
 Check s1=new Check();
	s1.disp();
System.out.println(s1.a);
System.out.println(s1.b);
System.out.println(s1.c);
//System.out.println(s1.d);//it will not accessed from another class

}
}