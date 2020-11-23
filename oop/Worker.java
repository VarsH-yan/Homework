package oop;

import java.time.LocalDate;

public class Worker extends Human {
    private int workerId;
    private int salary;
    private int startWorkYear;

    public Worker(LocalDate birthDate, int passportId, int workerId) {
        super(birthDate, passportId);
        this.workerId = workerId;
    }

    public Worker(Human human,  int startWorkYear) {
        super(human.getBirthDate(), human.getPassportId());
        setName(human.getName());
        setSurName(human.getSurName());
        this.startWorkYear = startWorkYear;
    }

    public int getWorkerId() {
        return workerId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return LocalDate.now().getYear() - startWorkYear;
    }

    public void setStartWorkYear(int startWorkYear) {
        this.startWorkYear = startWorkYear;
    }

    public int getStartWorkYear() {
        return startWorkYear;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Worker ID is: " + getWorkerId());
        System.out.println("Salary is: " + getSalary());
        System.out.println("Experience is: " + getExperience());
    }
}
