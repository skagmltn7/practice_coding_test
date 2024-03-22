import java.io.*;
import java.util.*;

public class Main {

  static int[] arr, rank;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    arr = new int[N + 1];
    rank = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      arr[i] = i;
    }

    StringTokenizer st;
    for (int i = 0; i < N - 2; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      union(a, b);
    }
    StringBuilder sb = new StringBuilder();
    int r1 = find(1);
    sb.append(r1).append(" ");
    for (int i = 2; i <= N; i++) {
      int r2 = find(i);
      if (r1 != r2) {
        sb.append(r2);
        break;
      }
    }
    System.out.println(sb);
  } // end of class

  public static void union(int a, int b) {
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

  private static int find(int a) {
    if (arr[a] == a) {
      return a;
    }
    return arr[a] = find(arr[a]);
  }
}// end of main