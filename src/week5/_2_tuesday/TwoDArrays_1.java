package week5._2_tuesday;

import java.util.Scanner;

public class TwoDArrays_1 {
    public static void main(String[] args) {
        // Enter number of rows: 3
        //Enter number of columns: 3

        //1 2 3
        //2 4 6
        //3 6 9

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows= sc.nextInt();

        System.out.print("Enter number of columns : ");
        int columns= sc.nextInt();
        int[][] arr=new int[rows][columns];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=(i+1)*(j+1);

            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

            sc.close();

        }





    }
}
