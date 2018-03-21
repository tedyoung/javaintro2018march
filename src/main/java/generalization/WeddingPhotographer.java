package generalization;

public class WeddingPhotographer implements Photographer {
  @Override
  public String takePhoto(String subject) {
    return "It's a nicely lit picture of " + subject
        + " with a good smile and uncluttered background!";
  }
}
