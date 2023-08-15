import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] fightVal = new int[N];
		for (int i = 0; i < N; i++) {
			fightVal[i] = Integer.parseInt(st.nextToken());
		}

		int[] dp = new int[N];
		Arrays.fill(dp,1);
		int answer = 1;
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < i; j++) {
				if(fightVal[j]>fightVal[i]) {
					dp[i] = Math.max(dp[i],dp[j] + 1);
				}
			}
			answer = Math.max(answer, dp[i]);
		}
		System.out.println(N-answer);
	} // end of main

} // end of class
