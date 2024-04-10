import java.io.*;
import java.util.*;

/*
 * 1. 아이디어
 * - 부분조합
 * 
 * 
 */
public class BOJ_2961 {
	static int N;
	static long answer = Long.MAX_VALUE;
	static int[][] ingredient;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		ingredient = new int[N][2];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			ingredient[i][0] = Integer.parseInt(st.nextToken()); // 신맛
			ingredient[i][1] = Integer.parseInt(st.nextToken()); // 쓴맛
		}
		pickIngredient(0, 1, 0, 0);
		System.out.println(answer);
	}

	public static void pickIngredient(int inx, long sour, long bitter, int cnt) {
		if (inx == N) {
			if (cnt > 0) {
				long tmp = Math.abs(bitter - sour);
				if (answer > tmp) {
					answer = tmp;
				}
			}
			return;
		}
		pickIngredient(inx + 1, sour * ingredient[inx][0], bitter + ingredient[inx][1], cnt + 1);
		pickIngredient(inx + 1, sour, bitter, cnt);

	}
}
