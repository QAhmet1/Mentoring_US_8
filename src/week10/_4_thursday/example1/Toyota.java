package week10._4_thursday.example1;

public class Toyota extends Vehicle implements IGas,IElectric,IVehicle{
    public Toyota(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Change battery every 15 years";
    }

    @Override
    public String changeOil() {
        return "Change oil every 10000 km";
    }

    @Override
    public String drive() {
        return "Enjoy your drive";
    }
}
