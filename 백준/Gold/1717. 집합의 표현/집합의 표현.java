import java.io.*;
import java.util.*;

public class Main {

  static int[] arr, rank;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    arr = new int[n + 1];
    for (int i = 0; i <= n; i++) {
      arr[i] = i;
    }
    rank = new int[n + 1];
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      String op = st.nextToken();
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      switch (op) {
        case "0":
          union(a, b);
          break;
        case "1":
          sb.append(find(a) == find(b) ? "YES\n" : "NO\n");
      }
    }
    System.out.println(sb.toString());
  } // end of class

  private static int find(int a) {
    if (arr[a] == a) {
      return a;
    }
    return arr[a] = find(arr[a]);
  }

  private static void union(int a, int b) {
    a = find(a);
    b = find(b);
    if (a == b) {
      return;
    }
    if (rank[a] < rank[b]) {
      arr[a] = b;
    } else {
      arr[b] = a;
      if (rank[a] == rank[b]) {
        rank[a]++;
      }
    }
  }
}// end of main