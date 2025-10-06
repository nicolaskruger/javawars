import java.util.stream.IntStream;

public class NthSeries {
  public static String seriesSum(int n) {
    double sum = 0;

    for (double i = 0; i < n; i++)
      sum += (double) (1.0 / (1.0 + 3.0 * i));

    sum = Math.round(sum * 100) / 100.;
    return String.format("%.2f", sum);
  }

  public static String nice(int n) {
    return String.format("%.2f", IntStream.range(0, n).mapToDouble(x -> 1.0 / (3 * x + 1)).sum());
  }

  public static String cool(int n) {
    return String.format("%.2f", IntStream.iterate(1, e -> e + 3)
        .limit(n)
        .mapToDouble(x -> (1.0 / x))
        .sum());
  }
}
