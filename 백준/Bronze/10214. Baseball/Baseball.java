import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int[] win = new int[2];
		for (int i = 0; i < T; i++) {
			for (int j = 0; j < 9; j++) {
				char[] play = br.readLine().toCharArray();
				win[0]+=play[0]-'0';
				win[1]+=play[2]-'0';
			}
			if(win[0]>win[1])sb.append("Yonsei\n");
			else if(win[0]<win[1])sb.append("Korea\n");
			else sb.append("Draw\n");
			Arrays.fill(win,0);
		}
		System.out.println(sb.toString());
	} // end of main
} // end of class