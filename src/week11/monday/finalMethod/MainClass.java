package week11.monday.finalMethod;

public class MainClass {
    public static void main(String[] args) {
       final Car car=new Car("Toyota","3.0");
      // car=new Car("Toyota","3.0");
       car.setModel("ford");
        System.out.println(car.getModel());
    }
}
