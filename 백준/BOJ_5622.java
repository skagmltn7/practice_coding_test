import java.io.*;
import java.util.*;

public class BOJ_5622 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    int time = 0;
    for (int i = 0; i < input.length(); i++) {
      int num = getSec(input.charAt(i)) + 2;
      time += num + 1;
    }
    System.out.println(time);
  }

  static int getSec(char c) {
    if (c == 'Z') return 7;
    int tmp = c - 'A';
    int sec = tmp / 3;
    if (sec > 5 && tmp % 3 == 0) {
      sec -= 1;
    }
    return sec;
  }
}
