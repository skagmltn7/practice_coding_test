package BOJ;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class BOJ_1271 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger total = new BigInteger(st.nextToken());
        BigInteger people = new BigInteger(st.nextToken());

        System.out.println(total.divide(people));
        System.out.println(total.remainder(people));
    }
}