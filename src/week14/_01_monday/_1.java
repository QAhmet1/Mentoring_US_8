package week14._01_monday;

import java.util.HashSet;
import java.util.Iterator;

public class _1 {
     /*
    1. create 10 numbers HashSet.
    2. Fill the set by using a random method.
    3. print all elements by using the iterator method.
     */

    public static void main(String[] args) {
        HashSet<Integer>numbers=new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int random=(int) (Math.random()*10);
            System.out.println("random = " + random);
            numbers.add(random);// 0,1,2,3,4,5,6,7,8, 9
        }
        System.out.println("numbers = " + numbers);
        Iterator<Integer>iterator=numbers.iterator();
        System.out.print("Hashset using iterator ");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+",");
        }
    }


}
