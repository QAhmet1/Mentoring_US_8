package week10._3_wednesday.example1;

import java.util.ArrayList;

public class School {
    private String schoolName;
    private int maxNumOfStudents;
    private ArrayList<Student> students=new ArrayList<>();

    public School(String schoolName, int maxNumOfStudents) {
        this.schoolName = schoolName;
        this.maxNumOfStudents = maxNumOfStudents;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getMaxNumOfStudents() {
        return maxNumOfStudents;
    }

    public void setMaxNumOfStudents(int maxNumOfStudents) {
        this.maxNumOfStudents = maxNumOfStudents;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
