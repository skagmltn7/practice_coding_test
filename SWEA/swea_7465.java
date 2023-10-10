import java.io.*;
import java.util.*;

/*
 * output: 무리의 개수
 * 1. 아이디어
 * 	양방향그래프
 * 	인접행렬
 * 	
 * */
public class Solution {
	private static int N,M,ans;
	private static int[][] graph;
	private static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			graph = new int[N+1][N+1];
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine()," ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				graph[a][b]=graph[b][a]=1;
			}
			ans = 0;
			visited = new boolean[N+1];
			for (int i = 1; i <= N; i++) {
				if(!visited[i]) {
					visited[i]=true;
					grouping(i);
					ans++;
				}
				
			}
			sb.append("#").append(tc).append(" ").append(ans).append("\n");
		}
		System.out.println(sb.toString());
	} // end of main

	private static void grouping(int num) {
		Queue<Integer> queue = new ArrayDeque<>();
		queue.offer(num);
		while(!queue.isEmpty()) {
			int cur = queue.poll();
			for (int i = 1; i <= N; i++) {
				if(graph[cur][i]==1 && !visited[i]){
					visited[i]=true;
					queue.offer(i);
				}
			}
		}
	}
} // end of class
