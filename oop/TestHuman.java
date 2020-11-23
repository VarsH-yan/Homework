package oop;

import java.time.LocalDate;

public class TestHuman {
    public static void main(String[] args){
        Human human = new Human(LocalDate.of(1996, 3, 31), 2254);
        human.setName("Mamikon");
        human.setSurName("Hovhannisyan");
        System.out.println("-------------print human info-------------");
        human.printInfo();

        Worker worker = new Worker(LocalDate.of(2005, 5, 25), 2589, 54);
        worker.setName("Karen");
        worker.setSurName("Abrahamyan");
        worker.setStartWorkYear(2015);
        worker.setSalary(68000);
        System.out.println("-------------print worker info-------------");
        worker.printInfo();

        Car mercedes = new Car();
        mercedes.setCarNumber("35AC518");
        mercedes.setMaxSpeed(240);
        mercedes.setModel("Mercedes Benz");

        Driver driver = new Driver(worker, 854);
        driver.setCar(mercedes);
        System.out.println("-------------print driver info-------------");
        driver.printInfo();


        Student student = new Student(LocalDate.of(1999, 8, 5), 1177, 163);
        student.setName("Mane");
        student.setSurName("Karapetyan");
        student.setCourse((byte) 3);
        System.out.println("-------------print student info-------------");
        student.printInfo();

    }
}
