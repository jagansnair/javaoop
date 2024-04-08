
import java.util.Scanner;
class  employee
{
	int empid;
	String name;
	float salary;
	String address;
	employee(int empid,String name,float salary,String address)
	{
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.address=address;
	}
		
}
class teacher extends employee
{
	Scanner sc =  new Scanner(System.in);
	String department;
	String subject;
	teacher(String department,String subject,int empid,String name,float salary,String address)
	{
		super(empid,name,salary,address);
		this.department=department;
		this.subject=subject;
	}
	public void display()
	{
		System.out.println("employee id is:"+empid);
		System.out.println("name is:"+name);
		System.out.println("salary is:"+salary);
		System.out.println("address is:"+address);
		System.out.println("department is:"+department);
		System.out.println("subject taught is:"+subject);
	}
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println(" enter no of employee:");
		int n = sc.nextInt();
		teacher empobj[] = new teacher[n];
		for (int i=0;i<n;i++)
		{	
			
			System.out.println("enter emp id:");
			int empid = sc.nextInt();
			System.out.println("enter name:");
			String name = sc.next();
			System.out.println("enter salary:");
			float salary = sc.nextFloat();
			System.out.println("enter address :");
			String address = sc.next();
			System.out.println("enter department:");
			String department = sc.next();
			System.out.println("enter subject taught:");
			String subject = sc.next();
			empobj[i]=new teacher(department,subject,empid,name,salary,address);
		}
		System.out.println("the details are:");
		for (int i=0;i<n;i++)
		{
			empobj[i].display();
		}
}
}
	
	
