import java.io.*;
import java.util.*;

public class Solution {

  static List<Number> four = new ArrayList<>();
  static List<Number> discount = new ArrayList<>();

  static class Number {

    int inx;
    long num;

    public Number(int inx, long num) {
      this.inx = inx;
      this.num = num;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(br.readLine());
    StringTokenizer st;
    for (int tc = 1; tc <= T; tc++) {
      int N = Integer.parseInt(br.readLine());
      boolean[] chk = new boolean[2 * N];

      st = new StringTokenizer(br.readLine(), " ");
      Number[] inputs = new Number[2 * N];
      for (int i = 0; i < 2 * N; i++) {
        inputs[i] = new Number(i, Long.parseLong(st.nextToken()));
        if (inputs[i].num % 4L == 0) {
          four.add(inputs[i]);
        } else {
          discount.add(inputs[i]);
        }
      }

      chkDiscount(chk, inputs);
      Collections.sort(discount,
          (n1, n2) -> Long.compare(n1.num, n2.num));
      printAns(sb, tc);
      four.clear();
      discount.clear();
    }
    System.out.println(sb);
  } // end of class

  private static void chkDiscount(boolean[] chk, Number[] inputs) {
    for (int i = four.size() - 1; i >= 0; i--) {
      Number cur = four.get(i);
      if (chk[cur.inx]) {
        continue;
      }
      chk[cur.inx] = true;
      long discountCost = (long) (cur.num * 0.75);
      int findInx = -1;
      if (discountCost % 4 == 0) {
        findInx = findDist(discountCost, i - 1, four, chk);
        discount.add(inputs[findInx]);
      } else {
        findInx = findDist(discountCost, discount.size() - 1, discount, chk);
      }
      chk[findInx] = true;
    }
  }

  private static void printAns(StringBuilder sb, int tc) {
    sb.append("#").append(tc).append(" ");
    for (Number cost : discount) {
      sb.append(cost.num).append(" ");
    }
    sb.append("\n");
  }

  private static int findDist(long target, int i, List<Number> list, boolean[] chk) {
    for (; i >= 0; i--) {
      Number discount = list.get(i);
      if (target == discount.num && !chk[discount.inx]) {
        return discount.inx;
      }
    }
    return -1;
  }
}// end of main