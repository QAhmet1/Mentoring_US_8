package week10._3_wednesday.example1;

import java.util.Scanner;

public class SchoolMain {
    public static void main(String[] args) {
        School school=new School("Techno Study", 1);
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
 int numberStudents=1;
        do {
            System.out.print("name : ");
            String name=sc1.nextLine();
            System.out.print("last Name : ");
            String lastName=sc1.nextLine();
            System.out.print("Age : ");
            int age=sc2.nextInt();
            try {
                Student student=new Student(name,lastName,age);
                school.getStudents().add(student);
                numberStudents++;

            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Please create new student");
            }


        }while (numberStudents<= school.getMaxNumOfStudents());

        for (int i = 0; i < school.getStudents().size(); i++) {
            System.out.println(school.getStudents().get(i));

//            System.out.println(school.getStudents().get(i).getName());
//            System.out.println(school.getStudents().get(i).getLastName());
//            System.out.println(school.getStudents().get(i).getAge());

        }

        }

    }

