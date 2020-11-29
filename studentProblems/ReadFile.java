package studentProblems;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {

    public static Student[] read(String path) throws Exception {
        String[] strings = Files.readAllLines(Paths.get(path)).toArray(new String[0]);
        Student[] students = new Student[strings.length];

        for (int i = 0; i < strings.length; i++) {
            String[] splittedArr = strings[i].split(", ");
            students[i] = new Student(splittedArr[0], splittedArr[1], Integer.valueOf(splittedArr[2]), splittedArr[3].charAt(0), Double.valueOf(splittedArr[4]));
        }
        return students;
    }
}
