package week8._1_monday._1_monday;

import java.util.Scanner;

public class Example_2 {
    //Get the student name and grades (60 70 90) from the user.
    // Get 3 students and 3-course grades.
    // After finding the average of these courses in a method,
    //the result should be  Ahmet 75.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {

            System.out.print("Name : ");
            String name=sc.nextLine();
            System.out.print("Enter at least 3 grades keep one space between each : ");
            String strGrades = sc.nextLine();
            System.out.println("Student Name : "+name+" , Grades : "+findAvg(strGrades));
        }

    }

    public static int findAvg(String grades){
        String [] gradesArr=grades.split(" ");
        int sum=0;
        int avg;
        for (int i = 0; i < gradesArr.length; i++) {
            sum+=Integer.parseInt(gradesArr[i]);
        }
        avg=sum/gradesArr.length;
        return avg;
    }

}
