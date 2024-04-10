import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_5427 {
	private static int w;
	private static int h;
	private static char[][] map;
	private static Queue<Plot> fireQ;
	private static Queue<Plot> sangQ;
	private static int[] dr = { -1, 0, 1, 0 };
	private static int[] dc = { 0, 1, 0, -1 };
	private static boolean[][] visited;

	static class Plot {
		int r;
		int c;

		public Plot(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());

			map = new char[h + 2][w + 2];
			visited = new boolean[h + 2][w + 2];
			fireQ = new ArrayDeque<Plot>();
			sangQ = new ArrayDeque<Plot>();

			for (int r = 1; r <= h; r++) {
				String str = br.readLine();
				for (int c = 1; c <= w; c++) {
					char tmp = str.charAt(c - 1);
					// map 입력받기
					switch (tmp) {
					case '@':
						map[r][c] = '.';
						visited[r][c] = true;
						sangQ.add(new Plot(r, c));
						break;
					case '*':
						fireQ.add(new Plot(r, c));
					default:
						map[r][c] = tmp;
					}
				}
			}
			escape(sb);
		}
		System.out.println(sb.toString());
	} // end of main

	private static void escape(StringBuilder sb) {
		int time = 1;
		while (!fireQ.isEmpty()||!sangQ.isEmpty()) {
			int fireSize = fireQ.size();
			int sangSize = sangQ.size();
			spreadFire(fireSize);
			if (move(sangSize)) {
				sb.append(time).append('\n');
				return;
			}
			time++;
		}
		sb.append("IMPOSSIBLE").append("\n");
	}

	private static boolean move(int size) {
		while (size != 0) {
			Plot sang = sangQ.poll();
			for (int i = 0; i < 4; i++) {
				int nr = sang.r + dr[i];
				int nc = sang.c + dc[i];
				if (map[nr][nc] == '\u0000') {
					return true;
				}
				if (map[nr][nc] == '.' && !visited[nr][nc]) {
					visited[nr][nc] = true;
					sangQ.offer(new Plot(nr, nc));
				}
			}
			size--;
		}
		return false;
	}

	private static void spreadFire(int size) {
		while (size != 0) {
			Plot cur = fireQ.poll();
			for (int i = 0; i < 4; i++) {
				int nr = cur.r + dr[i];
				int nc = cur.c + dc[i];
				if (map[nr][nc] == '.') {
					map[nr][nc] = '*';
					fireQ.offer(new Plot(nr, nc));
				}
			}
			size--;
		}
	}

} // end of class
