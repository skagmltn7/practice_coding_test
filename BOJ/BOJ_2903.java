import java.io.*;

public class BOJ_2903 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    System.out.println((long) Math.pow(Math.pow(2, n) + 1, 2));
  }
}
