class DemoObj
{
	private int rollno;
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public int getRollno()
	{
		return rollno;
	}
}
public class DemoOb
{
	public static void main(String args[])
	{
		DemoObj Ob1=new DemoObj();
		Ob1.setRollno(1);
		System.out.println("My First ref is\t"+Ob1.getRollno());
		DemoObj Ob2=Ob1;
		Ob2.setRollno(2);
		System.out.println("My Second ref is\t"+Ob2.getRollno());
		Ob1=new DemoObj();
		Ob1.setRollno(3);
		System.out.println("My Second ref is\t"+Ob1.getRollno());
		
	}
}