class Demo
{

	public int display()
	{
	System.out.println("display");
	return 1;
	}
}
public class DemoArr 
{
	public static void main(String args[])
	{
		Demo arr[]= new Demo[4];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new Demo();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].display());
		}
	}
}
