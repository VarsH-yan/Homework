package studentProblems;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){

        StudentService studentServiceObj = new StudentService();
        Student[] studentsArr = null;
        String path = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert file path");
        path = scanner.nextLine();
        try {
            studentsArr = ReadFile.read(path);
        } catch (Exception e) {
            System.out.println("file not found");
        }

        System.out.println("\n********* Task 1: Print full names of students **********\n");
        studentServiceObj.printStudentsFullName(studentsArr);

        System.out.println("\n********* Task 2: Print all male students **********");
        studentServiceObj.printAllMaleStudents(studentsArr);

        System.out.println("********* Task 3: Print all female students who has mark greater then 50.4 **********");
        studentServiceObj.printAllFemaleStudentsWhoHasMarkGreaterThenFiftyPointFour(studentsArr);

        System.out.println("********* Task 4: Print student information having the minimal mark **********");
        studentServiceObj.printStudentInformationHavingTheMinimalMark(studentsArr);

        System.out.println("********* Task 5: Print biggest male student information **********");
        studentServiceObj.printBiggestMaleStudentInformation(studentsArr);

        System.out.println("********* Task 6: Print students sorted by mark **********");
        studentServiceObj.printStudentsSortedByMark(studentsArr);

        System.out.println("********* Task 7: Print female students sorted by year **********");
        studentServiceObj.printFemaleStudentsSortedByYear(studentsArr);
    }
}
