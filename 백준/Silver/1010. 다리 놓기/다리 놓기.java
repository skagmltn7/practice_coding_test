import java.io.*;
import java.util.*;

public class Main {

  static int[][] mem;
  static ArrayDeque<Integer> arr = new ArrayDeque<>();
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    int N, M;
    for (int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      N = Integer.parseInt(st.nextToken());
      M = Integer.parseInt(st.nextToken());
      mem = new int[M][N];
      for (int j = 0; j < M; j++) {
        Arrays.fill(mem[j], -1);
      }
      sb.append(combi(M,N)).append("\n");
    }
    System.out.println(sb);
  } // end of class
  public static int combi(int n, int r) {
    if(r == 0 || n == r) {
      return 1;
    }
    if (mem[n - 1][r - 1] != -1) {
      return mem[n - 1][r - 1];
    }
    return mem[n - 1][r - 1] = combi(n - 1, r - 1) + combi(n - 1, r);
  }
}// end of main