package com.shrikant;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Shrikant", 100,25);
        //Employee is a constructor which is fetching from class employee
        //constructor is method used to create instance of a class

        System.out.println("Name of employee " + employee.getName());
        System.out.println("Salary " + employee.getSalary());
        System.out.println("Age " + employee.getAge());
        int a=0;
        System.out.println(a);
        EmployeeInfo(employee, a);//calling EmployeeInfo Method
        System.out.println("Name of employee " + employee.getName());
        System.out.println("Salary " + employee.getSalary());
        System.out.println("Age " + employee.getAge());

    }

    static private void EmployeeInfo(Employee employee, int a){
        
        employee.setName("Vikrant");
    }

}
