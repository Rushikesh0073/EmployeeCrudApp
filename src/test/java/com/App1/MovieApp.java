/*package com.App1;


import com.DAO.MovieImplementation;

import java.util.Scanner;

public class MovieApp {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        MovieImplementation m = new MovieImplementation();
        char ch;
        do {
            System.out.println("Enter the choice for movie");
            System.out.println("1.insert\n2.display\n3.update\n4.delete\n5.search");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    m.insert();
                    break;
                case 2:
                    m.displayAllEmp();
                    break;
                case 3:
                    m.update(101);
                    break;
                case 4:
                    m.delete(101);
                    break;
                case 5:
                    m.search(101);
                default:
                    System.out.println("Invalid operation");
            }

            System.out.println("Do you want continue");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');

    }
}*/


