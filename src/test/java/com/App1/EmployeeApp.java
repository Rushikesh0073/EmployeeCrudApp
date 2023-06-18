package com.App1;

import com.DAO.EmpImplementation;

import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        EmpImplementation e= new EmpImplementation();
        char ch;
        do {   System.out.println("Enter the choice for Employee");
            System.out.println("1.insert\n2.display\n3.update\n4.delete\n5.search");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1: e.insert();
                    break;
                case 2:e.displayAllEmp();
                    break;
                case 3:e.update(101);
                    break;
                case 4:
                    e.delete(101);
                    break;
                case 5:e.search(101);
                default:System.out.println("Invalid operation");
            }

            System.out.println("Do you want continue");
            ch=sc.next().charAt(0);
        }while(ch=='y'||ch=='Y');

            }
        }


