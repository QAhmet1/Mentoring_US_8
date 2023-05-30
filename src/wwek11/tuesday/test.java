package wwek11.tuesday;

import java.util.HashSet;

public class test {
    public static void main(String[] args) {
        HashSet<Day>hs=new HashSet<>();
        hs.add(Day.MONDAY);
        hs.add(Day.TUESDAY);
        hs.add(Day.WEDNESDAY);
        hs.add(Day.THURSDAY);
        hs.add(Day.MONDAY);
        hs.add(Day.FRIDAY);
        System.out.println("hs = " + hs);
    }
}
