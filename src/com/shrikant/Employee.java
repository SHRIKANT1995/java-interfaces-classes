package com.shrikant;

public class Employee {

    private String name;
    private double salary; //double is a primitive type
    private int age;


    public Employee() {
        this.setName("Shrikant");
        //or use
        //this.name="Shrikant";

    }//is public is set to private the main class wont have the access to Employee

    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }//this is a parameterized constructor

    public String getName() {
            return name;
        }
        public double getSalary(){
            return salary;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public void setAge(int age) {
            this.age = age;
        }
}


