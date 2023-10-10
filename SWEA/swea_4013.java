import java.io.*;
import java.util.StringTokenizer;


/**
 * output: 자석 회전시킨 후 빨간화살표위치의 총 점수
 * 1. 아이디어
 * 	- 톱니바퀴 : array, 빨간색 화살표 arary
 * 	- 톱니바퀴 돌리기
 * 		- 반시계방향 
 * 			빨간색 화살표 -1
 * 			< 0 이면 7
 * 		- 시계방향 빨간색화살표 +1
 * 			>= 8 이면 0
 * 	- 인접 톱니바퀴 검사
 * 		- ^ == 1면 돌기
 * 		- 왼쪽 톱니바퀴
 * 			빨간색 화살표 -2 < 0
 * 			+ 8
 * 		- 오른쪽톱니바퀴
 * 			빨간색 화살표 +2 > 8
 * 			% 8
 * 	- 다음으로 넘어가기
 * */
public class Solution {
	private static boolean[][] gears;
	private static int[] target;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int K = Integer.parseInt(br.readLine());
			gears = new boolean[5][8];
			target = new int[5];
			for (int i = 1; i <= 4; i++) {
				String str = br.readLine();
				for (int j = 0, inx = 0; j < 8; j++, inx+=2) {
					gears[i][j] = str.charAt(inx)-'0'==0?false:true;					
				}
			}
			for (int i = 0; i < K; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine()," ");
				int num = Integer.parseInt(st.nextToken());
				int dir= Integer.parseInt(st.nextToken());
				spinGear(num,dir);
			}
			int ans = 0;
			for (int i = 1; i <= 4; i++) {
				ans += gears[i][target[i]]?Math.pow(2,i-1):0;
			}
			sb.append("#").append(tc).append(" ").append(ans).append("\n");
		}
		System.out.println(sb.toString());
	} // end of main

	private static void spinGear(int num, int dir) {
		// 왼쪽 인접 톱니바퀴 검사
		int d = dir;
		int i = num;
		while (i>1) {
			int lchk = LeftChk(target[i]-2);
			int rchk = RightChk(target[i-1]+2);
			if(!(gears[i][lchk]^gears[i-1][rchk])) break;// false면 같은 자성
			// true면 다른 자성이니까 톱니바퀴 돌리기
			i--;
		}
		for (int j = num-1; j >= i; j--) {
			d*=-1;
			rotate(j,d);
		}
		// 오른쪽 인접 톱니바퀴 검사
		d = dir;
		i = num;
		while (i<4) {
			int rchk = RightChk(target[i]+2);
			int lchk = LeftChk(target[i+1]-2);
			if(!(gears[i][rchk]^gears[i+1][lchk])) break;// false면 같은 자성
			// true면 다른 자성이니까 톱니바퀴 돌리기
			i++;
		}
		for (int j = num+1; j <= i; j++) {
			d*=-1;
			rotate(j,d);
		}
		// 해당 톱니바퀴 돌리기
		rotate(num,dir);
	}

	private static void rotate(int num, int dir) {
		target[num]-=dir;
		if(target[num]==-1) {
			target[num]=7;
		}else if(target[num]==8) {
			target[num]=0;
		}
	}

	private static int RightChk(int i) {
		return i>=8?i%8:i;
	}

	private static int LeftChk(int i) {
		return i<0?i+8:i;
	}
} // end of class
