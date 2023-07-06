package week15._4_thursday;

import java.util.*;

/*
Find the count of names by using map:
 String str = "emre emre John.berk.berk.berk";
Output: emre-2, john-1, berk-3   - key value format --- map
 */
public class Task1 {
    public static void main(String[] args) {

        String str = "emre  emre John.berk.berk.berk";
        str = str.replace(".", " ");
        str = str.replace("  ", " ");
        str = str.toLowerCase();
        System.out.println(str);

        // I will  convert this string to string array
        // To convert strings to arrays there are 2 ways: 1) split method 2) toCharArray Method

        String [] arr = str.split(" ");
       //  System.out.println(Arrays.toString(arr));


        // emre-2, john-1 ,,,

        Map<String, Integer> map = new TreeMap<>();

        // firstly I will add names to map as string key
        // secondly I will add values as integer


        for (int i = 0; i < arr.length; i++) {

            int count =0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
           map.put(arr[i], count);

        }

        System.out.println(map);








    }


}
