package registrationAndLogin;

import registrationAndLogin.Exceptions.UserNotFoundException;
import registrationAndLogin.validators.EmailValidator;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegistrationAndLogin {

    private MessageDigest messageDigest;
    private List<User> users;
    private FileService fileService;
    private Scanner myScanner;

    public RegistrationAndLogin() {
        try {
            this.messageDigest = MessageDigest.getInstance("MD5");
            fileService = new FileService();
            users = fileService.readUsers();
            myScanner = new Scanner(System.in);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    private boolean handleRegistration() {
        System.out.println("Enter name");
        String name = myScanner.nextLine();

        System.out.println("Enter surname");
        String surname = myScanner.nextLine();

        System.out.println("Enter username (Username should be contain more than 10 character and should not be duplicate).");
        String username = myScanner.nextLine();
        if (username.length() <= 10) {
            System.out.println("Invalid username format. Username should be contain more than 10 character.");
            return false;
        } else if (isExistUser(username)) {
            System.out.println("There is already exist user with that username.");
            return false;
        }

        System.out.println("Enter valid email");
        String email = myScanner.nextLine();
        if (!EmailValidator.validate(email)) {
            System.out.println("Invalid email format");
            return false;
        }

        System.out.println("Enter password (password should contain more than 2 uppercase letters and more than 3 numbers and length  more than 8).");
        String password = myScanner.nextLine();
        String passwordPattern = "^(?=.{9,}$)(?=(?:.*[A-Z]){2,})(?=(?:.*[0-9]){3,}).*";
        Pattern passwordCompiledPattern = Pattern.compile(passwordPattern);
        Matcher matcher = passwordCompiledPattern.matcher(password);
        if (!matcher.find()) {
            System.out.println("Invalid password format. Password should contain more than 2 uppercase letters and more than 3 numbers and length  more than 8.");
            return false;
        }
        String md5Password = getMD5String(password);
        return register(name, surname, username, email, md5Password);
    }

    private boolean register(String name, String surname, String username, String email, String md5Password) {
        User newUser = new User(name, surname, username, email, md5Password);
        if (fileService.writeUser(newUser, users.isEmpty())) {
            users.add(newUser);
            return true;
        }
        return false;
    }

    private String getMD5String(String string) {
        messageDigest.update(string.getBytes());
        byte[] digest = messageDigest.digest();
        String md5String = new String(digest);
        return md5String;
    }

    private boolean isExistUser(String username) {
        if (getUserByUsername(username) == null) {
            return false;
        }
        return true;
    }

    private void handleLogin() {
        System.out.println("Enter username");
        String username = myScanner.nextLine();
        System.out.println("Enter password");
        String password = myScanner.nextLine();
        try {
            login(username, password);
            System.out.println("You successfully logged!!");
        } catch (UserNotFoundException userNotFoundException){
            System.out.println("Incorrect username or password.");
        }
    }

    private void login(String username, String password) throws UserNotFoundException{
        if (isExistUser(username)) {
            String md5Password = getMD5String(password);
            if (md5Password.equals(getUserByUsername(username).getPassword())) {
               // get user page
                return;
            }
        }
        throw new UserNotFoundException();
    }

    private User getUserByUsername(String username) {
        for (User currentUser : users) {
            if (username.equals(currentUser.getUsername())) {
                return currentUser;
            }
        }

        return null;
    }

    public void registrationAndLoginMenu() {
        boolean isExit = false;
        while (!isExit) {
            System.out.println("\nInsert 1/registration/r for registration");
            System.out.println("Insert 2/login/l for login");
            System.out.println("Insert 3/exit/e for exit");
            String command = myScanner.nextLine();
            switch (command) {
                case "1":
                case "registration":
                case "r":
                    handleRegistration();
                    break;
                case "2":
                case "login":
                case "l":
                    handleLogin();
                    break;
                case "3":
                case "exit":
                case "e":
                    isExit = true;
                    break;
                default:
                    System.out.println("This command is not found. Try again!.");
            }
        }
    }

}


