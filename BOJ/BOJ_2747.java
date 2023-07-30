import java.io.*;

public class BOJ_2747 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    System.out.println(pibo(n));
  }

  static int pibo(int n) {
    if (n == 0 || n == 1) return n;
    int[] piboNum = new int[n + 1];
    piboNum[0] = 0;
    piboNum[1] = 1;
    for (int i = 2; i < n + 1; i++) {
      piboNum[i] = piboNum[i - 1] + piboNum[i - 2];
    }
    return piboNum[n];
  }
}
