import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2630 {
	private static int[][] map;
	private static int white =0, blue=0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		for (int i = 0; i < N; i++) { // 맵 입력받기
			String st = br.readLine();
			for (int j = 0, inx = 0; j < N; j++, inx+=2) {
				map[i][j] = st.charAt(inx)-'0';
			}
		}
		
		chkColor(0,0,N);
		StringBuilder sb = new StringBuilder();
		sb.append(white).append("\n").append(blue).append("\n");
		System.out.println(sb.toString());
	} // end of main

	private static void chkColor(int sr, int sc, int n) {
		int sum = 0;
		for (int i = sr; i < sr+n; i++) { // 맵 색깔 체크하기
			for (int j = sc; j < sc+n; j++) {
				sum += map[i][j];
			}
		}
		if(sum==0) {
			white ++;
		}else if(sum == n*n) {
			blue++;
		}else {
			int half = n/2;
			chkColor(sr, sc, half); // 1
			chkColor(sr, sc+half, half); // 2
			chkColor(sr+half, sc, half); // 3
			chkColor(sr+half, sc+half, half); // 4
		}
	}
} // end of class
