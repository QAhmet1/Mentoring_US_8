package week9._2_tuesday.example2;

public class Student {
    private String name;
    private String LastName;
    private String SchoolName="Techno Study";
    private int age;
    private int schoolNo;
    private static int ID=100;

    public Student(String name, String lastName, int age) {
        setName(name);
        setLastName(lastName);
        setAge(age);
        setSchoolName(getSchoolName());
        setSchoolNo(ID++);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSchoolNo() {
        return schoolNo;
    }

    public void setSchoolNo(int schoolNo) {
        this.schoolNo = schoolNo;
    }
}
