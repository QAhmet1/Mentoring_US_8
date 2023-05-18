package week9._4_thursday;

public class EmployeeTest {


    public static void main(String[] args) {

        // This is the area to call methods

        // Can I call insurance method, it has default access modifier ?
        Employee.insurance();   // insurance method has default ac.mod, I can reach default access modifier in the same package


        // Can I call salary method?
        Employee.salary();


        // Can I call the variable experience?
        // I can not call since it is private


        // Can I call gender from employee class?
        System.out.println(Employee.gender);

        // What is the difference between protected and default?
        // Both of them are visible in the same package + protected is visible in the subclass ( ex: subclass in the other package)

    }


}
