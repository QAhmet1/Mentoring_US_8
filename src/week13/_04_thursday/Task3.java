package week13._04_thursday;

public class Task3 {

    public static void main(String[] args) {
        // --------------------- PEAK NUMBER----------------------------------------------------
        // Peak number is not max number --> It means:  number is greater than neighbouring numbers
        // 1, 2, 4, 0, 6, 7, 8   peak number here --> 4

        int [] arr   = {   1, 2, 4, 0, 6, 7, 8  };

        //        Focus:
        //        1) The first element can not be peak so I am not beginning with arr[i]
        //        2) Assume that your peak number is arr[i+1] we will check whether It is peak or not

        for (int i = 0; i < arr.length-2; i++) {
            // arrr[i+1] (peak number) has to be bigger than left side and right side element.
            if (arr[i+1] > arr[i] && arr[i+1]> arr[i+2]) {
                System.out.println(arr[i+1] + " is peak element");
            }
        }












    }


}
