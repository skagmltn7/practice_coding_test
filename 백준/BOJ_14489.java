package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_14489 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.valueOf(st.nextToken());
		long b = Long.valueOf(st.nextToken());
		long chicken = Long.valueOf(br.readLine());
		
		long budget = a + b;
		if(budget < 2*chicken) System.out.println(budget);
		else System.out.println(budget - 2*chicken);
	}
}
