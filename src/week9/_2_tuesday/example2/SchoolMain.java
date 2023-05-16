package week9._2_tuesday.example2;

public class SchoolMain {
    public static void main(String[] args) {
        Student s1=new Student("Luba","Avakova",18);
        Student s2=new Student("cankut","sogancilar",19);
        Student s3=new Student("Elvira","Nazir",20);
        Student[]students={s1,s2,s3};

        for (int i = 0; i < students.length ; i++) {
            System.out.println("**********");
            System.out.println("Student's school name is :"+students[i].getSchoolName());
            System.out.println("Student's no is :"+students[i].getSchoolNo());
            System.out.println("Student's name is :"+students[i].getName());
            System.out.println("Student's last name is :"+students[i].getLastName());
            System.out.println("Student's age is :"+students[i].getAge());

        }

    }
}
