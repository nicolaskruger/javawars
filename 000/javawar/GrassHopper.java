public class GrassHopper {
  public static int summation(int n) {
    if (n == 0)
      return 0;
    return n + summation(--n);
  }

  public static int _summation(int n) {

    return n * (n + 1) / 2;
  }
}
