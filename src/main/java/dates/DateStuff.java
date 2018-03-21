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
    } // else if () {} else {}
    int dayOfWeek = (day
        + (13 * (modifiedMonth + 1) / 5)
        + modifiedYear
        + modifiedYear / 4
        - modifiedYear / 100
        + modifiedYear / 400
    ) % 7;
    return dayOfWeek;
  }

  public static String dayAsText(int d) {
    String name = "";
    switch (d) {
//      case -1:
//      case -2:
      case 0:
        name = "Saturday";
        break;
      case 1:
        name = "Sunday";
        break;
      case 2:
        name = "Monday";
        break;
      case 3:
        name = "Tuesday";
        break;
      case 4:
        name = "Wednesday";
        break;
      case 5:
        name = "Thursday";
        break;
      case 6:
        name = "Friday";
        break;
      default:
        name = "Bad Day of week!";
        break;
    }
    return name;
  }

  public static void main(String[] args) throws Throwable {
//    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//    System.out.print("Enter day: ");
//    String dayString = in.readLine();
//    int day = Integer.parseInt(dayString);
//    System.out.print("Enter month: ");
//    String monthString = in.readLine();
//    int month = Integer.parseInt(monthString);
//    System.out.print("Enter year: ");
//    String yearString = in.readLine();
//    int year = Integer.parseInt(yearString);
//    int dayOfWeek = getDayOfWeek(day, month, year);
//    System.out.println("Day of week is " + dayOfWeek);

//    int d = 1;
//    while (d < 31) {
//      System.out.println("Day " + d + " of feb, 2018 is on day number "
//      + getDayOfWeek(d, 2, 2018));
////      d = d + 1;
////      d += 1;
////      int x = d++;
//      d++; // ++d --d / d--
//    }
    // do { ...} while(test);

    for (int d = 1; d < 31; d++) {
      System.out.println("Day " + d + " of feb, 2018 is on day number "
          + dayAsText(getDayOfWeek(d, 2, 2018)));
    }
  }
}
