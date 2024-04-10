import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_6593 {
	private static int L;
	private static int R;
	private static int C;
	private static char[][][] building;
	private static boolean[][][] visited;
	private static int[] dz = { 0, 0, 0, 0, -1, 1 };
	private static int[] dy = { 1, -1, 0, 0, 0, 0 };
	private static int[] dx = { 0, 0, -1, 1, 0, 0 };
	private static Queue<Pointer> queue;

	private static class Pointer {
		int z;
		int y;
		int x;
		int time;

		public Pointer(int z, int y, int x, int time) {
			super();
			this.z = z;
			this.y = y;
			this.x = x;
			this.time = time;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			String str = br.readLine();
			if (str.equals("0 0 0")) {
				break;
			}
			StringTokenizer st = new StringTokenizer(str, " ");
			L = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());

			building = new char[L + 2][R + 2][C + 2];
			visited = new boolean[L + 2][R + 2][C + 2];
			queue = new ArrayDeque<Pointer>();

			for (int i = 1; i <= L; i++) {
				for (int j = 1; j <= R; j++) {
					str = br.readLine();
					for (int k = 1; k <= C; k++) {
						char c = str.charAt(k-1);
						if (c == 'S') {
							queue.offer(new Pointer(i, j, k, 0));
							visited[i][j][k] = true;
							c = '.';
						}
						building[i][j][k] = c;
					}
				}
				br.readLine();
			}
			bfs(sb);
		}
		System.out.println(sb.toString());
	} // end of main

	private static void bfs(StringBuilder sb) {
		while (!queue.isEmpty()) {
			Pointer cur = queue.poll();
			for(int i=0;i<6;i++) {
				int nz = cur.z + dz[i];
				int ny = cur.y + dy[i];
				int nx = cur.x + dx[i];
				
				if(!visited[nz][ny][nx]) {
					switch(building[nz][ny][nx]) {
					case '.':
						visited[nz][ny][nx] = true;
						queue.offer(new Pointer(nz,ny,nx,cur.time+1));
						break;
					case 'E':
						sb.append("Escaped in ").append(cur.time+1).append(" minute(s).\n");
						return;
					}
				}
			}
		}
		sb.append("Trapped!\n");
	}

} // end of class
