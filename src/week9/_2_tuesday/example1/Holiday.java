package week9._2_tuesday.example1;

public class Holiday {
   private String name;
   private int day;
   private String month;
   Holiday[] holidays;

    public Holiday(String name,int day,String month){
        this.name=name;
        this.day=day;
        this.month=month;

    }

    public Holiday(String name,String month){
        this.name=name;
        this.month=month;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void print(Holiday [] holidayArr){
        for (int i = 0; i <holidayArr.length ; i++) {
            System.out.println("*********");
            System.out.println(holidayArr[i].name);
            System.out.println(holidayArr[i].day);
            System.out.println(holidayArr[i].month);

        }
    }
}
