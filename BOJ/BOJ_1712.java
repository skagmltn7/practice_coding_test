import java.io.*;
import java.util.*;

public class BOJ_1712 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] input = new int[3];
    for (int i = 0; i < 3; i++) {
      input[i] = Integer.valueOf(st.nextToken());
    }
    if (input[1] >= input[2]) {
      System.out.println(-1);
    } else {
      System.out.println(input[0] / (input[2] - input[1]) + 1);
    }
  }
}
