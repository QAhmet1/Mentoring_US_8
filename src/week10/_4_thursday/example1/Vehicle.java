package week10._4_thursday.example1;

public class Vehicle {
    private double engine;
    private String model;

    public Vehicle(String model,double engine) {
        this.engine = engine;
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +

                "engine=" + engine +
                ", model='" + model + '\'' +
                " , Class name=" + this.getClass().getSimpleName() +
                '}';
    }
}
