package week5._1_monday;

public class TwoDArrays_3 {
    public static void main(String[] args) {
        // Create  2 dimensional 3x4 array
        // and fill  the array with random numbers 1-10,
        // print in another loop.
        int [][] arr=new int[3][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]= (int) (Math.random()*10);
            }

        }
        for (int i = 0; i < arr.length; i++) {  // arr.length means row size
            for (int j = 0; j < arr[i].length; j++) { //arr[i].length means size of current row
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }


    }
}
