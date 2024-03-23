import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N];
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr);
    int left = 0;
    int right = N - 1;
    int min = Integer.MAX_VALUE;
    int[] answer = new int[2];
    while (left < right) {
      int sum = arr[left] + arr[right];
      if (Math.abs(sum) < min) {
        min = Math.abs(sum);
        answer[0] = arr[left];
        answer[1] = arr[right];
      }
      if (sum < 0) {
        left++;
      } else {
        right--;
      }
    }
    StringBuilder sb = new StringBuilder();
    sb.append(answer[0]).append(" ").append(answer[1]);
    System.out.println(sb.toString());
  } // end of class
}// end of main