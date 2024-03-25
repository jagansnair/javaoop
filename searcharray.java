import java.util.Scanner;
class searcharray{
int[]a;
int size;
  void ReadArray(){
   
    Scanner s =new Scanner(System.in);
    System.out.println("Enter the size of array:");
    size=s.nextInt();
    a= new int [size];
    System.out.println("Enter the elements:");
    for(int i=0;i<size;i++){
        a[i]=s.nextInt();

    }

  }
  void PrintArray(){
      System.out.println(" Elements are:");
      for(int i=0;i<size;i++){
        System.out.println(a[i]);
      }
  }
  void FindArr(){
    int n;
    int c=0;
    System.out.println(" Enter the  Elements to search:");
    Scanner s =new Scanner(System.in);
    n=s.nextInt();
    for(int i=0;i<size;i++){
        if(a[i]==n){
             c=c+1;
             
    }
    }
    if(c>0){
        System.out.println(" Element is found"); 
            
        }else{
            System.out.println(" Element not found"); 
        }
    
  }
 
public static void main(String args[]){
searcharray obj =new searcharray();
obj.ReadArray();
obj.PrintArray();
obj.FindArr();
    }
}
