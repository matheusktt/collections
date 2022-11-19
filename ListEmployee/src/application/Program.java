package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees will be registered ? ");
        int employeeNumbers = sc.nextInt();
        for (int i = 0; i < employeeNumbers; i++){
            System.out.println("Employee # " + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: $");
            double salary = sc.nextDouble();
        }

        System.out.println("Enter the employee id that will have salary increase : ");
        System.out.println("Enter the percentage: ");

        sc.close();
    }
}