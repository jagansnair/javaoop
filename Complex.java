import java.util.Scanner;

class Complex {
    int real, img;

    Complex(int r, int i) {
        real = r;
        img = i;
    }

    void display() {
        System.out.println("---------------------");
        System.out.println(real + " + " + img + "i");
        System.out.println("---------------------");
    }

       public Complex add(Complex other) {
        int realSum = this.real + other.real;
        int imgSum = this.img + other.img;
        return new Complex(realSum, imgSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Enter real part of first complex number:");
        int real1 = scanner.nextInt();
        System.out.println("Enter imaginary part of first complex number:");
        int img1 = scanner.nextInt();
        Complex c1 = new Complex(real1, img1);

        
        System.out.println("Enter real part of second complex number:");
        int real2 = scanner.nextInt();
        System.out.println("Enter imaginary part of second complex number:");
        int img2 = scanner.nextInt();
        Complex c2 = new Complex(real2, img2);

        scanner.close();

      
        System.out.println("First complex number:");
        c1.display();
        System.out.println("Second complex number:");
        c2.display();

       
        Complex result = c1.add(c2);
        System.out.println("Addition of two complex numbers:");
        result.display();
    }
}
