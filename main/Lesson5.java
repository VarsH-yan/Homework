package main;

public class Lesson5 {
    public static void main(String[] args) {
        Employee  employee1 = new Employee();
        Employee  employee2 = new Employee();
        employee1.surName = "Hakobyan";
        employee1.name = "Hakob";
        //employee1.setAge(24);
        //System.out.println(employee1.getAge());
        employee1.setAge(10);
        System.out.println(employee1.getAge());
        employee1.setSalary(190000);
        employee2.surName = "Karapetyan";
        employee2.name = "Ani";
        employee2.setSalary(290000);

        System.out.println("First employee name is: " + employee1.name);
        System.out.println("First employee surname is: " + employee1.surName);
        System.out.println("Second employee: " + employee2.name + " " + employee2.surName);
        System.out.println("Age of second employee is: " + employee2.getAge());
        System.out.println("Sum of employees salary: " + (employee1.getSalary() + employee2.getSalary()));

        System.out.println("Sum of employees salary: " + employee1.sum(200000, 140000));

        employee1.fullNameOfEmployee();
        employee2.fullNameOfEmployee();
    }

}
