import java.io.*;
import java.util.*;

public class BOJ_2914 {
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.valueOf(st.nextToken());
		int l = Integer.valueOf(st.nextToken());
		
		System.out.println(A*(l-1)+1);
	}
}
