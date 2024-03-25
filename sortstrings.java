import java.util.Scanner;
class sortstrings
{
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		int total;
		String temp;
		System.out.println("enter the total number of strings:");
		total = sc.nextInt();
		String name[] =  new String[10];
		System.out.println("enter the string :");
		for(int i=0;i<=total;i++)
		{
			name[i]=sc.nextLine();
		}
		for(int i=0;i<=total;i++)
		{
			for(int j=i+1;j<=total;j++)
			{
				if(name[i].compareTo(name[j])>0)
				{
					temp=name[i];
					name[i]=name[j];
					name[j]=temp;
				}
			}
		}
	System.out.println("names in sorted order:");
	for(int i=0;i<=total;i++)
	{
		System.out.println(name[i]);
	}
	
	}	
}
