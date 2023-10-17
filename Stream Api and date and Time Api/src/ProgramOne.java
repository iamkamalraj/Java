//Ex:
import java.time.ZoneId;

  class ProgramOne {
             public static void main(String[] args) {
                        ZoneId zone = ZoneId.systemDefault();
                        System.out.println(zone);
             }
}
//Output
//Asia/Calcutta
//
//We can create ZoneId for a particular zone as follows
//Ex:
// ZoneId la = ZoneId.of("America/Los_Angeles");
// ZonedDateTimezt = ZonedDateTime.now(la);
// System.out.println(zt);
//
//Output
//2022-10-29T23:19:59.718-07:00[America/Los_Angeles]
//
//
//Period Object:
//Period object can be used to represent quantity of time
//Ex:
// LocalDate today = LocalDate.now();
// LocalDate birthday = LocalDate.of(1994,01,3);
// Period p = Period.between(birthday,today);
// System.out.printf("age is %d year %d months %d
//days",p.getYears(),p.getMonths(),p.getDays());
//
//Output
//age is 28 year 9 months 27 days