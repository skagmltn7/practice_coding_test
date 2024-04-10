package BOJ;
import java.io.*;
import java.math.BigInteger;

public class BOJ_8437 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger total = new BigInteger(br.readLine());
        BigInteger diff = new BigInteger(br.readLine());
        BigInteger klaudia = total.subtract(diff).divide(new BigInteger("2")).add(diff);

        System.out.printf("%d %d", klaudia, total.subtract(klaudia));
    }
}