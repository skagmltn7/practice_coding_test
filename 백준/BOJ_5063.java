import java.io.*;
import java.util.*;

public class BOJ_5063 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int[] input = new int[3];
      for (int j = 0; j < 3; j++) {
        input[j] = Integer.valueOf(st.nextToken());
      }
      int ad = input[1] - input[2];
      if (input[0] > ad) {
        System.out.println("do not advertise");
      } else if (input[0] == ad) {
        System.out.println("does not matter");
      } else {
        System.out.println("advertise");
      }
    }
  }
}
