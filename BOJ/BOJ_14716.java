import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_14716 {
	
	private static int N;
	private static int M;
	private static boolean[][] banner;
	private static int[] dr = {-1,-1,-1,0,0,1,1,1};
	private static int[] dc = {-1,0,1,-1,1,-1,0,1};
	private static boolean[][] visited;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		banner = new boolean[N+2][M+2];
		visited = new boolean[N+2][M+2];
		
		for(int i=1;i<=N;i++) {
			String str = br.readLine();
			for(int j=1, inx=0;j<=M;j++,inx+=2) {
				banner[i][j] = str.charAt(inx)=='0'?false:true;
			}
		}
		int cnt = 0;
		Queue<int[]> queue = new ArrayDeque<int[]>();
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=M;j++) {
				if(banner[i][j]&&!visited[i][j]) {
					visited[i][j]=true;
					queue.offer(new int[] {i,j});
					bfs(queue);
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	} // end of main

	private static void bfs(Queue<int[]> queue) {
		while(!queue.isEmpty()) {
			int[] plot = queue.poll();
			for(int i=0;i<8;i++) {
				int nr = plot[0] + dr[i];
				int nc = plot[1] + dc[i];
				if(banner[nr][nc] && !visited[nr][nc]) {
					visited[nr][nc] = true;
					queue.offer(new int[] {nr,nc});
				}
			}
		}
	}

	
} // end of class
