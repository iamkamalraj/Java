
//java.util.Date vs java.sql.Date
//========================
public class DateAndTime {
      public static void main(String[] args) {

           //To use Date in general operations like printing the date and time
           java.util.Date utilDate = new java.util.Date();
           System.out.println(utilDate);


            long l = utilDate.getTime();// It is giving the information of utilDate in milliseconds from 1970
            System.out.println(l+"ms");

           //To use Date in DB operations like insert,update,delete query we use sqlDate
           java.sql.Date sqlDate = new java.sql.Date(l);
           System.out.println(sqlDate);
      }
}
//Output
//Sun Oct 30 10:05:33 IST 2022
//1667107558145ms
//2022-10-30(yyyy-mm-dd)
//
//Difference b/w java.util.Date and java.sql.Date
//=====================================
//java.util.Date
//      => It is a utility class to handles Date in our java program.
//      => It represents both Date and Time
//
//java.sql.Date
//      => It is designed class to handle Dates w.r.t DB operations
//      => It represents only Date,but not Time.
//
//
//Note: In sql package
//                  Time(C)                represents only => Time value
//                  TimeStamp(C)   represents both => Date and Time value
//
//
//Date and Time API: (Joda-Time API)
//Until Java 1.7 version the classes present in Java.util package to handle Date and
//Time (like Date, Calendar,
//TimeZone etc) are not up to the mark with respect to convenience and performance.
//
//To overcome this problem in the 1.8 version oracle people introduced Joda-Time API.
//This API developed by joda.org and available in Java in the form of "java.time"
//package.
//


