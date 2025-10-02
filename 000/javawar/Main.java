
public class Main {
  public static String _binaryAddition(int a, int b) {
    // your code here
    return Integer.toBinaryString(a + b);
  }

  public static String bit(int num) {
    boolean one = (num % 2 == 1);
    if (num / 2 == 0)
      return one ? "1" : "";
    return bit(num / 2) + (one ? "1" : "0");
  }

  public static String binaryAddition(int a, int b) {
    return bit(a + b);
  }

  public static void main(String[] args) {
    System.out.println("hello");
  }
}
