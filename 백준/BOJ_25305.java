import java.io.*;
import java.util.*;

public class BOJ_25305 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());

		Integer[] scores = new Integer[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			scores[i] = Integer.valueOf(st.nextToken());
		}
		
		Arrays.sort(scores,Collections.reverseOrder());
		System.out.println(scores[k-1]);
		
	} // end of main

} // end of class
