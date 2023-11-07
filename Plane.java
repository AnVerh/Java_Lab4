package Lab4;

public class Plane implements Comparable<Plane>{
    private String name;
    private int passenger_capacity;
    private double max_distance;
    private boolean has_wifi;
    private aircraftType aircraftType;

    public Plane(String name, int passenger_capacity, double max_distance, boolean has_wifi, aircraftType aircraftType){
        this.name = name;
        this.passenger_capacity = passenger_capacity;
        this.max_distance = max_distance;
        this.has_wifi = has_wifi;
        this.aircraftType = aircraftType;
    }
    public int getPassengerCapacity(){return this.passenger_capacity;}
    public double getMaxDistance(){return this.max_distance;}
    public String getHasWifi(){return this.has_wifi ? "Yes" : "No";}
    public aircraftType getAircraftType(){return this.aircraftType;}
    public String getName(){
        return this.name;
    }
    public static void printPlaneCharacteristics(Plane plane) {
        System.out.println("Name: " + plane.name);
        System.out.println("Passenger Capacity: " + plane.passenger_capacity);
        System.out.println("Max Distance: " + plane.max_distance + " miles");
        System.out.println("Has Wi-Fi: " + (plane.has_wifi /*== true*/ ? "Yes" : "No"));
        System.out.println("Aircraft Type: " + plane.aircraftType);
        System.out.println();
    }
    public int compareTo(Plane otherPlane){
       /* int nameCompareResult = getName().compareTo(otherPlane.getName());
        return nameCompareResult != 0 ? nameCompareResult
                : Integer.compare(passenger_capacity, otherPlane.passenger_capacity);*/
        int passengerCapacityCompareResult = Integer.compare(getPassengerCapacity(), otherPlane.getPassengerCapacity());
        return passengerCapacityCompareResult != 0 ? passengerCapacityCompareResult
                : -Double.compare(getMaxDistance(), otherPlane.getMaxDistance()) ;
    }
    @Override
    public String toString() {
        return "Plane(name=\"" + name + "\", " +
                "passenger_capacity=\"" + passenger_capacity + "\", " +
                "max_distance=\"" + max_distance + "\", " +
                "hasWifi=\"" + (has_wifi ? "Yes" : "No") + "\", " +
                "aircraftType=\"" + aircraftType + "\")";
    }
}
enum aircraftType{
    PERSONAL, RENTAL, AMBULANCE, SPORT, COMMERCIAL
}

