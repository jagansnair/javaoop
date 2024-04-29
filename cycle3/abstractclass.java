import java.util.*;
abstract class shape
{
	Scanner obj=new Scanner(System.in);
	public abstract void area();
	
}
class rectangle extends shape
{
	public void area()
	{
		System.out.println("enter length and breadth of rectangle:");
		int l=obj.nextInt();
		int b=obj.nextInt();
		int a=l*b;
		System.out.println("area is:"+a);
	}
}
class circle extends shape
{
	public void area()
	{
		System.out.println("enter radius of circle:");
		double r=obj.nextDouble();
		double a=3.14*r*r;
		System.out.println("area is:"+a);
	}

}
class square extends shape
{
	public void area()
	{
		System.out.println("enter side of square:");
		int s=obj.nextInt();
		int a=s*s;
		System.out.println("area is:"+a);
	}

}
class abstractclass
{
	public static void main(String args[])
	{
		rectangle rect=new rectangle();
		circle cir=new circle();
		square sq=new square();
		rect.area();
		cir.area();
		sq.area();
	}

}
