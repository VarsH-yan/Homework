package oop;

import java.time.LocalDate;

public class Student extends Human{
    private int studentId;
    private byte course;

    public Student(LocalDate birthDate, int passportId, int studentId) {
        super(birthDate, passportId);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public byte getCourse() {
        return course;
    }

    public void setCourse(byte course) {
        this.course = course;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Student ID is: " + getStudentId());
        System.out.println("Course is: " + getCourse());
    }
}
