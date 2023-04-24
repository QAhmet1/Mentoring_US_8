package week5._4_thursday;

// Find the max and minimum element by using for loop and if condition

public class Max_Min2 {
    public static void main(String[] args) {


        int [] arr = {1,5, 65,4,76,12};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> max) {
                max = arr[i];
            }
        }

        System.out.println("------------");

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]< min) {
                min = arr[i];
            }
        }

        System.out.println("min = " + min);













    }

}
