package generalization;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UsingLists {
  public static void main(String[] args) {
//    List<String> ls = new ArrayList<String>();
    List<String> ls = new LinkedList<String>();
    ls.add("Fred");
    ls.add("Jim");
    ls.add("Sheila");
    System.out.println("All people: " + ls);
    ls.add("Alan");
    ls.remove(1);
    System.out.println("All people: " + ls);
  }
}
