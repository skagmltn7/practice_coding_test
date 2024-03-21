import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int N = Integer.parseInt(st.nextToken());
    int X = Integer.parseInt(st.nextToken());

    int[] arr = new int[N + 1];
    st = new StringTokenizer(br.readLine(), " ");
    for (int i = 1; i <= N; i++) {
      arr[i] = Integer.parseInt(st.nextToken()) + arr[i - 1];
    }
    int start = 0;
    int answer = 0;
    int cnt = 0;
    for (; X <= N; X++, start++) {
      int sum = arr[X] - arr[start];
      if (answer < sum) {
        answer = sum;
        cnt = 1;
      } else if (answer == sum) {
        cnt++;
      }
    }
    StringBuilder sb = new StringBuilder();
    if (answer == 0) {
      System.out.println("SAD");
    } else {
      sb.append(answer)
          .append("\n")
          .append(cnt);
      System.out.println(sb.toString());
    }
  } // end of class
}// end of main