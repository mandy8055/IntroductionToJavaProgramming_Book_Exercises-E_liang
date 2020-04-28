package objects_and_classes_primer.Exercises;
import java.util.Scanner;
import javax.swing.*;

public class Exercise6 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter full year(e.g. 2019): ");
        int year = sc.nextInt();
        System.out.print("Enter month as a number between 1 and 12: ");
        int month = sc.nextInt();
        PrintCalendar printCalendar = new PrintCalendar(year, month);
        printCalendar.outputMessage();

    }
}

class PrintCalendar {
    //    Data Fields here
    private int month;
    private int year;
    final JDialog jDialog = new JDialog();

    //    Constructor here
    public PrintCalendar(int yearVal, int monthVal) {
        month = monthVal;
        year = yearVal;
    }

    public void outputMessage() {
        // Print the headings of the calendar
        String finalMessage = printTitle();
        // Print the body of the calendar
        finalMessage += printBody();
        // System.out.print(finalMessage);
        jDialog.setAlwaysOnTop(true);
        JOptionPane.showMessageDialog(jDialog, finalMessage);
    }

    /**
     * Print the month title, e.g., May, 1999
     */
    public String printTitle() {
        String finalTitle = "         " + getMonthName(month)
                + " " + year + "\n";
        finalTitle += "----------------------------------------\n";
        finalTitle += " Sun Mon Tue Wed Thu Fri Sat\n";
        return finalTitle;
    }

    /**
     * Print month body
     */
    public String printBody() {
        // Get start day of the week for the first date in the month
        int startDay = getStartDay();
        StringBuilder finalBody = new StringBuilder();

        // Get number of days in the month
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        // Pad space before the first day of the month
        int i;
        for (i = 0; i < startDay; i++)
            finalBody.append("        ");

        for (i = 1; i <= numberOfDaysInMonth; i++) {
            if(countDigits(i)== 1)
            finalBody.append("      ").append(i);
            else{
                finalBody.append("    ").append(i);
            }

            if ((i + startDay) % 7 == 0)
                finalBody.append("\n");
        }

        finalBody.append("\n");
        return finalBody.toString();
    }

    public int countDigits(int i){
        int counter = 0;
        while(i != 0){
            i /= 10;
            counter++;
        }
        return counter;
    }

    /**
     * Get the English name for the month
     */
    public String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
        }

        return monthName;
    }

    /**
     * Get the total number of days since January 1, 1800
     */
    public int getTotalNumberOfDays() {
        int total = 0;

        // Get the total days from 1800 to 1/1/year
        for (int i = 1800; i < year; i++)
            if (isLeapYear(i))
                total = total + 366;
            else
                total = total + 365;

        // Add days from Jan to the month prior to the calendar month
        for (int i = 1; i < month; i++)
            total = total + getNumberOfDaysInMonth(year, i);

        return total;
    }

    /** Get the start day of month/1/year */
    public int getStartDay() {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        // Get total number of days from 1/1/1800 to month/1/year
        int totalNumberOfDays = getTotalNumberOfDays();

        // Return the start day for month/1/year
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    /**
     * Get the number of days in a month
     */
    public int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2) return isLeapYear(year) ? 29 : 28;

        return 0; // If month is incorrect
    }

    /**
     * Determine if it is a leap year
     */
    public boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
