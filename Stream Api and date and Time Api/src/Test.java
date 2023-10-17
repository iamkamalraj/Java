//Ex:
import java.time.*;
  class Test {
         public static void main(String[] args) {
                    LocalDate date = LocalDate.now();
                    System.out.println(date);
                    int dd =   date.getDayOfMonth();
                    int mm = date.getMonthValue();
                    int yy = date.getYear();
                    System.out.println(dd+"..."+mm+"..."+yy);
                    System.out.printf("\n%d-%d-%d",dd,mm,yy);
       }
}
//Output
//2022-10-30
//30...10...2022
//30-10-2022
//


//Once we get LocalTime object we can call the following methods on that object.
import java.time.*;
class Test {
       public static void main(String[] args) {
                  LocalTime time = LocalTime.now();
                  int h = time.getHour();
                  int m = time.getMinute();
                  int s = time.getSecond();
                  int n = time.getNano();
                  System.out.printf("\n%d:%d:%d:%d",h,m,s,n);
     }
}
//Output
//9:22:31:795000000
//
//Note::
//If we want to represent both Date and Time then we should go for LocalDateTime
//object.
//LocalDateTimedt = LocalDateTime.now();
//System.out.println(dt);
//O/p: 2015-11-23T12:57:24.531
//
//We can represent a particular Date and Time by using LocalDateTime object as
//follows.
//Ex:
// LocalDateTime dt1 = LocalDateTime.of(1995,Month.APRIL,28,12,45);
// sop(dt1);
//
//Ex:
// LocalDateTime dt1=LocalDateTime.of(1995,04,28,12,45);
// Sop(dt1);
// Sop(“After six months:”+dt.plusMonths(6));
// Sop(“Before six months:”+dt.minusMonths(6));
//
//ZoneId
//=====
//To Represent Zone:
//ZoneId object can be used to represent Zone.
