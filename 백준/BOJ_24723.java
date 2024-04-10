package BOJ;
import java.io.*;

public class BOJ_24723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        System.out.println((int) Math.pow(2, n));
    }
}
