package week5._2_tuesday;

import java.util.Arrays;

public class TwoDArrays_2 {
    public static void main(String[] args) {
        //Create an irregualr 2D array and fill it
        //print the irregular array
        int[][] matrix = {
                {10, 20, 30},
                {40, 50},
                {70, 80, 90, 25},
                {11}

        };
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i])+" ");
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");


            }
            System.out.println();

        }
    }
}