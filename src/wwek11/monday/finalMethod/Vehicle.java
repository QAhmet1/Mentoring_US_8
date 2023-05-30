package wwek11.monday.finalMethod;

public class Vehicle {
    private  String model;
    private String engine;

    public  Vehicle(String model, String engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public final String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
