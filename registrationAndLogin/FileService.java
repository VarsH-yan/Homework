package registrationAndLogin;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileService {
    public String path = "C:\\Users\\User\\Desktop\\Lessons\\Lesson1\\src\\registrationAndLogin\\resources\\usersInformations.txt";

    public List<User> readUsers() {
        String[] strings = null;
        try {
            strings = Files.readAllLines(Paths.get(path)).toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<User> users = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            String[] splittedArr = strings[i].split(", ");
            users.add(new User(splittedArr[0], splittedArr[1], splittedArr[2], splittedArr[3], splittedArr[4]));
        }
        return users;
    }

    public boolean writeUser(User user, boolean isFirst) {
        try {
            FileWriter myWriter = new FileWriter(path, true);
            if(isFirst){
                myWriter.write(user.toString());
            } else {
                myWriter.write("\n" + user.toString());
            }
            myWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();

        }
        return false;
    }
}
