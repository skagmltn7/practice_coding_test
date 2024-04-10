import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2563 {
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[][] board = new boolean[101][101];
		
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			draw(x,y,board);
		}
		System.out.println(cnt);
		
	} // end of main

	private static void draw(int x, int y, boolean[][] board) {
		for(int i=x;i<x+10;i++) {
			for(int j=y;j<y+10;j++) {
				if(board[i][j])continue;
				board[i][j]=true;
				cnt++;
			}
		}
	}
	
	
} // end of class
