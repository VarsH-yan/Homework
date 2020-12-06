package fileServices;

import human.Driver;
import human.Human;
import human.Student;
import human.Worker;
import plane.Plane;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FileService {
    private static String pathPlaneData;
    private static String pathStudentData;
    private static String pathHumanData;
    private static String pathWorkerData;
    private static String pathDriverData;
    private static Student[] allStudents;
    private static Plane[] allPlanes;
    private static Driver[] allDrivers;
    private static Worker[] allWorkers;
    private static Human[] allHumans;


    public static Student[] readStudents() {
        String[] strings = new String[0];
        try {
            strings = Files.readAllLines(Paths.get(pathStudentData)).toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Student[] students = new Student[strings.length];

        for (int i = 0; i < strings.length; i++) {
            String[] splittedArr = strings[i].split(", ");
            students[i] = new Student(Integer.parseInt(splittedArr[0]), splittedArr[1], splittedArr[2], Integer.parseInt(splittedArr[3]), splittedArr[4].charAt(0), Double.valueOf(splittedArr[5]));
        }
        return students;
    }

    public static boolean writeStudent(Student student) {
        try {
            FileWriter myWriter = new FileWriter(pathStudentData, true);
            if (allStudents.length == 0) {
                myWriter.write(student.toString());
            } else {
                myWriter.write("\n" + student.toString());
            }
            myWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();

        }
        return false;
    }

    public static boolean updateStudents(Student[] students) {
        try {
            FileWriter myWriter = new FileWriter(pathStudentData, false);
            myWriter.write(toStringStudents(students));
            myWriter.close();
            return true;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static String toStringStudents(Student[] allStudents) {
        String result = "";
        for (Student student : allStudents) {
            result += student.toString() + "\n";
        }
        result = result.substring(0, result.length() - 1);
        return result;
    }

    public static boolean updateHumans(Human[] humans) {
        try {
            FileWriter myWriter = new FileWriter(pathHumanData, false);
            myWriter.write(toStringHumans(humans));
            myWriter.close();
            return true;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void updateHumanData() {
        allHumans = readHumans();
    }

    public static String toStringHumans(Human[] allHumans) {
        String result = "";
        for (Human human : allHumans) {
            result += human.toString() + "\n";
        }
        if (result.length() > 0) {
            result = result.substring(0, result.length() - 1);
        }
        return result;
    }

    public static boolean updateWorkers(Worker[] workers) {
        try {
            FileWriter myWriter = new FileWriter(pathWorkerData, false);
            myWriter.write(toStringHumans(workers));
            myWriter.close();
            return true;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean updateDrivers(Driver[] drivers) {
        try {
            FileWriter myWriter = new FileWriter(pathDriverData, false);
            myWriter.write(toStringHumans(drivers));
            myWriter.close();
            return true;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static Plane[] readPlanes() {
        String[] strings = new String[0];
        try {
            strings = Files.readAllLines(Paths.get(pathPlaneData)).toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Plane[] planes = new Plane[strings.length];

        for (int i = 0; i < strings.length; i++) {
            String[] splittedArr = strings[i].split(", ");
            planes[i] = new Plane(splittedArr[0], splittedArr[1], Integer.parseInt(splittedArr[2]), Integer.parseInt(splittedArr[3]),
                    Integer.parseInt(splittedArr[4]), Integer.parseInt(splittedArr[5]), Integer.parseInt(splittedArr[6]),
                    Integer.parseInt(splittedArr[7]), Double.parseDouble(splittedArr[8]), Boolean.parseBoolean(splittedArr[9]));
        }
        return planes;
    }

    public static boolean writePlane(Plane plane, Plane[] planes) {
        try {
            FileWriter myWriter = new FileWriter(pathPlaneData, true);
            if (planes.length == 0) {
                myWriter.write(plane.toString());
            } else {
                myWriter.write("\n" + plane.toString());
            }
            myWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();

        }
        return false;
    }

    public static boolean updatePlanes(Plane[] planes) {
        try {
            FileWriter myWriter = new FileWriter(pathPlaneData, false);
            myWriter.write(toStringPlanes(planes));
            myWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();

        }
        return false;
    }

    public static String toStringPlanes(Plane[] allPlanes) {
        String result = "";
        for (Plane plane : allPlanes) {
            result += plane.toString() + "\n";
        }
        result = result.substring(0, result.length() - 1);
        return result;
    }

    public static Worker[] readWorkers() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String[] strings = new String[0];
        try {
            strings = Files.readAllLines(Paths.get(pathWorkerData)).toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Worker[] workers = new Worker[strings.length];

        for (int i = 0; i < strings.length; i++) {
            String[] splittedArr = strings[i].split(", ");
            workers[i] = new Worker(Integer.parseInt(splittedArr[0]), splittedArr[1], splittedArr[2], LocalDate.parse(splittedArr[3], formatter), Integer.parseInt(splittedArr[4]),
                    Integer.parseInt(splittedArr[5]), Integer.parseInt(splittedArr[6]));
        }
        return workers;
    }

    public static boolean writeWorker(Worker worker) {
        try {
            FileWriter myWriter = new FileWriter(pathWorkerData, true);
            if (allWorkers.length == 0) {
                myWriter.write(worker.toString());
            } else {
                myWriter.write("\n" + worker.toString());
            }
            myWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();

        }
        return false;
    }



    public static Human[] readHumans() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String[] strings = new String[0];
        try {
            strings = Files.readAllLines(Paths.get(pathHumanData)).toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Human[] humans = new Human[strings.length];

        for (int i = 0; i < strings.length; i++) {
            String[] splittedArr = strings[i].split(", ");
            humans[i] = new Human(Integer.parseInt(splittedArr[0]), splittedArr[1], splittedArr[2], LocalDate.parse(splittedArr[3], formatter));
        }
        return humans;
    }

    public static Human[] getHumansAndWorkersAndDrivers(){
        Human[] humans = new Human[getAllHumans().length + getAllWorkers().length + getAllDrivers().length];
        int index = 0;
        for (Human human : getAllHumans()) {
            humans[index++] = human;
        }
        for (Human human : getAllWorkers()) {
            humans[index++] = human;
        }
        for (Human human : getAllDrivers()) {
            humans[index++] = human;
        }
        return humans;
    }

    public static Worker[] getWorkersAndDrivers(){
        Worker[] workers = new Worker[getAllWorkers().length + getAllDrivers().length];
        int index = 0;
        for (Worker worker : getAllWorkers()) {
            workers[index++] = worker;
        }
        for (Worker worker : getAllDrivers()) {
            workers[index++] = worker;
        }
        return workers;
    }

    public static boolean writeHuman(Human human) {
        try {
            FileWriter myWriter = new FileWriter(pathHumanData, true);
            if (allHumans.length == 0) {
                myWriter.write(human.toString());
            } else {
                myWriter.write("\n" + human.toString());
            }
            myWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();

        }
        return false;
    }

    public static void updateStudentData() {
        allStudents = readStudents();
    }

    public static void addStudent(Student student) {
        Student[] newAllStudents = new Student[allStudents.length + 1];
        for (int i = 0; i < allStudents.length; i++) {
            newAllStudents[i] = allStudents[i];
        }
        newAllStudents[newAllStudents.length - 1] = student;
        allStudents = newAllStudents;
    }

    public static void updatePlaneData() {
        allPlanes = readPlanes();
    }

    // Driver
    public static Driver[] readAllDrivers() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String[] strings = new String[0];
        try {
            strings = Files.readAllLines(Paths.get(pathDriverData)).toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Driver[] drivers = new Driver[strings.length];

        for (int i = 0; i < strings.length; i++) {
            String[] splittedArr = strings[i].split(", ");
            drivers[i] = new Driver(Integer.parseInt(splittedArr[0]), splittedArr[1], splittedArr[2], LocalDate.parse(splittedArr[3], formatter), Integer.parseInt(splittedArr[4]),
                    Integer.parseInt(splittedArr[5]), Integer.parseInt(splittedArr[6]), Integer.parseInt(splittedArr[7]),
                    splittedArr[8], splittedArr[9]);
        }
        return drivers;
    }

    public static boolean writeDriver(Driver driver) {
        try {
            FileWriter myWriter = new FileWriter(pathDriverData, true);
            if (allDrivers.length == 0) {
                myWriter.write(driver.toString());
            } else {
                myWriter.write("\n" + driver.toString());
            }
            myWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();

        }
        return false;
    }

    public static void updateDriverData() {
        allDrivers = readAllDrivers();
    }

    public static void addDriver(Driver driver) {
        Driver[] newAllDrivers = new Driver[allDrivers.length + 1];
        for (int i = 0; i < allDrivers.length; i++) {
            newAllDrivers[i] = allDrivers[i];
        }
        newAllDrivers[newAllDrivers.length - 1] = driver;
        allDrivers = newAllDrivers;
    }

    public static void updateWorkerData() {
        allWorkers = readWorkers();
    }

    public static void addHuman(Human human) {
        Human[] newAllHumans = new Human[allHumans.length + 1];
        for (int i = 0; i < allHumans.length; i++) {
            newAllHumans[i] = allHumans[i];
        }
        newAllHumans[newAllHumans.length - 1] = human;
        allHumans = newAllHumans;
    }

    public static void addPlane(Plane plane) {
        Plane[] newAllPlanes = new Plane[allPlanes.length + 1];
        for (int i = 0; i < allPlanes.length; i++) {
            newAllPlanes[i] = allPlanes[i];
        }
        newAllPlanes[newAllPlanes.length - 1] = plane;
        allPlanes = newAllPlanes;
    }

    public static void addWorker(Worker worker) {
        Worker[] newAllWorkers = new Worker[allWorkers.length + 1];
        for (int i = 0; i < allWorkers.length; i++) {
            newAllWorkers[i] = allWorkers[i];
        }
        newAllWorkers[newAllWorkers.length - 1] = worker;
        allWorkers = newAllWorkers;
    }

    //getters and setters

    public static Student[] getAllStudents() {
        return allStudents;
    }

    public static void setAllStudents(Student[] allStudents) {
        FileService.allStudents = allStudents;
    }

    public static Plane[] getAllPlanes() {
        return allPlanes;
    }

    public static void setAllPlanes(Plane[] allPlanes) {
        FileService.allPlanes = allPlanes;
    }

    public static Driver[] getAllDrivers() {
        return allDrivers;
    }

    public static void setAllDrivers(Driver[] allDrivers) {
        FileService.allDrivers = allDrivers;
    }

    public static Worker[] getAllWorkers() {
        return allWorkers;
    }

    public static void setAllWorkers(Worker[] allWorkers) {
        FileService.allWorkers = allWorkers;
    }

    public static Human[] getAllHumans() {
        return allHumans;
    }

    public static void setAllHumans(Human[] allHumans) {
        FileService.allHumans = allHumans;
    }

    public static void setPathWorkerData(String pathWorkerData) {
        FileService.pathWorkerData = pathWorkerData;
    }

    public static void setPathDriverData(String pathDriverData) {
        FileService.pathDriverData = pathDriverData;
    }

    public static void setPathPlaneData(String pathPlaneData) {
        FileService.pathPlaneData = pathPlaneData;
    }

    public static void setPathStudentData(String pathStudentData) {
        FileService.pathStudentData = pathStudentData;
    }

    public static void setPathHumanData(String pathHumanData) {
        FileService.pathHumanData = pathHumanData;
    }
}
