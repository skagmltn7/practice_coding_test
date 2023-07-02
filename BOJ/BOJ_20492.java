package BOJ;
import java.io.*;

public class BOJ_20492 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int ans1 = (int) (n * 0.78);
        int ans2 = (int) (n - n * 0.2 * 0.22);
        System.out.printf("%d %d", ans1, ans2);
    }
}