package week10._4_thursday.example1;

import java.util.ArrayList;

public class Gallery {
    public static void main(String[] args) {
        Tesla tesla=new Tesla("Model 5",3);
        Toyota pirus=new Toyota("Pirus",2.5);
        Bus bus=new Bus("Iveco",5);
        System.out.println(tesla.drive());
        ArrayList<Vehicle> cars=new ArrayList<>();
        cars.add(tesla);
        cars.add(pirus);
        cars.add(bus);
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));

        }
    }
}
