import java.io.*;
import java.util.*;

public class BOJ_1009 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.valueOf(br.readLine());

    for (int i = 1; i < T + 1; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.valueOf(st.nextToken());
      int b = Integer.valueOf(st.nextToken());
      int answer = 1;
      for (int j = 0; j < b; j++) {
        answer = (answer * a) % 10;
      }
      System.out.println(answer == 0 ? 10 : answer);
    }
  }
}
