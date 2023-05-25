package week10._4_thursday.example1;

public class Tesla extends Vehicle implements IElectric,IVehicle{
    public Tesla(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Change battery every 10 years";
    }

    @Override
    public String drive() {
        return "enjoy your drive";
    }
}
