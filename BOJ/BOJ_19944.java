package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_19944 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		
		if(m == 1 || m == 2) System.out.println("NEWBIE!");
		else {
			if(m <= n) System.out.println("OLDBIE!");
			else System.out.println("TLE!");
		}
	}
}
