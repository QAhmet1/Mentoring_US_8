package week5._4_thursday;

// Find the sum and average of elements in the given array --> {1,5,65,4,76,12}

public class Task3 {

    public static void main(String[] args) {


        double [] arr = {1,5, 65,4,76,12};
        double sum = 0;   // 1 + 5 + 65----- 12


        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];  // sum = sum + arr[i];
        }

        System.out.println("sum = " + sum);

        double average = sum/arr.length;

        System.out.println("average = " + average);









    }
}
