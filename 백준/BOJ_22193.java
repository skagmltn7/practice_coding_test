package BOJ;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class BOJ_22193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());
        System.out.println(a.multiply(b));
    }
}
