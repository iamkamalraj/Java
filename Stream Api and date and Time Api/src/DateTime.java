//# program for to display System Date and time.
import java.time.LocalDate;
import java.time.LocalTime;

public class DateTime {
            public static void main(String[] args) {
                        LocalDate date = LocalDate.now();
                        System.out.println(date);

                       LocalTime time=LocalTime.now();
                       System.out.println(time);
           }
}
//Output
//======
//2022-10-30
//11:15:41.698
//
//Once we get LocalDate object we can call the following methods on that object to
//retrieve Day,month and year
//values separately.
