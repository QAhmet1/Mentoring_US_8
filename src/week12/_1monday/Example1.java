package week12._1monday;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Example1 {
    // Write method that gets a String and returns
    // number of each letter and the letter alphabetically.
    // input: "baaccbccdccdefeeffaa"
    // output: {2=d, 3=f, 4=a, 5=b, 6=c}
    public static void main(String[] args) {
        String myStr="baaccbbbbccdccdefeeffaa";
        System.out.println(numberOfDuplicates(myStr));
    }

    public static Map<Integer,String> numberOfDuplicates(String str){
      Map<Integer,String>map=new HashMap<>();
      String []strArr=str.split("");
        System.out.println(Arrays.toString(strArr));

        for (String letter:strArr){
            int count=0;
            for (String arrLetter:strArr){
                if(letter.equals(arrLetter)){
                    count++;
                }
            }
            map.put(count,letter);
        }

      return map;
    }

}
