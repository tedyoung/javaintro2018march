package generalization;

public class WeddingParty {
  public static void main(String[] args) {
//    Photographer p = null; // won't work without a real one!!
    Photographer p = new MomWithGoodCamera();
    String subject = "Bride and Groom";
    String picture = p.takePhoto(subject);
    System.out.println("picture is: " + picture);
  }
}
