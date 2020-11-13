package exam;

public class PlaneService {

//    Task 1. (score 5)
//    Create function:
//    Parameter one Plane
//    Result: print all information of the plane

    public void printPlaneInfo(Plane plane){
        System.out.println("Model is: " + plane.getModel());
        System.out.println("Country is: " + plane.getCountry());
        System.out.println("Year is: " + plane.getYear());
        System.out.println("Hours is: " + plane.getHours());
        System.out.println("Weight is: " + plane.getWeight());
        System.out.println("Wingspan is: " + plane.getWingspan());
        System.out.println("TopSpeed is: " + plane.getTopSpeed());
        System.out.println("Seats is: " + plane.getSeats());
        System.out.println("Cost is: " + plane.getCost());
        System.out.println("Is military: " + (plane.isMilitary() ? "Yes" : "No"));
    }

//    Task 2. (score 5)
//    Create function:
//    Parameter one Plane
//    Result: print cost and topSpeed if the plane is military otherwise print model and country

    public void printCostAndTopSpeedOrModelAndCountry(Plane plane){
        if (plane.isMilitary()){
            System.out.println("Cost is: " + plane.getCost() + ", topSpeed is: " + plane.getTopSpeed());
        }
        else {
            System.out.println("Model is: " + plane.getModel() + ", Country is: " + plane.getCountry());
        }
    }

//    Task 3. (score 7)
//    Create function:
//    Parameter two Planes
//    Result: return the plane which one is newer (if they have the same age return first one).

    public Plane getNewPlaneBetweenTwoPlanes(Plane plane1, Plane plane2){
        if (plane1.getYear() >= plane2.getYear()){
            return plane1;
        }
        else {
            return plane2;
        }
    }

//    Task 4. (score 7)
//    Create function:
//    Parameter two Planes
//    Result: return the model of the plane which has bigger wingspan (if they have the same - return second one).

    public String getModelWhichHasBiggerWingspan(Plane plane1, Plane plane2){
        if (plane1.getWingspan() > plane2.getWingspan()){
            return plane1.getModel();
        }
        else{
            return plane2.getModel();
        }
    }

//    Task 5. (score 7)
//    Create function:
//    Parameter three Planes
//    Result: print country of the plane with smallest seats count (if they have the same - print first).

    public void printCountryOfThePlaneWithSmallestSeatsCount(Plane plane1, Plane plane2, Plane plane3){
        if (plane1.getSeats() <= plane2.getSeats()){
            if (plane1.getSeats() > plane3.getSeats()){
                System.out.println(plane3.getCountry());
            }
            else {
                System.out.println(plane1.getCountry());
            }
        }
        else {
            if (plane2.getSeats() > plane3.getSeats()){
                System.out.println(plane3.getCountry());
            }
            else {
                System.out.println(plane2.getCountry());
            }
        }
    }


//    Task 6. (score 7)
//    Create function:
//    Parameter array of Planes
//    Result: print all not military planes.

        public void printAllNotMilitaryPlanes(Plane[] planes){
            for (Plane element : planes) {
                if (!element.isMilitary()){
                    printPlaneInfo(element);
                }
            }
        }




//    Task 7. (score 10)
//    Create function:
//    Parameter array of Planes
//    Result: print all military planes which were in air more than 100 hours.

    public void printAllMilitaryPlanesWhichWereInAirMoreThan100Hours(Plane[] planes){
        for (Plane element : planes) {
            if (element.isMilitary() && element.getHours() > 100){
                printPlaneInfo(element);
            }
        }
    }


//    Task 8. (score 10)
//    Create function:
//    Parameter array of Planes
//    Result: return the plane with minimal weight (if there are some of them return last one).

    public Plane getPlaneWithMinimalWeight(Plane[] planes){
        Plane minWeightPlane = null;
        for (Plane element : planes) {
            if (minWeightPlane == null){
                minWeightPlane = element;
            }
            else if (element.getWeight() < minWeightPlane.getWeight()){
                minWeightPlane = element;
            }
        }
        return minWeightPlane;
    }


//    Task 9. (score 10)
//    Create function:
//    Parameter array of Planes
//    Result: return the plane with minimal cost from all military planes (if there are some of them return first one).

    public Plane getPlaneWithMinimalCostFromAllMilitaryPlanes(Plane[] planes){

        Plane minCostAndMilitary = null;
        for (Plane element : planes) {
            if (minCostAndMilitary == null){
                minCostAndMilitary = element;
            }
            else if (element.isMilitary() && element.getCost() < minCostAndMilitary.getCost()){
                minCostAndMilitary = element;
            }
        }
        return minCostAndMilitary;
    }

//    Task 10. (score 12)
//    Create function:
//    Parameter array of Planes
//    Result: print planes in ascending form order by year

    public void printPlanesInAscendingFormOrderByYear(Plane[] planes){
        Plane[] planesAscendingFormOrderByYear = planes;
        Plane tempPlane = null;
        for (int i = 0; i < planesAscendingFormOrderByYear.length; i++) {

            for (int j = 0; j < planesAscendingFormOrderByYear.length - 1; j++) {
                if (planesAscendingFormOrderByYear[j].getYear() > planesAscendingFormOrderByYear[j + 1].getYear()){
                    tempPlane = planesAscendingFormOrderByYear[j];
                    planesAscendingFormOrderByYear[j] = planesAscendingFormOrderByYear[j + 1];
                    planesAscendingFormOrderByYear[j + 1] = tempPlane;
                }
            }
        }
        for (Plane element : planesAscendingFormOrderByYear) {
            printPlaneInfo(element);
        }
    }



}
