import java.io.*;
import java.util.*;

public class Main {
	static int[][] nums;
	static long[][] sum;
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		nums = new int[N+1][N+1];
		sum = new long[N+1][N+1];
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j=1;j<=N;j++) {
				nums[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		StringBuilder sb = new StringBuilder();
		int[] range = new int[4];
		totalSum();
		for(int i = 0;i<M;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0;j<4;j++) {
				range[j]= Integer.parseInt(st.nextToken());
			}
			
			sb.append(rangeSum(range)+"\n");
		}
		
		System.out.println(sb);
	}
	
	static void totalSum() {
		for(int i =1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				sum[i][j]= nums[i][j]+sum[i-1][j]+sum[i][j-1]-sum[i-1][j-1];
			}
		}
	}
	
	static long rangeSum(int[] range) {
		/*
		 * range = {x1, y1, x2, y2};
		 */
		return sum[range[2]][range[3]] - sum[range[2]][range[1]-1] - sum[range[0]-1][range[3]] + sum[range[0]-1][range[1]-1];
	}
	
}
