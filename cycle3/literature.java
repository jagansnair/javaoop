import java.util.*;
class publisher
{
	String pub_name;
}
class book extends publisher
{
	String book_name;
	String author;
	float price;
}
class fiction extends book
{
	Scanner obj1=new Scanner(System.in);
	
	void read1()
	{
		System.out.println("enter fiction book details:");
		System.out.println("enter the book name:");
		book_name= obj1.next();
		System.out.println("enter the publisher name:");
		pub_name= obj1.next();
		System.out.println("enter the author:");
		author= obj1.next();
		System.out.println("enter the price:");
		price= obj1.nextFloat();
			
	}
	void display1()
	{
		System.out.println("fiction book details :");
		System.out.println("book name is:"+book_name);
		System.out.println("publisher name is:"+pub_name);
		System.out.println("author is:"+author);
		System.out.println("price is:"+price);
	}
}
class literature extends book
{
	Scanner obj2 = new Scanner(System.in);
	
	void read2()
	{	
		System.out.println("enter LITERATURE book details:");
		System.out.println("enter the book name:");
		book_name= obj2.next();
		System.out.println("enter the publisher name:");
		pub_name=obj2.next();
		System.out.println("enter the author:");
		author= obj2.next();
		System.out.println("enter the price:");
		price= obj2.nextFloat();
			
	}
	void display2()
	{
		System.out.println(" literature book details:");
		System.out.println("book name is:"+book_name);
		System.out.println("publisher name is:"+pub_name);
		System.out.println("author is:"+author);
		System.out.println("price is:"+price);
	}
	public static void main(String args[])
	{
		literature lit = new literature();
		fiction fic = new fiction();
		fic.read1();
		lit.read2();
		fic.display1();
		lit.display2();
	}
}	
