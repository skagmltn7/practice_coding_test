import java.io.*;
import java.util.StringTokenizer;

public class BOJ_13458 {

  static int N, B, C;
  static int[] A;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.valueOf(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    A = new int[N];

    for (int i = 0; i < N; i++) {
      A[i] = Integer.valueOf(st.nextToken());
    }

    st = new StringTokenizer(br.readLine());
    B = Integer.valueOf(st.nextToken());
    C = Integer.valueOf(st.nextToken());

    supervise();
  }

  static void supervise() {
    long answer = N;
    for (int i = 0; i < N; i++) {
      A[i] -= B;
      if (A[i] > 0) {
        answer += A[i] / C + (A[i] % C != 0 ? 1 : 0);
      }
    }
    System.out.println(answer);
  }
}
