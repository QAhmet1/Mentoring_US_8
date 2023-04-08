package week4._1_monday;

public class Example3 {
    //Define an array with 5 elements, numbers up to 10
    //Fill in randomly.
    //Then print it with a separate loop.
    public static void main(String[] args) {
        int[] arr=new int[5];

        for(int i=0; i< arr.length ; i++)
            arr[i] = (int)(Math.random()*10);

        for(int i=0; i< arr.length ; i++)
            System.out.println("arr["+i+"] = " + arr[i]);
    }
}
