package studentProblems;


public class Student {
    private String name;
    private String surName;
    private int birthDate;
    private char gender;
    private double mark;

    public Student(String name, String surName, int birthDate, char gender, double mark) {
        this.name = name;
        this.surName = surName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

}
