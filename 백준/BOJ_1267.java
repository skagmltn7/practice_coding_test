import java.io.*;
import java.util.*;

public class BOJ_1267 {

  static int[] call = new int[2];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {
      int time = Integer.valueOf(st.nextToken());
      Ycall(time);
      Mcall(time);
    }

    if (call[0] < call[1]) {
      System.out.println("Y " + call[0]);
    } else if (call[0] == call[1]) {
      System.out.println("Y M " + call[0]);
    } else {
      System.out.println("M " + call[1]);
    }
  }

  static void Ycall(int time) {
    call[0] += (time / 30 + 1) * 10;
  }

  static void Mcall(int time) {
    call[1] += (time / 60 + 1) * 15;
  }
}
