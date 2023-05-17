package week9._3_wednesdayDifferentPackage;


import week9._3_wednesday.AccessModifiers;

public class Test2 extends AccessModifiers {  // I am implementing inheritance

    public static void main(String[] args) {

        // Protected : visible in the sam package  + Protected acces modifier is visible everytime in sub class
        // Default :  is only visible in the sam package

        System.out.println(AccessModifiers.publicData);
        AccessModifiers.publicAccessMethod();

        AccessModifiers.protectedAccessMethod();
        System.out.println(AccessModifiers.protectedData);

        // public    +    private


    }




}
