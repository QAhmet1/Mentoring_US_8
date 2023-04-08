package week4._1_monday;

public class ArraysIntro {
    public static void main(String[] args) {
        /*
       TODO We will learn to declare, initialize, and access array elements .

       TODO How to declare an array in Java?
        dataType[] arrayName;
        ...

         */
        double[] data;
        String[] strArr;


        // TODO How to Initialize Arrays in Java?

        //declare and initialize and array
        //int[] age = {12, 4, 5, 2, 5};

        // declare an array
        int[] age = new int[5];

        // initialize array
        age[0] = 12;
        age[1] = 4;
        age[2] = 5;
        age[3] = 2;
        age[4] = 5;

        //TODO How to Access Elements of an Array in Java?

        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);
    }
}
