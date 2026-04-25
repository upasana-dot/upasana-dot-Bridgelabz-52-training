package level_3;
import java.util.*;

public class CalendarDisplay {

    static String[] monthNames = { "January", "February", "March", "April", "May", "June",
                                    "July", "August", "September", "October", "November", "December" };

    static int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if (month == 2) return isLeapYear(year) ? 29 : 28;
        return monthDays[month - 1];
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int q = 1;
        int m = month < 3 ? month + 12 : month;
        int Y = month < 3 ? year - 1 : year;
        int K = Y % 100;
        int J = Y / 100;
        int h = (q + (13*(m+1))/5 + K + (K/4) + (J/4) + 5*J) % 7;
        return (h + 6) % 7; // Convert to 0=Sun
    }

    public static void displayCalendar(int month, int year) {
        int firstDay = getFirstDayOfMonth(month, year);
        int days = getDaysInMonth(month, year);

        System.out.println("     " + monthNames[month-1] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        for (int i = 0; i < firstDay; i++) System.out.print("   ");
        for (int d = 1; d <= days; d++) {
            System.out.printf("%2d ", d);
            if ((firstDay + d) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        displayCalendar(month, year);
    }
}

