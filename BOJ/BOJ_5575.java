package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_5575 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] change2Sec = {3600, 60, 1};
        int[] time;
        int answer;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            time = new int[2];

            for (int j = 0; j < 6; j++) {
                time[j / 3] += Integer.valueOf(st.nextToken()) * change2Sec[j % 3];
            }
            answer = time[1] - time[0];
            for (int z = 0; z < 3; z++) {
                System.out.printf("%d ", answer / change2Sec[z]);
                answer %= change2Sec[z];
            }
            System.out.println();
        }
    }
}
