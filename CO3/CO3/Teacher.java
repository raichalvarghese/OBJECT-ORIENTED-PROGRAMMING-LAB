import java.util.*;
class Employee{
    int Empid;
    String Name;
    double Salary;
    String Address;
    Employee(int Eid,String Nm,double Sy,String Add){
        this.Empid = Eid;
        this.Name = Nm;
        this.Salary = Sy;
        this.Address = Add;
    }
}
public class Teacher extends Employee{
        String dept;
        String subj;
    Teacher(int Eid,String Nm,double Sy,String Add,String dept,String subj){
        super(Eid,Nm,Sy,Add);
    }
    void display(){
        System.out.println("EmpId"+ Empid);
        System.out.println("Name"+ Name);
        System.out.println("Salary"+ Salary);
        System.out.println("Address"+ Address);
        System.out.println("Department"+ dept);
        System.out.println("Subject"+ subj);
    }
    public static void main(String args[]){
        int n,i;
        System.out.println("Enter the Number of Employee:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Teacher arr[]= new Teacher[n];
        int id;
        double salary;
        String name,add,dept,subj;
        for(i = 0;i<n;i++){
            System.out.println("Enter the Empid");
            id = sc.nextInt();
            System.out.println("Enter the EmpName");
            name = sc.next();
            System.out.println("Enter the EmpSalary");
            salary = sc.nextDouble();
            System.out.println("Enter the EmpAdd");
            add = sc.next();
            System.out.println("Enter the Department");
            dept = sc.next();
            System.out.println("Enter the Subject");
            subj = sc.next();
            arr[i] = new Teacher(id,name,salary,add,dept,subj);
        }
        for(i = 0;i<n;i++){
            arr[i].display();
        }  
    }
}