package week5._1_monday;

public class TwoDArrays_4 {
    public static void main(String[] args) {
        // sum each row
        int [][]matrix={
                { 10, 20, 30 },//60
                { 40, 50, 60 },//150
                { 70, 80, 90 },//240
                { 11, 21, 31 }//63
        };
        int sum;
        for (int i = 0; i < matrix.length; i++) {
            sum=0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum=sum+matrix[i][j];
            }
            System.out.println("the sum of row "+(i+1)+"="+sum);

        }


    }
}
