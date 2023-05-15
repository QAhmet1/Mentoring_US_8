package week9._1_monday.example1;

public class Student {
    //       Example 1
    //	      Write a program to print the names of students by creating
    //        a Student class. If no name is passed while creating an object
    //        of Student class, then the name should be "Unknown",
    //        otherwise the name should be equal to the String value
    //        passed while creating object of Student class.

    String name;
    public Student(){
        this.name="Unknown";
    }
    public Student(String name){
        this.name=name;
    }
    public void print(){
        System.out.println(this.name);
    }


}
