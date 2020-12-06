import fileServices.FileService;
import menu.Menu;

public class Main {

    public static void main(String[] args) {
        FileService.setPathPlaneData("./src//resources/PlaneData.txt");
        FileService.setPathStudentData("./src//resources/StudentData.txt");
        FileService.setPathHumanData("./src//resources/HumanData.txt");
        FileService.setPathWorkerData("./src//resources/WorkerData.txt");
        FileService.setPathDriverData("./src//resources/DriverData.txt");

        Menu myMenu = new Menu();
        myMenu.generalMenu();
    }
}
