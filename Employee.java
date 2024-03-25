import java.util.Scanner;

class Employee{
 int eNo;
 String eName="";
 float eSalary;
 
 public void Input(){
 
 Scanner in = new Scanner(System.in);
  System.out.print("Enter the Employee No :");
  eNo = in.nextInt();
  System.out.print("Enter the Employee name :");
  eName = in.next();
  System.out.print("Enter the salary :");
  eSalary = in.nextFloat();
  }
  
  public void display(){
  
  System.out.println("Employee No = " + eNo);
  System.out.println("Employee Name = " + eName);
  System.out.println("Employee Salary = " + eSalary);
  }
  
  public static void main(String[] args) {
  
  System.out.println("Enter the no. of employees:");
  Scanner sc = new Scanner(System.in);   
  int n=sc.nextInt();
  Employee e[] = new Employee[n];
        for (int i = 0; i < n; i++) {
        	e[i] = new Employee();
	e[i].Input();
    }
    
    System.out.println("-------------------------------");
    System.out.println("---- Data Entered as below ----");
    System.out.println("-------------------------------");
  
    for(int i=0; i<n; i++) {
   
   	e[i].display();
    }
System.out.println("Enter  the employee number to search: ");
        int searchENo = sc.nextInt();
        int flag = 0;

        for(Employee employee : e){
            if (employee.eNo == searchENo) {
                System.out.println("Employee details found:");
                employee.display();
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            System.out.println("Employee not found");
    }  
} 
