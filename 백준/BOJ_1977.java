import java.io.*;
import java.util.*;

public class BOJ_1977 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.valueOf(br.readLine());
		int N = Integer.valueOf(br.readLine());
		
		int minN = 0;
		int total = 0;
		for(int i=M;i<=N;i++) {
			if(isSquare(i)) {
				if(total == 0) {
					minN = i;
				}
				total+=i;
			}
		}
		System.out.println(total == 0 ? "-1" : total+"\n"+minN);
		
	} // end of main
	static boolean isSquare(double num) {
		double n = Math.pow(num, 0.5);
		if(n%1==0) {
			return true;
		}
		return false;
	}
} // end of class
