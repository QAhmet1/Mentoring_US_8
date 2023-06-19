package week14._01_monday;

import java.time.LocalDate;
import java.time.Period;

public class _3 {
    /*
    todo write a program to calculate the age by using localdate
     */
    public static void main(String[] args) {
        LocalDate dob= LocalDate.of(1985,4,12);
        LocalDate today=LocalDate.now();
        Period diff=Period.between(dob,today);
        System.out.println("Age of Cankut is : "+diff.getYears());
        System.out.println("Age of Cankut is : "+diff.getDays());
        System.out.println("Age of Cankut is : "+diff.getMonths());


    }

}
