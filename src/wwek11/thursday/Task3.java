package wwek11.thursday;

import java.util.ArrayList;

public class Task3 {

    // Reversed String
    // We are gonna reverse Array List

    // create a method/function to reverse an array list


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // I want to add elements from 1 to 10

        for (int i = 1; i <=10 ; i++) {    // 1,2,3,,,,,10
            list.add(i);
        }

        // This array list is to store elements in reverse order
        ArrayList<Integer> reverse = new ArrayList<>();

        // to get element from array list We are using get() keyword

        for (int i=list.size()-1;    i>=0;    i-- ) {   // 10,9,-------1
            reverse.add(list.get(i));
        }

        System.out.println(reverse);





    }

}
