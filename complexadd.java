import java.util.Scanner;

class ComplexNumber{
	double real;
	double imaginary;

	public ComplexNumber(double real,double imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public ComplexNumber add(ComplexNumber other){
		double NewReal = this.real + other.real;
		double NewImaginary = this.imaginary + other.imaginary;
		return new ComplexNumber(NewReal, NewImaginary);
	}
	public String toString(){
		if(imaginary < 0){
			return real + " - " + (-imaginary) + "i";		
		}
		else{
			return real + " + " + (imaginary) + "i";
		}
	}
}

public class complexadd{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the real and imaginary part of the first complex number:");
		double real1 = scanner.nextDouble();
		double imaginary1 = scanner.nextDouble();
		System.out.println("Enter the real and imaginary part of the second complex number:");
		double real2 = scanner.nextDouble();
		double imaginary2 = scanner.nextDouble();
		
		ComplexNumber num1 = new ComplexNumber(real1, imaginary1);
		ComplexNumber num2 = new ComplexNumber(real2, imaginary2);
		ComplexNumber sum = num1.add(num2);
		
		System.out.println("The sum of the two complex numbers is: " + sum);

	}
}
