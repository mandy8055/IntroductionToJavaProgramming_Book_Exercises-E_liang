package java8_date_time;

import java.time.Month;
import java.util.Scanner;
import java.time.Year;
import java.time.Period;
import java.time.LocalDate;

public class UsingPeriodAndYearClasses {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//      Check if the given year is the leap year
        int year = sc.nextInt();
        Year y = Year.of(year);
        if (y.isLeap()) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
//      Check the age of certain Person using period class
        LocalDate birthDate = LocalDate.of(1996, Month.MAY, 12);
        LocalDate today = LocalDate.now();
        Period p = Period.between(birthDate, today);
        System.out.println("Your exact age is " + p.getYears() + " years, " +
                p.getMonths() + " months and " + p.getDays() + " days.");
//      Releasing the resources
        sc.close();
    }
}
