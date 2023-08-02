import java.io.*;
import java.util.*;

public class Main {
	static int m;
	static int n;
	static int[] nums;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		n = Integer.valueOf(st.nextToken());
		m = Integer.valueOf(st.nextToken());
		nums = new int[m];
		perm(0, 1);
		System.out.println(sb);
	}

	static void perm(int cnt, int start) {
		if (cnt == m) {
			for (int num : nums) {
				sb.append(num + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i = start; i <= n; i++) {
			nums[cnt] = i;
			perm(cnt + 1, i + 1);
		}
	}
}
