package com.Bean1;

public class EmployeeInfo {
    public int emp_id;
    public String empName;
    public int salary;



    public EmployeeInfo(int emp_id,String empName,int salary )
    {
this.emp_id=emp_id;
this.empName=empName;
        this.salary=salary;
    }

        public String toString()
        {
            return emp_id+" "+empName+" "+salary;
        }
    }


