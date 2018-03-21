package hello;

public class Hello {
  public static void sayHello() {
    System.out.println("Hello, again");
  }

  // fully qualified name of this method is:
  // hello.Hello.main_array_of_string
  // "method overloading" fancy name for including argument types in name
  public static void main(String[] args) {
    int x = 100;
    int y = x;
    long z = y;
    float f = 3.14F;

    double tenPi = 10 * f;
    System.out.println("Ten times pi is " + tenPi);
    System.out.printf("Ten times pi is %6.3f\n", tenPi);

    System.out.println("Hello World!");
    sayHello();
  }
  public static void main(String s) {
    System.out.println("Hello World!");
    sayHello();
  }
}
