package wwek11.monday.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Example {
    // Get as many grades as a teacher wants to enter, and
   // Find the number of students who passed the average.

    public static void main(String[] args) {
        ArrayList<Integer>grades=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        String isContinue;
        do {
            System.out.print("Grade : ");
            int grade=sc.nextInt();
            grades.add(grade);
            System.out.print("Do you wanna add grades ? (Y/N) : ");
            isContinue=sc1.nextLine();

        }while (isContinue.equalsIgnoreCase("Y"));

        int sum=0;
        int avg=0;
        for (int i = 0; i < grades.size(); i++) {
            sum=sum+grades.get(i);

        }
        avg=sum/grades.size();

        int count=0;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i)>avg){
                count++;
            }
        }
        System.out.println("avg = " + avg);
        System.out.println(count);
    }



}
