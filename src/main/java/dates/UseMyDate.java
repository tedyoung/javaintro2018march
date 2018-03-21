package dates;

public class UseMyDate {
  public static void main(String[] args) {
    MyDate d = new MyDate(28, 2, 2018);
    String dayName = d.getDayName();
    System.out.println("Day name is " + dayName);
    MyDate tomorrow = new MyDate(22, 3, 2018);
    System.out.println("Tomorrow is a " + tomorrow.getDayName());
    System.out.println("Tomorrow is: " + tomorrow);

    try {
      tomorrow.setDay(9);
      System.out.println("Tomorrow is: " + tomorrow);
      tomorrow.setDay(900);
      System.out.println("Date set successfully, to 900!!!!");
    } catch (DateProblemException iae) {
      System.out.println("oops, that was a bad value.");
    }
    System.out.println("Tomorrow is: " + tomorrow);
  }
}
