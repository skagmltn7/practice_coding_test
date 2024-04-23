import java.io.*;
import java.util.*;

public class Main {

  static int[] nums;
  static List<Integer> ans;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    nums = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      nums[i] = Integer.parseInt(br.readLine());
    }

    ans = new ArrayList<>();
    boolean[] visited = new boolean[N + 1];
    for (int i = 1; i <= N; i++) {
      visited[i] = true;
      dfs(visited, i, i);
      visited[i] = false;
    }

    StringBuilder sb = new StringBuilder();
    sb.append(ans.size()).append("\n");
    Collections.sort(ans);
    for (int n : ans) {
      sb.append(n).append("\n");
    }
    System.out.println(sb);
  } // end of class

  static void dfs(boolean[] visited, int start, int target) {
    if (!visited[nums[start]]) {
      visited[nums[start]] = true;
      dfs(visited, nums[start], target);
      visited[nums[start]] = false;
    }
    if (nums[start] == target) {
      ans.add(target);
    }
  }
}// end of main