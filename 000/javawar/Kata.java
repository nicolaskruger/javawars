import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Kata {
  public static Map<Character, Integer> _count(String str) {
    Map<Character, Integer> freq = Arrays.stream(str.split("")) // Stream<String>
        .reduce(
            new HashMap<Character, Integer>(), // valor inicial
            (acc, curr) -> { // acumulador
              char ch = curr.charAt(0);
              acc.put(ch, acc.getOrDefault(ch, 0) + 1);
              return acc; // MUITO importante retornar o acumulador
            },
            (map1, map2) -> { // combinador (necessário para paralelismo)
              map2.forEach((k, v) -> map1.merge(k, v, Integer::sum));
              return map1;
            });

    return freq;
  }

  public static Map<Character, Integer> count(String str) {
    return str.chars().mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
        .entrySet()
        .stream()
        .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().intValue()));
  }
}
