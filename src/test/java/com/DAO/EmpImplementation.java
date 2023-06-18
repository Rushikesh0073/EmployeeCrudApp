package com.DAO;

import com.Bean1.EmployeeInfo;

import java.util.Scanner;

public class EmpImplementation implements EmpDetails {

EmployeeInfo[] employee=new EmployeeInfo[4];
 int count;

 Scanner sc= new Scanner(System.in);

 public EmpImplementation(){
     count=0;
 }

 public void search(int empid){

 }

    public void insert() {
        System.out.println("Enter the no .of Employee");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("Entre the Emp_id");
            int eid = sc.nextInt();
            System.out.println("Enter the Emp_name");
            String ename = sc.next();
            System.out.println("enter the Salary");
            int sal = sc.nextInt();
            employee[count] = new EmployeeInfo(eid, ename, sal);
            count++;
        }
    }

    public void update(int empid) {
        System.out.println("entre the Salary");
        int sal = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (employee[i].emp_id == empid && employee[i] != null) {
                employee[i].salary = sal;
            }
        }
    }

    public void delete(int empid) {
        for (int i = 0; i < count; i++) {
            if (employee[i] != null) {
                if (employee[i].emp_id == empid) {
                    employee[i] = null;
                }
            }
        }
    }

    public void displayAllEmp() {for (int i = 0; i < count; i++) {
        System.out.println(employee[i]);
    }
}

}
