import java.util.*;
class search
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size = s.nextInt();
		int a[] =  new int[size];
		System.out.println("enter the elements of the array:");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("the elements are:");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("enter the element to be searched:");
		int num = s.nextInt();
		int flag=0;
		int pos=0;
		for(int i=0;i<size;i++)
		{
			if(a[i]==num)
			{
				flag=1;
				pos=i+1;
			}
		}
		if(flag==1)
		{
			System.out.println("element found at position:"+pos);
		}
		else
		{
			System.out.println("element not found");
		}
	}
	}
		
		
