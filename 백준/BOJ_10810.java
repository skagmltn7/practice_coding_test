import java.io.*;
import java.util.*;

public class BOJ_10810 {
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		
		int[] buskets = new int[n+1];
		
		for(int inx=0;inx<m;inx++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.valueOf(st.nextToken());
			int j = Integer.valueOf(st.nextToken());
			int k = Integer.valueOf(st.nextToken());
			
			for(int b = i;b<=j;b++) {
				buskets[b] = k;
			}
		}
		
		for(int inx=1;inx<=n;inx++) {
			System.out.print(buskets[inx]+" ");
		}
	}
}
