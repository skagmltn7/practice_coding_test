package BOJ;
import java.io.*;

public class BOJ_11948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        int minScore = Integer.MAX_VALUE;
        int num = 0;
        for (int i = 0; i < 6; i++) {
            num = Integer.valueOf(br.readLine());
            minScore = Integer.min(minScore, num);
            total += num;
            if (i == 3) {
                total -= minScore;
                minScore = Integer.MAX_VALUE;
            }
        }
        System.out.println(total - minScore);
    }
}
