package javaapplication3;

import java.util.Date;

public class Student {
   private String name;
   private Date birthDate;
   private final static double DAYS_PER_YEAR = 365.25;
   private final static long HOURS_PER_DAY = (long) (24 * DAYS_PER_YEAR);
   private final static long MINUTES_PER_HOUR = 60 * HOURS_PER_DAY;
   private final static long SECONDS_PER_MINUTE = 60 *MINUTES_PER_HOUR;
   private final static long MILLISECONDS_PER_SECOND = 1000*SECONDS_PER_MINUTE;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
//48418784
    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }
   
   public int getAge(){
       Date today = new Date();
       long milliseconds = today.getTime() - birthDate.getTime();
       return (int) (milliseconds/MILLISECONDS_PER_SECOND);
   }
   
   
}
