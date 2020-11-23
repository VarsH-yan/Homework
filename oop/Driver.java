package oop;

import java.time.LocalDate;

public class Driver extends Worker{
    private int driverLicenceId;
    private Car car;

    public Driver(LocalDate birthDate, int passportId, int workerId, int driverLicenceId) {
        super(birthDate, passportId, workerId);
        this.driverLicenceId = driverLicenceId;
    }

    public Driver(Worker worker, int driverLicenceId) {
        super(worker.getBirthDate(), worker.getPassportId(), worker.getWorkerId());
        setName(worker.getName());
        setSurName(worker.getSurName());
        setSalary(worker.getSalary());
        setStartWorkYear(worker.getStartWorkYear());
        this.driverLicenceId = driverLicenceId;
    }



    public int getDriverLicenceId() {
        return driverLicenceId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Driver licence ID is: " + getDriverLicenceId());
        System.out.println("***driver car info***");
        this.car.printCarInfo();
    }
}
