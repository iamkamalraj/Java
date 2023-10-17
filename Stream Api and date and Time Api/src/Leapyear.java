
//# write a program to check the given year is leap year or not
//
//rule for leap year
//=============
//=> A year may be a leap year if it is evenly divisible by 4.
//=> Years that are divisible by 100 (century years such as 1900 or 2000) cannot be
//leap years unless they are also
//      divisible by 400.
//
import java.time.Year;

 public class Leapyear {
      public static void main(String[] args){
             int n = Integer.parseInt(args[0]);
             Year y = Year.of(n);
              if(y.isLeap())
                  System.out.printf("%d is Leap year",n);
             else
                  System.out.printf("%d is not Leap year",n);
     }
}


//Note:
//    Date -> LocalDate(C)
//    Time -> LocalTime(C)
//    Date & Time -> LocalDateTime(c)
//
//     now() --->Current information
//       of()     --> user specific information
//
//     ZoneId -> Setting up the particular zone to fetch the information
//      ZondDateTime-> To get the Date and time information of any zone.
//
//      Period ---> To find difference b/w 2 date Objects
//     Year    ---> To check whether the supplied year is leapYear or not.
