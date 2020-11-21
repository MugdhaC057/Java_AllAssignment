class people
{
public void meth(int a)
{
System.out.println(a);
}
}
class student extends people
{
public  void meth(int a,int b)
{
System.out.println(a+" "+b);
}
}
public class Demo
{
public static void main(String args[])
{
student s1=new student();
s1.meth(10);
s1.meth(23,29);
}
}