import java.io.*;

public class BOJ_2581 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int m = Integer.valueOf(br.readLine());
    int n = Integer.valueOf(br.readLine());

    long res = 0;
    int min = 0;
    for (int i = m; i < n + 1; i++) {
      if (IsPrime(i)) {
        if (min == 0) {
          min = i;
        }
        res += i;
      }
    }

    System.out.println(res == 0 ? -1 : res + "\n" + min);
  }

  static boolean IsPrime(int n) {
    if (n == 1) return false;
    for (int i = 2; i < (int) (Math.pow(n, 0.5)) + 1; i++) {
      if (n % i == 0) return false;
    }
    return true;
  }
}
