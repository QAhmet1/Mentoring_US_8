package wwek11.tuesday;

import java.util.Arrays;
import java.util.HashSet;

public class SetQ1 {
    //  Create a HashSet with 10 elements.
    // fill with random numbers from 1 to 20.
    // create a function that prints Set
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>();
        while (hs.size()<10){
            hs.add((int) (Math.random()*20));
        }
        print(hs);
    }
    public static void print(HashSet<Integer>hs){
        System.out.println(hs);
    }
}
