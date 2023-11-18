import java.io.*;
import java.util.*;

// memorization
// isSameChar[from][to]
// -1 -> 검사전
// 1 -> true
// 0 -> false
// return isSameChar[from][to] = palindrome(from+1,to-1)
public class Main {
	private static int N;
	private static int[][] isSameChar;
	private static int[] input;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		input = new int[N + 1];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= N; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		isSameChar = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			Arrays.fill(isSameChar[i], -1);
		}
		int M = Integer.parseInt(br.readLine());
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			sb.append(palindrome(s, e)).append("\n");
		}
		System.out.println(sb.toString());
	} // end of main

	private static int palindrome(int s, int e) {
		if (s >= e) {
			return isSameChar[s][e] = 1;
		}
		if (isSameChar[s][e] != -1)
			return isSameChar[s][e];
		if (input[s] != input[e]) {
			return isSameChar[s][e] = 0;
		} else {
			return isSameChar[s][e] = palindrome(s + 1, e - 1);
		}
	}
} // end of class
