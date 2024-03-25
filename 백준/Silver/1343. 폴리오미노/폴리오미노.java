import java.io.*;
import java.util.*;

public class Main {

  static final String four = "AAAA";
  static final String two = "BB";

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    char[] arr = new char[input.length() + 1];
    for (int i = 0; i < input.length(); i++) {
      arr[i] = input.charAt(i);
    }
    arr[input.length()] = '.';
    StringBuilder sb = new StringBuilder();
    System.out.println(makeBoard(arr));
  } // end of class

  private static String makeBoard(char[] arr) {
    int left = 0;
    int right = 0;
    StringBuilder sb = new StringBuilder();
    while (right < arr.length && left < arr.length) {
      if (arr[right] == '.') {
        int len = right - left;
        if (len % 2 == 0) {
          for (int i = 0; i < len / 4; i++) {
            sb.append(four);
          }
          len %= 4;
          for (int i = 0; i < len / 2; i++) {
            sb.append(two);
          }
          left = right + 1;
          sb.append(arr[right]);
        } else {
          return "-1";
        }
      }
      right++;
    }
    sb.setLength(sb.length() - 1);
    return sb.toString();
  }
}// end of main