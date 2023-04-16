package week4._4_thursday;

/*
Given an integer array int arr []= {3,5,6,0,0,0 };   The program should
output the multiplication of non-zero elements of array.
Output = 3*5*6 =  90
 */
public class Task1 {
    public static void main(String[] args) {

        int  []  arr  = {3,5,6,0,0,0};

        int multiplication = 1;  // preferred 1, since it is not changing the result.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                multiplication *= arr[i];
            }
        }
        System.out.println("multiplication = " + multiplication);



    }


}
