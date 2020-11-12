package main;

public class Employee {
    public String name;
    public String surName;
    private int age = 28;
    private int salary;



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18){
            this.age = age;
        }

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary >= 68000){
            this.salary = salary;
        }

    }

    public int sum(int num1, int num2){
        return num1 + num2;
    }

    public void fullNameOfEmployee(){
        System.out.println(name + " " + surName);
    }
}
