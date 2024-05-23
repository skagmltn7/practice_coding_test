import java.io.*;
import java.util.*;

public class Main {

  static int H, W, N, M;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    H = Integer.parseInt(st.nextToken());
    W = Integer.parseInt(st.nextToken());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    int y = (H - 1) / (N + 1) + 1;
    int x = (W - 1) / (M + 1) + 1;
    System.out.println(y * x);
  } // end of main
} // end of class