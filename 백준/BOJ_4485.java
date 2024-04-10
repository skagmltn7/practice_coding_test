import java.io.*;
import java.util.*;

public class Main {
	private static int N,ans;
	private static int[][] map;
	private static boolean[][] visited;
	static int[] dy = {-1,0,1,0};
	static int[] dx = {0,1,0,-1};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for (int tc = 1;; tc++) {
			N = Integer.parseInt(br.readLine());
			if(N==0)break;
			map = new int[N][N];
			visited = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine()," ");
				for (int j = 0; j < N; j++) {
					map[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			ans = 0;
			bfs();
			sb.append("Problem ").append(tc).append(": ").append(ans).append("\n");
		}
		System.out.println(sb.toString());
	} // end of main

	private static void bfs() {
		PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.cost));
		pq.offer(new Node(0,0,map[0][0]));
		while(!pq.isEmpty()) {
			Node cur = pq.poll();
			if(visited[cur.y][cur.x])continue;
			if(cur.y==N-1 && cur.x==N-1) {
				ans = cur.cost;
				return;
			}
			visited[cur.y][cur.x]=true;
			for (int i = 0; i < 4; i++) {
				int ny = cur.y + dy[i];
				int nx = cur.x + dx[i];
				if(0<=ny&&ny<N&&0<=nx&&nx<N&&!visited[ny][nx]) {
					pq.offer(new Node(ny,nx,cur.cost+map[ny][nx]));
				}
			}
		}
	}
	static class Node{
		int y;
		int x;
		int cost;
		Node(int y, int x, int cost){
			this.y = y;
			this.x = x;
			this.cost=cost;
		}
	}
}// end of class
