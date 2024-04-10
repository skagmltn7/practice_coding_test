import java.io.*;
import java.util.*;

// dp

public class Main_17069 {
	private static int N;
	private static int[][] map;
	private static long[][][] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N + 2][N + 2];
		dp = new long[N + 2][N + 2][3];

		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 1; j <= N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		dp[1][2][0] = 1;
		for (int r = 1; r <= N; r++) {
			for (int c = 1; c <= N; c++) {
				// 현재블록이 벽인지 검사
				if (map[r][c] == 1)
					continue;
				// 벽처리
				// 가로 0
				dp[r][c][0] += dp[r][c - 1][0] + dp[r][c - 1][2];
				// 세로 1
				dp[r][c][1] += dp[r - 1][c][1] + dp[r - 1][c][2];
				// 대각선 2
				if(map[r-1][c]!=1&&map[r][c-1]!=1) {
					dp[r][c][2] += dp[r - 1][c - 1][0] + dp[r - 1][c - 1][1] + dp[r - 1][c - 1][2];
				}
			}
		}
		System.out.println(dp[N][N][0] + dp[N][N][1] + dp[N][N][2]);
	} // end of main
} // end of class
