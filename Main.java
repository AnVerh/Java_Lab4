package Lab4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Plane plane1 = new Plane("Personal Plane", 3, 800.0, true, aircraftType.PERSONAL);
        Plane plane2 = new Plane("Rental Plane", 6, 1200.0, true, aircraftType.RENTAL);
        Plane plane3 = new Plane("Ambulance Plane", 3, 1500.0, false, aircraftType.AMBULANCE);
        Plane plane4 = new Plane("Sport Plane", 2, 600.0, false, aircraftType.SPORT);
        Plane plane5 = new Plane("Commercial Plane", 150, 2500.0, true, aircraftType.COMMERCIAL);
        Plane plane6 = new Plane("Another Personal Plane", 3, 1000.0, true, aircraftType.PERSONAL);

        Plane[] planes = {plane1, plane2, plane3, plane4, plane5, plane6};

//        System.out.println(planes[0]);
//        System.out.println(planes[0].compareTo(planes[1]));
        Arrays.sort(planes);

        for(int i=0; i<planes.length;i++){
            System.out.println(planes[i].toString());
        }
    }
}
