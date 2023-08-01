import java.io.*;
import java.util.*;

public class BOJ_1100 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int res = 0;
		for(int i=0;i<8;i++) {
			String board = br.readLine();
			if(i%2==0) {
				res += cntHorses(board, 0);
			}else {
				res += cntHorses(board, 1);
			}
		}
		System.out.println(res);
	} // end of main
	static int cntHorses(String board, int start) {
		int cnt = 0;
		for(int i=start;i<8;i+=2) {
			if(board.charAt(i)=='F') cnt++;
		}
		return cnt;
	}
} // end of class
