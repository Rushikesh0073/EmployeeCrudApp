/*package com.DAO;



import com.Bean1.EmployeeInfo;
import com.Bean1.MovieInfo;

import java.util.Scanner;

public class MovieImplementation implements MovieDetails{

    MovieInfo[] movie=new  MovieInfo[4];
    int count;

    Scanner sc= new Scanner(System.in);

    public MovieImplementation(){
        count=0;
    }

    public void search(int t_id){

    }

    public void insert() {
        System.out.println("Enter the no .of Employee");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("Entre the Emp_id");
            int tid = sc.nextInt();
            System.out.println("Enter the Emp_name");
            String tname = sc.next();
            System.out.println("enter the Salary");
            int trating = sc.nextInt();
            movie[count] = new MovieInfo(tid, tname, trating);
            count++;
        }
    }

    public void update(int empid) {
        System.out.println("entre the Salary");
        int sal = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (movie[i].t_id ==tid && movie[i] != null) {
                movie[i].rating = trating;
            }
        }
    }

    public void delete(int empid) {
        for (int i = 0; i < count; i++) {
            if (movie[i] != null) {
                if (movie[i].t_id == tid) {
                    movie[i] = null;
                }
            }
        }
    }

    public void displayAllEmp() {for (int i = 0; i < count; i++) {
        System.out.println(employee[i]);
    }
    }

}

    public void delete(int t_id) {
        for (int i = 0; i < count; i++) {
            if (movie[i] != null) {
                if (movie[i].t_id() == t_id) {
                    movie[i] = null;
                }
            }
        }
    }

    @Override
    public void displayAllEmp() {

    }

    @Override
    public void displayAll() {
        for(int i = 0; i < count; i++)

            System.out.println(movie[i]);
        }
        }*/




