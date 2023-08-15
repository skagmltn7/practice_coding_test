import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ_2210 {
	static HashSet<String> chk = new HashSet<>();
	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, 1, 0, -1 };
	static int[][] board = new int[5][5];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		board = new int[5][5];

		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				dfs(i, j, 0, "" + board[i][j]);
			}
		}
		System.out.println(chk.size());

	} // end of main

	private static void dfs(int y, int x, int cnt, String str) {
		if (cnt == 5) {
			chk.add(str);
			return;
		}
		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			if (ny >= 0 && ny < 5 && nx >= 0 && nx < 5) {
				dfs(ny, nx, cnt + 1, str + board[ny][nx]);
			}
		}
	}

} // end of class
