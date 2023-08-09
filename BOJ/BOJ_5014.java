import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_5014 {

	private static int G;
	private static int U;
	private static int D;
	private static int F;
	private static int S;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		F = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		G = Integer.parseInt(st.nextToken());
		U = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());

		useElevator();
	}// end of main

	private static void useElevator() {

		class Floor {
			int floor;
			int cnt;

			public Floor(int floor, int cnt) {
				this.floor = floor;
				this.cnt = cnt;
			}

		}
		Queue<Floor> queue = new ArrayDeque<>();
		boolean[] visited = new boolean[F + 1];
		int[] button = { U, -D };

		visited[S] = true;
		queue.offer(new Floor(S, 0));
		while (!queue.isEmpty()) {
			Floor cur = queue.poll();
			if (cur.floor == G) {
				System.out.println(cur.cnt);
				return;
			}
			for (int i = 0; i < 2; i++) {
				int nxt = cur.floor + button[i];
				if (1 <= nxt && nxt <= F && !visited[nxt]) {
					visited[nxt] = true;
					queue.offer(new Floor(nxt, cur.cnt + 1));
				}
			}
		}
		System.out.println("use the stairs");
	}
}// end of class
