class A
{
public void meth()
{
System.out.println("Parent");
}
}
class C extends A
{
public void meth()
{
super.meth();
System.out.println("Child");
}
}
public class B
{
public static void main(String args[])
{
C s1=new C();
s1.meth();
}
}