package week14._04_thursday;

public class Tesla extends Car{
    public Tesla( int year, double price, String color, double miles) {
        super("Tesla", year, price, color, miles);
    }



    public void autoPilot () {
        System.out.println(brand + " has autopilot option");
    }



}
