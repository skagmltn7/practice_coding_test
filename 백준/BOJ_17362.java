package BOJ;

import java.io.*;

public class BOJ_17362 {
    public static long findFirst(long n) {
        long i = 1;
        while (n > (8 * i - 8)) {
            i++;
        }
        return 8 * (i - 1) - 7;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.valueOf(br.readLine());
        long firstA = findFirst(n);
        int th = (int) (n - firstA + 1);
        if (th > 5) {
            System.out.println(5 - (th - 5));
        } else {
            System.out.println(th);
        }
    }
}
