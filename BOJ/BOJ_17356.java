package BOJ;
import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a  = Integer.valueOf(st.nextToken());
		int b  = Integer.valueOf(st.nextToken());
		double m = (b-a)/(float)400;
		double res = 1/(1+Math.pow(10, m));
		System.out.println(res);
	}
}
