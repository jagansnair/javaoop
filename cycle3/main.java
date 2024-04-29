import java.util.*;
interface test
{
	 void area();
	 void perimeter();
}
class circle implements test
{
	Scanner obj1=new Scanner(System.in);
	int r;
	public void area()
	{
		System.out.println("enter radius of circle:");
		r=obj1.nextInt();
		double area=3.14*r*r;
		System.out.println("area is:"+area);
		
	}
	public void perimeter()
	{
		double perimeter=2*3.14*r;
		System.out.println("perimeter is:"+perimeter);
	}
	
}
class rectangle implements test
{
	Scanner obj2=new Scanner(System.in);
	int l;
	int b;
	public void area()
	{
		System.out.println("enter length of rectangle:");
		l=obj2.nextInt();
		System.out.println("enter breadth of rectangle:");
		b=obj2.nextInt();
		float area=l*b;
		System.out.println("area is:"+area);
		
	}
	public void perimeter()
	{
		float perimeter=2*(l+b);
		System.out.println("perimeter is:"+perimeter);
	}
}
class main
{
	public static void main(String args[])
	{
		circle cir = new circle();
		rectangle rect = new rectangle();
		Scanner obj=new Scanner(System.in);
		int choice;
		
	do
	{
		System.out.println("enter your choice(1 for circle and 2 for rectangle 3 for exit):");
		choice = obj.nextInt();
		switch(choice)
		{
			case 1: cir.area();
				cir.perimeter();	
				break;
			case 2: rect.area();
				rect.perimeter();
				break;
			case 3: System.exit(0);
				
			default:
				System.out.println("check the choice:");
		}
	}
	while(choice!=3);
	}
}
						
		
		
