package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();
//        Employee employee = new Employee();

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
            employeeList.add(new Employee(id, name, salary));
        }
        System.out.println();
        System.out.print("Enter the employee id that will have salary increase : ");
        int employeeId = sc.nextInt();

        Employee employee = employeeList.stream().
                filter(x -> x.getId() == employeeId).
                findFirst().
                orElse(null);

        if (employee == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            employee.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee employees : employeeList) {
            System.out.println(employees);
        }
        sc.close();
    }

//    public static boolean verifyId (List<Employee> employeeList, int id){
//        Employee employeeVerify = employeeList.stream().
//                filter(hasId -> hasId.getId() == id).
//                findFirst().
//                orElse(null);
//        return employeeVerify != null;
//    }
}