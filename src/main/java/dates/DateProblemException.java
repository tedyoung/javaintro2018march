package dates;

public class DateProblemException extends Exception {
  public DateProblemException() {
  }

  public DateProblemException(String message) {
    super(message);
  }

  public DateProblemException(String message, Throwable cause) {
    super(message, cause);
  }

  public DateProblemException(Throwable cause) {
    super(cause);
  }

  public DateProblemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
