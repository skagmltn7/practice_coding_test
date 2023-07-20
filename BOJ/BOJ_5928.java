package BOJ;
import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int testStartTime = 11 * 60*24 + 11 * 60 + 11;
		
		int d = Integer.valueOf(st.nextToken());
		int h = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		
		int endTime = d * 60*24 + h * 60 + m;
		int res = endTime - testStartTime;
		System.out.println(res >= 0? res:-1);
	}
}
