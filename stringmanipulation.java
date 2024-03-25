import java.util.*;
class stringmanipulation
{
	public static void main(String args[])
	{
		Scanner obj1 = new Scanner(System.in);
		System.out.println("enter string 1:");
		String stringone = obj1.nextLine();
		Scanner obj2 =  new Scanner(System.in);
		System.out.println("enter string 2:");
		String stringtwo = obj2.nextLine();
		System.out.println("Concatenation:"+stringone.concat(stringtwo));
		System.out.println("Length of string 1 is:"+stringone.length());
		System.out.println("Uppercase:"+stringone.toUpperCase());
		System.out.println("Replacing o with i:"+stringone.replace('o','i'));
		System.out.println("Index of lo in string:"+stringone.indexOf("lo"));
		char chararray[] = stringone.toCharArray();
		System.out.println("String buffer class:");
		StringBuffer str =  new StringBuffer("hello");
		StringBuffer temp1 =  new StringBuffer("hai");
		StringBuffer str1 = new StringBuffer("goodmorning");
		StringBuffer temp2= new StringBuffer("goodnight");
		System.out.println("Appending:"+str.append(temp1));
		System.out.println("Length of str1:"+str1.length());
		System.out.println("Insert operation:"+str.insert(3,temp2));

	}
}
		
