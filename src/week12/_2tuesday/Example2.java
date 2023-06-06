package week12._2tuesday;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Example2 {
    // write a code for digital live clock
    public static void main(String[] args) {
        DateTimeFormatter fDate=DateTimeFormatter.ofPattern("MM:dd:yy");
        DateTimeFormatter fTime=DateTimeFormatter.ofPattern("kk:mm:ss");
        LocalDate date=LocalDate.now();
        System.out.println("date = " + date);
        while (true){
            LocalTime time=LocalTime.now();
            System.out.print("\r"+time.format(fTime));
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }
}
