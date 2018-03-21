package dates;
// HOW familiar are you with OO
// A) very!!
// E) What's that!???

public class DateStuff2 {
  public static int getDayOfWeek(int day, int month, int year) {
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

  enum DayOfWeek {
    Saturday, Sunday, Monday, Tuesday, Wednesday, Thursday, Friday;
  }

  public static String dayAsText(int d) {
//    return DayOfWeek.values()[d].toString();
    return "" + DayOfWeek.values()[d];
  }

  //  public static String dayAsText(int d) {
//    String[] names = {
//        "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
//    };
//    return names[d];
//  }
//
  public static void main(String[] args) {
    for (int d = 1; d < 31; d++) {
      System.out.println("Day " + d + " of feb, 2018 is on day number "
          + dayAsText(getDayOfWeek(d, 2, 2018)));
    }
  }
}
