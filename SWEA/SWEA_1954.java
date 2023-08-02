import java.io.*;
import java.util.*;
 
public class SWEA_1954 {
 
    static int[] dy = { 0, 1, 0, -1 };
    static int[] dx = { 1, 0, -1, 0 };
    static int N;
    static int[][] board;
    static StringBuilder sb = new StringBuilder();
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(br.readLine());
 
        for (int tc = 1; tc <= T; tc++) {
            N = Integer.valueOf(br.readLine());
            board = new int[N][N];
            snail();
            buildString(tc);
        }
        System.out.println(sb);
 
    }
 
    static void snail() {
        Deque<Plot> queue = new ArrayDeque<>();
        queue.add(new Plot(0, 0, 1));
 
        int inx = 0;
        while (!queue.isEmpty()) {
            Plot nxt = queue.poll();
            if (nxt.num == (N * N)+1)
                return;
            board[nxt.y][nxt.x] = nxt.num;
            int ny = nxt.y + dy[inx];
            int nx = nxt.x + dx[inx];
            if (!(ny >= 0 && ny < N && nx >= 0 && nx < N && board[ny][nx] == 0)) {
                inx = (inx + 1) % 4;
                ny = nxt.y + dy[inx];
                nx = nxt.x + dx[inx];
            }
            queue.add(new Plot(ny, nx, nxt.num + 1));
        }
    }
     
    static void buildString(int tc) {
        sb.append("#"+tc+"\n");
        for(int i = 0; i<N;i++) {
            for(int j = 0; j<N;j++) {
                sb.append(board[i][j]+" ");
            }
            sb.append("\n");
        }
    }
}

//class Plot {
//	int y;
//	int x;
//	int num;
//	
//	public Plot(int y, int x, int num) {
//		this.y = y;
//		this.x = x;
//		this.num = num;
//	}
//}
 
