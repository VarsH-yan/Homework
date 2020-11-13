package exam;

import java.util.Scanner;

public class AiroportTest {
    public static void main(String[] args) {
        PlaneService planeService = new PlaneService();

//        AirportTest (score 10)
//        use all the methods from PlaneService using Scanner object.


        Scanner scanner = new Scanner(System.in);
        Plane plane3 = new Plane();
        System.out.println("Insert model:");
        plane3.setModel(scanner.next());
        System.out.println("Insert country:");
        plane3.setCountry(scanner.next());
        System.out.println("Insert year:");
        plane3.setYear(scanner.nextInt());
        System.out.println("Insert hours:");
        plane3.setHours(scanner.nextInt());
        System.out.println("Insert weight:");
        plane3.setWeight(scanner.nextInt());
        System.out.println("Insert wingspan:");
        plane3.setWingspan(scanner.nextInt());
        System.out.println("Insert topSpeed:");
        plane3.setTopSpeed(scanner.nextInt());
        System.out.println("Insert seats:");
        plane3.setSeats(scanner.nextInt());
        System.out.println("Insert cost:");
        plane3.setCost(scanner.nextDouble());
        System.out.println("Insert military: (if military press 'y')" );
        plane3.setMilitary(scanner.next().charAt(0) == 'y' ? true : false);

        Plane plane4 = new Plane();
        System.out.println("Insert model:");
        plane4.setModel(scanner.next());
        System.out.println("Insert country:");
        plane4.setCountry(scanner.next());
        System.out.println("Insert year:");
        plane4.setYear(scanner.nextInt());
        System.out.println("Insert hours:");
        plane4.setHours(scanner.nextInt());
        System.out.println("Insert weight:");
        plane4.setWeight(scanner.nextInt());
        System.out.println("Insert wingspan:");
        plane4.setWingspan(scanner.nextInt());
        System.out.println("Insert topSpeed:");
        plane4.setTopSpeed(scanner.nextInt());
        System.out.println("Insert seats:");
        plane4.setSeats(scanner.nextInt());
        System.out.println("Insert cost:");
        plane4.setCost(scanner.nextDouble());
        System.out.println("Insert military: (if military press 'y')" );
        plane4.setMilitary(scanner.next().charAt(0) == 'y' ? true : false);

        Plane plane5 = new Plane();
        System.out.println("Insert model:");
        plane5.setModel(scanner.next());
        System.out.println("Insert country:");
        plane5.setCountry(scanner.next());
        System.out.println("Insert year:");
        plane5.setYear(scanner.nextInt());
        System.out.println("Insert hours:");
        plane5.setHours(scanner.nextInt());
        System.out.println("Insert weight:");
        plane5.setWeight(scanner.nextInt());
        System.out.println("Insert wingspan:");
        plane5.setWingspan(scanner.nextInt());
        System.out.println("Insert topSpeed:");
        plane5.setTopSpeed(scanner.nextInt());
        System.out.println("Insert seats:");
        plane5.setSeats(scanner.nextInt());
        System.out.println("Insert cost:");
        plane5.setCost(scanner.nextDouble());
        System.out.println("Insert military: (if military press 'y')" );
        plane5.setMilitary(scanner.next().charAt(0) == 'y' ? true : false);

        Plane[] planesArr = {plane3, plane4, plane5};

        planeService.printPlaneInfo(plane3);
        planeService.printCostAndTopSpeedOrModelAndCountry(plane3);
        planeService.printPlaneInfo(planeService.getNewPlaneBetweenTwoPlanes(plane4, plane3));
        System.out.println(planeService.getModelWhichHasBiggerWingspan(plane3, plane4));
        planeService.printAllMilitaryPlanesWhichWereInAirMoreThan100Hours(planesArr);
        planeService.printPlaneInfo(planeService.getPlaneWithMinimalWeight(planesArr));
        planeService.printPlaneInfo(planeService.getPlaneWithMinimalCostFromAllMilitaryPlanes(planesArr));
        planeService.printPlanesInAscendingFormOrderByYear(planesArr);
        planeService.printCountryOfThePlaneWithSmallestSeatsCount(plane3, plane4, plane5);
        planeService.printAllNotMilitaryPlanes(planesArr);


    }
}
