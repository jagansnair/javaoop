import java.util.Scanner;

public class ePerson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Teacher[] obj = new Teacher[2];

        for (int i = 0; i < obj.length; i++) {
            System.out.println("Enter details for Teacher " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Gender: ");
            String gender = input.nextLine();
            System.out.print("Address: ");
            String address = input.nextLine();
            System.out.print("Age: ");
            int age = input.nextInt();
            input.nextLine(); // Consume newline
            System.out.print("Employee ID: ");
            int empId = input.nextInt();
            input.nextLine(); // Consume newline
            System.out.print("Salary: ");
            int salary = input.nextInt();
            input.nextLine(); // Consume newline
            System.out.print("Company Name: ");
            String companyName = input.nextLine();
            System.out.print("Qualification: ");
            String qualification = input.nextLine();
            System.out.print("Teacher ID: ");
            int teacherId = input.nextInt();
            input.nextLine(); // Consume newline
            System.out.print("Department: ");
            String department = input.nextLine();
            System.out.print("Subject: ");
            String subject = input.nextLine();

            obj[i] = new Teacher(name, gender, address, age, empId, salary, companyName, qualification, teacherId, department, subject);
        }

        for (Teacher teacher : obj) {
            System.out.println("..........................................");
            teacher.display();
        }

        input.close();
    }
}

class Person {
    String Name, Gender, Address;
    int age;

    Person(String n, String g, String A, int Age) {
        this.Name = n;
        this.Gender = g;
        this.Address = A;
        this.age = Age;
    }

    void display() {
        System.out.println("Name   : " + this.Name);
        System.out.println("Gender    : " + this.Gender);
        System.out.println("Address : " + this.Address);
        System.out.println("age  : " + this.age);
    }
}

class Employee extends Person {
    int Empid, salary;
    String company_Name, Qualification;

    Employee(String n, String g, String A, int Age, int id, int sal, String c_name, String Qual) {
        super(n, g, A, Age);
        this.Empid = id;
        this.salary = sal;
        this.company_Name = c_name;
        this.Qualification = Qual;
    }

    void display() {
        super.display();
        System.out.println("EmpID   : " + this.Empid);
        System.out.println("Company Name    : " + this.company_Name);
        System.out.println("Qualification : " + this.Qualification);
        System.out.println("Salary  : " + this.salary);
    }
}

class Teacher extends Employee {
    String Department, Subject;
    int Teacher_id;

    Teacher(String n, String g, String A, int Age, int id, int sal, String c_name, String Qual, int t_id, String dep, String sub) {
        super(n, g, A, Age, id, sal, c_name, Qual);
        this.Department = dep;
        this.Teacher_id = t_id;
        this.Subject = sub;
    }

    void display() {
        super.display();
        System.out.println("Dept Name : " + this.Department);
        System.out.println("Subject Name : " + this.Subject);
    }
}

