import java.io.*;
import java.util.*;

public class BOJ_17143 {
	static int R, C, M;
	static int[] dr = { 0, -1, 1, 0, 0 };
	static int[] dc = { 0, 0, 0, 1, -1 };

	public static void main(String[] args) throws IOException {

		class Shark {
			int r, c, s, d, z;
			boolean alive = true;

			public Shark(int r, int c, int s, int d, int z) {
				this.r = r;
				this.c = c;
				this.s = s;
				this.d = d;
				this.z = z;
			}

		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		Shark[][] board = new Shark[R + 1][C + 1];

		PriorityQueue<Shark> maxSizeHeap = new PriorityQueue<>(new Comparator<Shark>() {
			@Override
			public int compare(Shark o1, Shark o2) {
				return (-1) * (o1.z - o2.z);
			}
		});

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			if(d==1||d==2) {
				s = s % ((R -1)*2);
			}else if(d==3||d==4){
				s = s % ((C -1)*2); 
			}
			board[r][c] = new Shark(r, c, s, d, z);
			maxSizeHeap.add(board[r][c]);
		}

		int fisher = 0;
		int getSharkSize = 0;
		while (true) {
			fisher++; // 이동
			if (fisher == C + 1) // 낚시왕이 가장 오른쪽가면 멈춤
				break;
			for (int i = 1; i <= R; i++) { // 상어잡기
				if (board[i][fisher] != null) {
					getSharkSize += board[i][fisher].z;
					board[i][fisher].alive = false;
					M--;
					break;
				}
			}
			if (M == 0)
				break;
			PriorityQueue<Shark> tmp = new PriorityQueue<>(new Comparator<Shark>() {
				@Override
				public int compare(Shark o1, Shark o2) {
					return (-1) * (o1.z - o2.z);
				}
			});
			board = new Shark[R + 1][C + 1];
			while (!maxSizeHeap.isEmpty()) { // 상어 이동
				Shark cur = maxSizeHeap.poll();
				if (!cur.alive)
					continue;
				int move = cur.s;
				while(move>0) {
					if(cur.d==1||cur.d==2) {
						if(cur.r==1) {
							cur.r+=1;
							cur.d=2;
						}else if(cur.r==R){
							cur.r-=1;
							cur.d=1;
						}else {
							cur.r += dr[cur.d];
						}
					}else{
						if(cur.c==1) {
							cur.c+=1;
							cur.d = 3;
						}else if(cur.c==C) {
							cur.c-=1;
							cur.d=4;
						}else {
							cur.c+=dc[cur.d];
						}
					}
					move--;
				}
				if (board[cur.r][cur.c] != null) {
					M--;
					continue;
				}
				board[cur.r][cur.c] = new Shark(cur.r, cur.c, cur.s, cur.d, cur.z);
				tmp.add(board[cur.r][cur.c]);
			}
			maxSizeHeap = tmp;
		}
		System.out.println(getSharkSize);
	} // end of main
} // end of class
