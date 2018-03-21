package generalization;

import java.util.HashMap;
import java.util.Map;

public class UseAMap {
  public static void main(String[] args) {
    Map<Integer, String> numbers = new HashMap<>();
    numbers.put(1, "Un");
    numbers.put(2, "Deux");
    numbers.put(3, "Trois");

    System.out.println("Number 1 is " + numbers.get(1));
  }
}
