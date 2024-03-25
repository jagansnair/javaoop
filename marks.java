import java.util.Scanner;
class marks
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int mark[] = new int[10];
		double total=0;
		for(int i=1;i<=5;i++)
		{
			System.out.println("enter the mark of subject"+i+"(total 5)(out of 100):");
			mark[i] = sc.nextInt();
			total=total+mark[i];
		}
		double percentage = (total/500) *100;
		System.out.println("total mark is:"+total);
		System.out.println("total percentage is:"+percentage);
	}
}			
