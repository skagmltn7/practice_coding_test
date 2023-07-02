package BOJ;
import java.io.*;

public class BOJ_8871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) + 1;
        System.out.printf("%d %d", 2 * n, 3 * n);
    }
}
