package week10._4_thursday.example1;

public class Bus extends Vehicle implements IDeisel,IVehicle{
    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDeisel() {
        return "Change deisel";
    }


    @Override
    public String drive() {
        return "Go Go";
    }
}
