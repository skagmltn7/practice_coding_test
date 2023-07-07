package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_4299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int add = Integer.valueOf(st.nextToken());
        int subtract = Integer.valueOf(st.nextToken());
        int team1 = (add + subtract) / 2;
        int team2 = (add - subtract) / 2;
        if (add < subtract || team1 + team2 != add || team1 - team2 != subtract) System.out.println(-1);
        else {
            System.out.printf("%d %d", team1, team2);
        }
    }
}
