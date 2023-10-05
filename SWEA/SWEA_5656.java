import java.io.*;
import java.util.*;

public class Solution {
	private static int N,W,H,ans,delete;
	private static Queue<Plot> queue = new ArrayDeque<>();
	private static int total;
	private static int[] dr = {-1,0,1,0};
	private static int[] dc = {0,1,0,-1};
	
	static class Plot{
		int r;
		int c;
		public Plot(int r, int c) {
			super();
			this.r = r;
			this.c = c;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			ans = H*W; // 남은 벽돌의 개수
			total = 0; // 벽돌갯수
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			N = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			H = Integer.parseInt(st.nextToken());
			// 맵 입력받기
			int[][] map = new int[H][W];
			for (int i = 0; i < H; i++) {
				st = new StringTokenizer(br.readLine()," ");
				for (int j = 0; j < W; j++) {
					map[i][j]=Integer.parseInt(st.nextToken());
					if(map[i][j]!=0) {
						total++;
					}
				}
			}
			crash(0,map,total);
			sb.append("#").append(tc).append(" ").append(ans).append("\n");
		}
		System.out.println(sb.toString());
	} // end of main

	private static boolean crash(int stage,int[][] map,int remain) {
		if(remain==0) {
			ans = 0;
			return true;
		}
		if(stage==N) {
			// 깨진 벽돌 수
			if(ans>remain) {
				ans = remain;
			}
			return false;
		}
		// 맨위 벽돌찾기
		for (int i = 0; i < W; i++) {
			for (int j = 0; j < H; j++) {
				if(map[j][i]!=0) {
					queue.add(new Plot(j,i));
					// 구슬 던지기
					delete = 0;
					int[][] after =  shoot(copy(map));
					// 깨지는 벽돌구하기
					if(crash(stage+1,after,remain - delete))return true;
				}
			}
		}
		return false;
		
	}

	private static int[][] shoot(int[][] map) {
		while(!queue.isEmpty()) {
			Plot cur = queue.poll();
			delete++;
			// 벽돌터지기
			if(map[cur.r][cur.c]!=1) { // 벽돌이 1이면 자기자신만 터짐
				// 터지는애들 모으기
				pang(map,cur);
			}
			map[cur.r][cur.c]=0;
		}
		// 맵다지기
		return afterPang(map);
	}


	private static int[][] afterPang(int[][] map) {
		Stack<Integer>stack = new Stack<>();
		for (int i = 0; i < W; i++) {
			for (int j = 0; j < H; j++) {
				if(map[j][i]!=0) {
					stack.add(map[j][i]);
				}
			}
			for (int j = H-1; j >= 0; j--) {
				if(stack.isEmpty()) {
					map[j][i]=0;
				}
				else{map[j][i] = stack.pop();}
			}
		}
		return map;
	}

	private static void pang(int[][] map, Plot block) {
		int cnt = map[block.r][block.c];
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < cnt; j++) {
				int r=block.r+dr[i]*j;
				int c=block.c+dc[i]*j;
				if(r<0 || r>=H || c<0||c>=W) break;
				if(map[r][c]!=0) {
					queue.add(new Plot(r,c));
				}
			}
		}
	}

	private static int[][] copy(int[][] map) {
		int[][] copyMap = new int[H][W];
		for (int i = 0; i < H; i++) {
			System.arraycopy(map[i], 0, copyMap[i], 0, W);
		}
		return copyMap;
	}

} // end of class
