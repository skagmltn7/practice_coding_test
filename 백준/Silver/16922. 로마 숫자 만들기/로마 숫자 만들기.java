import java.io.*;
import java.util.*;

public class Main {

  static final int[] nums = {1, 5, 10, 50};

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Set<Integer> before = new HashSet<>();
    Set<Integer> after = new HashSet<>();
    before.add(0);
    int N = Integer.parseInt(br.readLine());
    while (N-- > 0) {
      for (int sums : before) {
        for (int num : nums) {
          after.add(sums + num);
        }
      }
      before = Set.copyOf(after);
      after.clear();
    }
    System.out.println(before.size());
  } // end of class
}// end of main