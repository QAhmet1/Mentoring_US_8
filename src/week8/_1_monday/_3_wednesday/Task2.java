package week8._1_monday._3_wednesday;

public class Task2 {

    // Create a method that finds the maximum element of an array
    public static void main(String[] args) {

        int [] arr = {1,2,4,-1,-4};

        maxElement(arr);




    }


    public static void maxElement (int [] arr) {

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }

        System.out.println("max = " + max);





    }







}
