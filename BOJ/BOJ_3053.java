import java.io.*;
import java.util.*;

public class BOJ_3053 {
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.valueOf(br.readLine());
		System.out.printf("%.6f\n",Math.PI*R*R);
		System.out.printf("%.6f\n",(double)2*R*R);
	}
}
