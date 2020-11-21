
public class Array 
{
	public static void main(String args[])
	{
	int i,j,temp,k;
	int arr[]= {5,4,1,3,2};
	for(i=0;i<arr.length;i++)
	{
		for(j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(k=0;k<arr.length;k++)		System.out.print(arr[k]+" ");
	}
}