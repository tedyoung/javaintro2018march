package dates;

public class MyDate {
  private int day;
  private int month;
  private int year;

  public MyDate(int d, int m, int y) {
    if (d > 0 && d < 32 && m > 0 && m < 13) {// close but no cigar!
      this.day = d;
      this.month = m;
      this.year = y;
    } else throw new IllegalArgumentException("Bad values for a date!");
  }

  public void setDay(int d) throws DateProblemException {
    if (d > 0 && d < 31) {
      this.day = d;
    } else throw new DateProblemException("Bad day");
  }

  public String getDayName() {
    return dayAsText(getDayOfWeek(this.day, this.month, this.year));
  }

  @Override
  public String toString() {
    return "MyDate day = " + this.day
        + " month = " + this.month + " year = " + this.year;
  }

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
    return "" + DayOfWeek.values()[d];
  }
}
