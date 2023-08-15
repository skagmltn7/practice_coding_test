import java.io.*;
import java.util.*;

public class Main {
	static int[] input;
	static long [] sum;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer  st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		input = new int[n+1];
		sum = new long[n+1];
		st = new StringTokenizer(br.readLine()," ");
		for(int i=1;i<=n;i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		totalSum();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int r1 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			sb.append(sum[r2]-sum[r1-1]+"\n");
		}
		System.out.println(sb);
	}
	static void totalSum() {
		sum[1] = input[1];
		for(int i=2;i<input.length;i++) {
			sum[i]=input[i]+sum[i-1];
		}
	}
}
