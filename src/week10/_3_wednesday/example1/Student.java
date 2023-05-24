package week10._3_wednesday.example1;

public class Student {
    private String name;
    private String LastName;
    private int age;

    public Student(String name, String lastName, int age) {
        setName(name);
        setLastName(lastName);
        setAge(age);
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

    public int getAge() throws Exception {
        if (age>15){
            throw  new Exception("The age cannot be more than 15");
        }
        else {
            this.age=age;
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                '}';
    }
}
