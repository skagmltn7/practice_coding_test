import java.io.*;
import java.util.*;

public class BOJ_2587 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input;
    int total = 0;
    ArrayList<Integer> arr = new ArrayList<>();
    while ((input = br.readLine()) != null) {
      int num = Integer.valueOf(input);
      total += num;
      arr.add(num);
    }
    Collections.sort(arr);
    System.out.println(total / arr.size());
    System.out.println(arr.get(arr.size() / 2));
  }
}
