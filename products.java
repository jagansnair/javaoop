import java.util.Scanner;

class Product {
    String pcode, pname;
    float price;
    Scanner sc = new Scanner(System.in);

 
    Product() {
        System.out.println("Enter Product Code:");
        pcode = sc.next();
        System.out.println("Enter Product Name:");
        pname = sc.next();
        System.out.println("Enter Product Price:");
        price = sc.nextFloat();
    }

   
    void display() {
        System.out.println("\nProduct details:");
        System.out.println("Product Code: " + pcode);
        System.out.println("Product Name: " + pname);
        System.out.println("Product Price: " + price);
    }

    
    float getPrice() {
        return price;
    }
}

public class products {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

       
        Product lowestPriceProduct = p1;

        if (p2.getPrice() < lowestPriceProduct.getPrice()) {
            lowestPriceProduct = p2;
        }

        if (p3.getPrice() < lowestPriceProduct.getPrice()) {
            lowestPriceProduct = p3;
        }

      
        System.out.println("\nProduct with the lowest price:");
        lowestPriceProduct.display();
    }
}
