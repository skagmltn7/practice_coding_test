import java.io.*;
import java.util.*;

public class BOJ_2476 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    HashSet<Integer> dice = new HashSet<>();
    int answer = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int totalMaxVal = Integer.MIN_VALUE;
      int maxVal = Integer.MIN_VALUE;

      for (int j = 0; j < 3; j++) {
        int num = Integer.valueOf(st.nextToken());
        if (dice.add(num)) {
          maxVal = Integer.max(maxVal, num);
        }
        totalMaxVal = Integer.max(totalMaxVal, num);
      }
      int res = 0;
      switch (dice.size()) {
        case 3:
          res = totalMaxVal * 100;
          break;
        case 2:
          res = maxVal * 100 + 1000;
          break;
        case 1:
          res = maxVal * 1000 + 10000;
      }
      answer = Math.max(answer, res);
      dice.clear();
    }
    System.out.println(answer);
  }
}
