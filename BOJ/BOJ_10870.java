import java.io.*;

public class BOJ_10870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());

		System.out.println(pibo(n));
	}

	static int pibo(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		int[] pibo = new int[n + 1];
		pibo[0] = 0;
		pibo[1] = 1;

		for (int i = 2; i < pibo.length; i++) {
			pibo[i] = pibo[i - 1] + pibo[i - 2];
		}
		return pibo[n];
	}
}
