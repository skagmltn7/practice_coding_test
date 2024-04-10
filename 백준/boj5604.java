import java.io.*;
import java.util.*;

public class Solution_5604 {
	private static long[] cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			long start = Long.parseLong(st.nextToken());
			long end = Long.parseLong(st.nextToken());
			cnt = new long[10];
			long place = 1;
			while (start <= end) {
				// start 끝자리 9맞추기
				for (; start <= end && start % 10 != 0; start++) {
					addPlace(start, place);
				}
				// end 끝자리 0맞추기
				for (; start <= end && end % 10 != 9; end--) {
					addPlace(end, place);
				}
				// start, end 범위체크
				if (start > end)
					break;
				// 앞자리 수 cnt
				start /= 10;
				end /= 10;
				long diff = end - start + 1;
				for (int i = 0; i <= 9; i++) {
					cnt[i]+=place*diff;
				}
				place*=10;
			}
			// 정답계산
			long ans = 0;
			for (int i = 0; i <= 9; i++) {
				ans += cnt[i]*i;
			}
			sb.append("#").append(tc).append(" ").append(ans).append("\n");
		}
		System.out.println(sb.toString());

	} // end of main

	private static void addPlace(long num, long place) {
		for (; num > 0; num /= 10) {
			cnt[(int) (num % 10)] += place;
		}
	}
} // end of class
