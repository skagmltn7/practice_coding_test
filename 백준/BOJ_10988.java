import java.io.*;

public class BOJ_10988 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    System.out.println(IsPaline(input) ? 1 : 0);
  }

  static boolean IsPaline(String s) {
    int len = s.length();
    for (int i = 0; i < len / 2; i++) {
      if (s.charAt(i) != s.charAt(len - 1 - i)) return false;
    }
    return true;
  }
}
