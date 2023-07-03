package BOJ;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class BOJ_27434 {
    public static BigInteger factorial(int a, int n) {
        if (n == 1 || n == 0) return BigInteger.ONE;
        if (a < n) {
            int b = (a + n) / 2;
            return factorial(a, b).multiply(factorial(b + 1, n));
        }
        return BigInteger.valueOf(n);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(factorial(1, n));
    }
}
