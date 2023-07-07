package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] change2Sec = {3600, 60, 1};
        int totalSec = 0;
        for (int i = 0; i < 3; i++) {
            totalSec += Integer.valueOf(st.nextToken()) * change2Sec[i];
        }

        totalSec += Integer.valueOf(br.readLine());

        int sec2Self = 0;
        for (int i = 0; i < 3; i++) {
            sec2Self = totalSec / change2Sec[i];
            if (i == 0) sec2Self %= 24;
            System.out.printf("%d ", sec2Self);
            totalSec %= change2Sec[i];
        }
    }
}
