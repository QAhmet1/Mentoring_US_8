package week9._2_tuesday.example1;

public class HolidayMain {
    public static void main(String[] args) {
        Holiday h1=new Holiday("Independence Day",4,"July");
        Holiday h2=new Holiday("Green Monday","February");
        Holiday h3=new Holiday("Republic day",29,"October");
        Holiday[] holidays={h1,h2,h3};
        h2.print(holidays);
    }
}
