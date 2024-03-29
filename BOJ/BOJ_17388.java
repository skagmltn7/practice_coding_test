package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_17388 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] scores = new int[3];
		
		for(int i=0; i<3; i++) {
			scores[i] = Integer.valueOf(st.nextToken());
		}
		if(Arrays.stream(scores).sum() >= 100) {
			System.out.println("OK");
		}else {
			int minScore = Arrays.stream(scores).min().getAsInt();
			if(scores[0] == minScore) System.out.println("Soongsil");
			else if(scores[1]==minScore)System.out.println("Korea");
			else System.out.println("Hanyang");
			
		}
	}
}
