package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_5341 {
    public static int calculate(int n) {
        if (n == 1) return 1;
        return calculate(n - 1) + n;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String cur = br.readLine();
            if (cur.equals("0")) break;
            int n = Integer.parseInt(cur);
            System.out.println(calculate(n));
        }
    }
}
