
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Other {
  public static Map<Character, Integer> count(String str) {
    return str
        .chars()
        .mapToObj(character -> (char) character)
        .collect(Collectors.toMap(character -> character, character -> 1, Integer::sum));
  }

  public static Map<Character, Integer> _count(String s) {
    Map<Character, Integer> M = new HashMap();
    for (char c : s.toCharArray())
      M.put(c, M.getOrDefault(c, 0) + 1);
    return M;
  }
}
