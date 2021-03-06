package plane;

public class Plane {
    private String model;
    private String country;
    private int year;
    private int hours;
    private int weight;
    private int wingspan;
    private int topSpeed;
    private int seats;
    private double cost;
    private boolean isMilitary;

    public Plane(String model, String country, int year, int hours, int weight, int wingspan, int topSpeed, int seats, double cost, boolean isMilitary) {
        this.model = model;
        this.country = country;
        this.year = year;
        this.hours = hours;
        this.weight = weight;
        this.wingspan = wingspan;
        this.topSpeed = topSpeed;
        this.seats = seats;
        this.cost = cost;
        this.isMilitary = isMilitary;
    }

    public Plane() {
    }

    public String toString(){
        return this.model + ", " + this.country + ", " + this.year + ", " + this.hours + ", " + this.weight + ", " + this.wingspan
                + ", " + this.topSpeed + ", " + this.seats + ", " + this.cost + ", " +this.isMilitary;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1903 && year <= 2020){
            this.year = year;
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 10000){
            this.hours = hours;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 1000 && weight <= 160000){
            this.weight = weight;
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan >= 10 && wingspan <= 45){
            this.wingspan = wingspan;
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed >= 0 && topSpeed <= 1000)
        this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats >= 0){
            this.seats = seats;
        }
        else {
            System.out.println("Count of seats can't be negative");
        }
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {

        if (cost >= 0){
            this.cost = cost;
        }
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }



}
