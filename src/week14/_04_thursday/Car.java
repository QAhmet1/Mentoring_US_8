package week14._04_thursday;
/*
Warmup task:
    carTask:
       Create a class called Car
          instance variables:
             brand, year, price, color, miles

             add a constructor to set all the fields

          instance methods:
             start(), drive(),                           toString()

       Create the following sub classes of Car:
          1. Toyota:
                extra methods:
                      reliabile()

          2. BMW:
                extra methods:
                   breaksDown()
                   racing()

          3. Tesla:
                extra methods:
                   autoPilot();
 */




public class Car {        // Base Page / Base Class

    //  brand, year, price, color, miles


    public String brand;            // Global Variables:  outside the method, inside the class
    public int year;
    public double price;
    public String color;
    public double miles;


    public Car(String brand, int year, double price, String color, double miles) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    // acccess modifier + class name


    public void start () {     // This is my first method for base class

        System.out.println(brand + " can start");
    }


    public void drive () {
        System.out.println(brand + " is driveable");
    }    // Second Method

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }


    // AmzonBasePage  -- swithcingToModules












}
