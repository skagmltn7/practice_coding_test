import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ_17406 {
	private static int N;
	private static int M;
	private static int R;
	private static int[] dr = { 0, 1, 0, -1 };
	private static int[] dc = { 1, 0, -1, 0 };
	private static int[][] map;
	private static ArrayList<int[]> cases = new ArrayList<>();
	private static HashSet<Integer> used = new HashSet<Integer>();
	private static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());

		map = new int[N + 2][M + 2];
		for (int i = 1; i <= N; i++) { // 배열 입력받기
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 1; j <= M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < R; i++) { // 회전연산(r-s,c-s) ~ (r+s,c+s)
			st = new StringTokenizer(br.readLine(), " ");
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			cases.add(new int[] {r,c,s});
			used.add(i);
		}
		permCase(map);
		// 케이스 순열
		System.out.println(min);
		
	} // end of main
		
	private static void permCase(int[][] map) {
		if(used.size()==0) {
			min = Math.min(min, findMinRowSum(map));
			// 행의 최소합
			return;
		}
		for(int i=0;i<cases.size();i++) {
			if(used.contains(i)) {
				used.remove(i);
				int r = cases.get(i)[0];
				int c = cases.get(i)[1];
				int s = cases.get(i)[2];
				permCase(rotate(r, c, s, 0, copy(map)));
				used.add(i);
			}
		}
	}
	
	private static void printArr(int[][] map) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				sb.append(map[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	
	private static int[][] copy(int[][] map) {
		int n = map.length;
		int m = map[0].length;
		int[][] copy = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				copy[i][j] = map[i][j];
			}
		}
		return copy;
	}

	private static int findMinRowSum(int[][] map) {
		int min = Integer.MAX_VALUE;
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=M;j++) {
				map[i][j] += map[i][j-1];
			}
			min = Math.min(min, map[i][M]);
		}
		return min;
	}

	private static int[][] rotate(int r, int c, int s, int d, int[][] map) {
		if(d == (2 * s + 1) / 2) {
			return map;
		}
		int inx = 0;
		int startR = r - s + d;
		int startC = c - s + d;
		int endR = r + s - d;
		int endC = c + s - d;
		int curR = startR;
		int curC = startC;
		int before = map[curR][curC];
		int move = 2*(endR - startR) + 2*(endC - startC) +1;
		while(move>0){
			int nr = curR + dr[inx];
			int nc = curC + dc[inx];
			if (startR > nr || nr > endR || startC > nc || endC < nc) {
				inx = (inx+1)%4;
				nr = curR + dr[inx];
				nc = curC + dc[inx];
			}
			int tmp = map[nr][nc];
			map[nr][nc] = before;
			before = tmp;
			curR = nr;
			curC = nc;
			move--;
		}
		return rotate(r, c, s, d + 1,map);
	}
} // end of class
