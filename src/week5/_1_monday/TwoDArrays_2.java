package week5._1_monday;

public class TwoDArrays_2 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2 }, { 3, 4 } };
        // output
        //arr[0][0] = 1
        //arr[0][1] = 2
        //arr[1][0] = 3
        //arr[1][1] = 4

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("arr[" + i + "][" + j + "] = "+ arr[i][j]);

            }
        }


    }
}
