package week5._1_monday;

public class TwoDArrays_1 {
    public static void main(String[] args) {
        int number =0;  // this allocates 1 number in memory
        int []arr=new int[5]; // this allocates 5 int number in memory
        int [][] table=new int[5][4]; // this allocates 20 int number in memory in the form 5 rows and 4 columns

        int row=4;
        int column=5;
        int[][]array=new int[row][column];
        int value=1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j]=value;
                value++;
            }

        }

        System.out.println("The 2D array is : ");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();

        }
    }
}
