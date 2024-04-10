import java.io.*;
import java.util.*;

public class Main {
	static int m;
	static int n;
	static int[] nums;
	static boolean[] chk;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		n = Integer.valueOf(st.nextToken());
		m = Integer.valueOf(st.nextToken());
		nums = new int[m];
		chk = new boolean[n + 1];
		perm(0);
		System.out.println(sb);
	}

	static void perm(int cnt) {
		if (cnt == m) {
			for (int num : nums) {
				sb.append(num + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (chk[i])
				continue;
			chk[i] = true;
			nums[cnt] = i;
			perm(cnt + 1);
			chk[i] = false;
		}
	}
}
