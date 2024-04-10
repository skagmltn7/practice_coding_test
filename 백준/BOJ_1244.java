import java.io.*;
import java.util.*;

/**
 * 1. 아이디어 - 남자 -> 자기 배수의 반대 - 여자 -> 자기번호를 좌우가 대칭, 가장많은 스위치 포함
 */
public class BOJ_1244 {
	static boolean[] sw;
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		sw = new boolean[N + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			if (st.nextToken().equals("1")) {
				sw[i] = true;
			}
		}

		int student = Integer.valueOf(br.readLine());
		for (int i = 0; i < student; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.valueOf(st.nextToken());
			int index = Integer.valueOf(st.nextToken());
			if (s == 1) {
				changeMan(index);
			} else {
				changeWoman(index);
			}
		}

		printArr();

	}// end of main

	static void changeMan(int index) {
		for (int i = index; i <= N; i += index) {
			sw[i] = !sw[i];
		}
	}

	static void changeWoman(int index) {
		int[] range = symInx(index);
		for (int i = range[0]; i <= range[1]; i++) {
			sw[i] = !sw[i];
		}
	}

	static int[] symInx(int index) {
		int[] range = { index, index };
		while (true) {
			int ns = range[0] - 1;
			int ne = range[1] + 1;
			if (ns < 1 || ne > N)
				break;
			if (sw[ns] == sw[ne]) {
				range[0] = ns;
				range[1] = ne;
			} else {
				break;
			}
		}
		return range;
	}

	static void printArr() {
		for (int i = 1; i <= N; i++) {
			if (sw[i])
				System.out.print("1 ");
			else
				System.out.print("0 ");
			if(i%20==0)System.out.println();
		}
	}
} // end of class
