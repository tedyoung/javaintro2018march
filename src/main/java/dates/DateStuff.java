package dates;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DateStuff {
  public static int getDayOfWeek(int day, int month, int year) {
    int 月 = month; // :)
    int modifiedMonth = month;
    int modifiedYear = year;
    if (month < 3) {
      modifiedMonth = month + 12;
      modifiedYear = year - 1;
    }
    int dayOfWeek = (day
        + (13 * (modifiedMonth + 1) / 5)
        + modifiedYear
        + modifiedYear / 4
        - modifiedYear / 100
        + modifiedYear / 400
    ) % 7;
    return dayOfWeek;
  }

  public static void main(String[] args) throws Throwable {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter day: ");
    String dayString = in.readLine();
    int day = Integer.parseInt(dayString);
    System.out.print("Enter month: ");
    String monthString = in.readLine();
    int month = Integer.parseInt(monthString);
    System.out.print("Enter year: ");
    String yearString = in.readLine();
    int year = Integer.parseInt(yearString);
    int dayOfWeek = getDayOfWeek(day, month, year);
    System.out.println("Day of week is " + dayOfWeek);
  }
}
