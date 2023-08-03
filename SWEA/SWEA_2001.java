import java.io.*;
import java.util.*;

public class SWEA_2001 {
	static int N, M;
	static int[][] dp;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			dp = new int[N + 1][N + 1];

			for (int i = 1; i <= N; i++) {
				st = new StringTokenizer(br.readLine()," ");
				for (int j = 1; j <= N; j++) {
					dp[i][j] = dp[i - 1][j] + dp[i][j - 1] + Integer.parseInt(st.nextToken()) - dp[i - 1][j - 1];
				}
			}
			sb.append("#").append(tc).append(" ").append(flyflapping()).append("\n");
		}
		System.out.println(sb);
	}// end of main

	static int flyflapping() {
		int res = Integer.MIN_VALUE;
		
		for (int i = 1; i <= N - M + 1; i++) {
			for (int j = 1; j <= N - M + 1; j++) {
				int cnt = dp[i + M - 1][j + M - 1] - dp[i + M - 1][j - 1] - dp[i - 1][j + M - 1] + dp[i - 1][j - 1];
				if (res < cnt) {
					res = cnt;
				}
			}
		}
		return res;
	}

}// end of class
