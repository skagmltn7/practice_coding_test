import java.io.*;
import java.util.*;

public class BOJ_10833 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    int res = 0;
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int students = Integer.valueOf(st.nextToken());
      int apples = Integer.valueOf(st.nextToken());
      res += apples % students;
    }
    System.out.println(res);
  }
}
