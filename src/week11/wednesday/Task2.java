package week11.wednesday;
/*
1.Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
        1.1 Password must be at least have 8 characters long, and should not contain space
        1.2 PassWord should at least contain one upper case letter
        1.3 PassWord should at least contain one lower case letter
        1.4 Password should at least contain one special characters
        1.5 Password should at least contain a digit
 */

import java.util.ArrayList;

public class Task2 {

    public static void main(String[] args) {


        String password = "Kjdsflkjfdsalk29489422";

        // 1.step: I stored string in c a char array list
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < password.length(); i++) {
            list.add(password.charAt(i));
        }

        System.out.println(list);

        // 2.step
        boolean r1 = list.size()>=8  && !list.contains(" ");
        boolean r2 = false;   // has one upper case
        boolean r3 = false;  // has one lower case
        boolean r4 = false;  // has at least one special char
        boolean r5 = false;  // has at least one digit


        // 3.Step
        for (int i = 0; i < list.size(); i++) {
            // if character is upper case
            if (Character.isUpperCase(list.get(i))) {
                    r2 = true;
            } else if (Character.isLowerCase(list.get(i))) {
                r3 = true;
            } else if (Character.isDigit(list.get(i))) {
                r5 = true;
            } else {
                r4 = true;
            }
            

        }

        // 4.step
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;   // true true true true true  


        System.out.println("isStrongPassword = " + isStrongPassword);
















    }







}
