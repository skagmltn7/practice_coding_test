package BOJ;

import java.io.*;
import java.util.*;

public class BOJ_13866 {
    public static int getTeamDiff(int[] skills) {
        int res = Integer.MAX_VALUE;
        HashSet<Integer> player = new HashSet<>();
        for (int i = 1; i < 4; i++)
            player.add(i);
        int team1 = skills[0];
        int team2 = 0;
        for (int i = 1; i < 4; i++) {
            team1 += skills[i];
            player.remove(i);
            for (int p : player)
                team2 += skills[p];
            res = Integer.min(res, Math.abs(team1 - team2));
            team1 -= skills[i];
            player.add(i);
            team2 = 0;
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] skills = new int[4];
        for (int i = 0; i < 4; i++)
            skills[i] = Integer.valueOf(st.nextToken());

        System.out.println(getTeamDiff(skills));
    }
}
