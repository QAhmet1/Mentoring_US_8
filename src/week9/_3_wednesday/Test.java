package week9._3_wednesday;

public class Test {


    public static void main(String[] args) {

        // I can call static methods and variables directly with clas name and I do not need to create object

        AccessModifiers.publicAccessMethod();
        AccessModifiers.defaultAccessMethod();


        AccessModifiers.publicData = 1000; // This is my final value

        System.out.println(AccessModifiers.publicData);


    }



}
