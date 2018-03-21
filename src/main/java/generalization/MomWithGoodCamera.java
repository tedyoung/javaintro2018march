package generalization;

public class MomWithGoodCamera implements Photographer {
  @Override
  public String takePhoto(String subject) {
    return "Cute picture of Mom's kid gooning in the foreground "
        + "with " + subject + " slightly out of focus in the background!";
  }
}
