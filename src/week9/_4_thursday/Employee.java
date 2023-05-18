package week9._4_thursday;
/*
Create a class named: Employee which has variables; name, age, gender, experience
  1) Access Modifiers For variables;  name : public, age: default, gender: protected, experience : private
     All the specifiers must be static

  2) Create a method named :salary, method gives the total salary of employee
      Method must be public + static + void

   3) Create a method which gives the insurance cost of employee
      Method must be (default) + static  + void

    4) Call the methods and variables in the same class
5) Create a class named “EmployeeTest” in the same package. Try to call the same variables and methods in this class

 */
public class Employee {



    public static String name = "John"; // This is a variable which has public access modifier + static specifier + Data tyep is String

    static int age = 23; // This is a variable ac.modi: default, specifier:static, data type: is integer

    protected static  char gender = 'M' ; // ac.mod = protected + specifier = static + datatype = char             'M' or 'F'

    private static int experience = 5; // private ac.mod, static specifier, int data type




    public static void salary () {
        System.out.println("Total salary: " + experience*15);
        // method name is salary, access public, specifier static, return type is void
    }



    static void insurance () {
        System.out.println("Total insurance: " + age*10);
        // Acces Modifier default, specifier is static, return type is void, method name is insurance
    }





    public static void main(String[] args) {

        // I am in the same class

        System.out.println(name);
        System.out.println(age);
        experience = 25;  // I can change the final value of experince
        System.out.println(experience);


        salary();
        insurance();


    }
}