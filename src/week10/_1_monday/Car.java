package week10._1_monday;

/*
Warmup task:
    carTask:
       Create a class called Car
          instance variables:
             brand, year, price, color, miles

             add a constructor to set all the fields

          instance methods:
             start(), drive(),toString()

             creat toString method to have the executions

----------
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


public class Car {     // Parent class (Base Page)

        public String brand; // instance variable
        public int year;

        public double price;

        public String color;

        public double miles;



        // Constructor
    public Car(String brand, int year, double price, String color, double miles) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }


    // Method 1
    public void start () {
        System.out.println(brand + " has start option");

    }


    //Method 2
    public void hasDriveOption() {
        System.out.println(brand + " has drive option");
    }


    //toString method (right click + generate + toString
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
}
