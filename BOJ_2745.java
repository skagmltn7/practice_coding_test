import java.io.*;
import java.util.*;

public class BOJ_2745 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String N = st.nextToken();
		int B = Integer.valueOf(st.nextToken());
		
		System.out.println(b2Dec(N,B));
	} // end of main

	static int b2Dec(String N, int B) {
		int res = 0;
		for (int i = 0; i < N.length(); i++) {
			char tmp = N.charAt(i);
			if (tmp >= 'A') {
				res += Math.pow(B, N.length() - 1 - i) * (tmp - 'A' + 10);
			} else {
				res += Math.pow(B, N.length() - 1 - i) * (tmp-'0');
			}
		}
		return res;
	}
} // end of class
