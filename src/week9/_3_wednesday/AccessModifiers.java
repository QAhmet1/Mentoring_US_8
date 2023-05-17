package week9._3_wednesday;

// ACCESS MODIFIERS:
public class AccessModifiers {



        // What are the access modifiers in java?
        // public prtotected default private ( These are about visiblity)

        // public --> visible everywhere in the project
        // default --> visible within the same package  ( you  are in  a different class)
        // protected -->  visible in the same package +  if you are in a sub-class if even you are in different package it is visible again
        // private --> visible only in the same class

    public static int publicData = 100;  // This is a public variable name

    static int defaultData = 200; // This is a variable which has default access modifier

    protected static int protectedData = 300; // This is a variable which has protected  acces modifier

    private static int privateData = 400; // This is a variable which has private access modifier



    public static void publicAccessMethod ( ) {
        System.out.println("public method");
        // method with public access modifier

    }


    static void defaultAccessMethod() {
        System.out.println("default method");
        // method with default access modifier
    }




    protected static void protectedAccessMethod () {
        System.out.println("protected method");
        // method with protected access modifier

    }


    private static void privateAccessMethod () {
        System.out.println("private method");
        // method with private access modifier

    }


    public static void main(String[] args) {


        System.out.println(publicData);
        System.out.println(defaultData);
        privateAccessMethod();

    }








}
